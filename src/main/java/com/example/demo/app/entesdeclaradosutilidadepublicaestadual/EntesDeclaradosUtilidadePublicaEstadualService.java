package com.example.demo.app.entesdeclaradosutilidadepublicaestadual;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.webservice.DesafioService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.example.demo.app.api.EnteDeclaradoUtilidadePublicaEstadual;

@Service
public class EntesDeclaradosUtilidadePublicaEstadualService {

	@Autowired
	private DesafioService desafioService;

	public String constructorSoapBodyRequest() throws SOAPException, IOException {
		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope envelope = desafioService.createEnvelope(soapPart);
		createBodyGetEntesDeclaradosUtilidadePublicaEstadual(envelope);
		soapMessage.saveChanges();
		return desafioService.writeMessageSoapToString(soapMessage);
	}

	public void createBodyGetEntesDeclaradosUtilidadePublicaEstadual(SOAPEnvelope envelope) throws SOAPException {
		SOAPBody soapBody = envelope.getBody();
		soapBody.addChildElement("getEntesDeclaradosUtilidadePublicaEstadual", "selo");
	}

	public List<EntesDeclaradosUtilidadePublicaEstadualDTO> entityToDto(
			List<EnteDeclaradoUtilidadePublicaEstadual> list) {
		List<EntesDeclaradosUtilidadePublicaEstadualDTO> listDTO = new ArrayList<>();
		for (int i = 1; i < list.size(); i++) {
			EnteDeclaradoUtilidadePublicaEstadual el = list.get(i - 1);
			listDTO.add(new EntesDeclaradosUtilidadePublicaEstadualDTO(el.getCdentepub(), el.getLei(),
					el.getNomeEntidade(), (long) i));
		}
		return listDTO;
	}

	public String dtoToJson(List<EntesDeclaradosUtilidadePublicaEstadualDTO> listDto) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(listDto);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException("Ocorreu um erro gerar JSON");
		}
	}

	public String getEntesDeclaradosUtilidadePublicaEstadualJSON() {
		List<EnteDeclaradoUtilidadePublicaEstadual> list = getEntesDeclaradosUtilidadePublicaEstadual();
		List<EntesDeclaradosUtilidadePublicaEstadualDTO> listDTO = entityToDto(list);
		return dtoToJson(listDTO);
	}

	public List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual() {
		try {
			String body = constructorSoapBodyRequest();
			String response = desafioService.requestWebService(body);
			String[] data = response.split("\n");
			JSONObject jsonObject = XML.toJSONObject(data[5]);
			JSONArray jsonArray = jsonObject.getJSONObject("soap:Envelope").getJSONObject("soap:Body")
					.getJSONObject("ns2:getEntesDeclaradosUtilidadePublicaEstadualResponse")
					.getJSONArray("entesDeclaradosUtilidadePublicaEstadual");

			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(jsonArray.toString(),
					new TypeReference<List<EnteDeclaradoUtilidadePublicaEstadual>>() {
					});

		} catch (SOAPException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Ocorreu ao buscar dados");
		}
	}

	public String filterByNomeEntidade(String search) {
		List<EnteDeclaradoUtilidadePublicaEstadual> originalList = getEntesDeclaradosUtilidadePublicaEstadual();
		List<EnteDeclaradoUtilidadePublicaEstadual> filteredList = originalList.stream()
				.filter(el -> el.getNomeEntidade().contains(search)).collect(Collectors.toList());
		List<EntesDeclaradosUtilidadePublicaEstadualDTO> listDTO = entityToDto(filteredList);
		return dtoToJson(listDTO);
	}

	public String filterById(Long id) {
		List<EnteDeclaradoUtilidadePublicaEstadual> originalList = getEntesDeclaradosUtilidadePublicaEstadual();
		List<EntesDeclaradosUtilidadePublicaEstadualDTO> listDTO = entityToDto(originalList);

		List<EntesDeclaradosUtilidadePublicaEstadualDTO> filteredList = listDTO.stream()
				.filter(el -> el.getId().equals(id)).collect(Collectors.toList());
		return dtoToJson(filteredList);
	}

	public String getWithPagination(int offset, int limit) {
		List<EnteDeclaradoUtilidadePublicaEstadual> originalList = getEntesDeclaradosUtilidadePublicaEstadual();
		List<EnteDeclaradoUtilidadePublicaEstadual> filteredList = originalList.stream().skip(offset).limit(limit)
				.collect(Collectors.toList());
		return dtoToJson(entityToDto(filteredList));
	}
}
