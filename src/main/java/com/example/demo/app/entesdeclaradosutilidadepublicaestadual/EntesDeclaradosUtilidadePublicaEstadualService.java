package com.example.demo.app.entesdeclaradosutilidadepublicaestadual;

import java.io.IOException;
import java.util.List;

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
		return list.stream().map(el -> new EntesDeclaradosUtilidadePublicaEstadualDTO(el.getCdentepub(), el.getLei(),
				el.getNomeEntidade())).toList();
	}

	public String getEntesDeclaradosUtilidadePublicaEstadual() {
		try {
			String body = constructorSoapBodyRequest();
			String response = desafioService.requestWebService(body);
			String[] data = response.split("\n");
			JSONObject jsonObject = XML.toJSONObject(data[5]);
			JSONArray jsonArray = jsonObject.getJSONObject("soap:Envelope").getJSONObject("soap:Body")
					.getJSONObject("ns2:getEntesDeclaradosUtilidadePublicaEstadualResponse")
					.getJSONArray("entesDeclaradosUtilidadePublicaEstadual");

			ObjectMapper objectMapper = new ObjectMapper();
			List<EnteDeclaradoUtilidadePublicaEstadual> enteDeclaradoUtilidadePublicaEstadualList = objectMapper
					.readValue(jsonArray.toString(), new TypeReference<List<EnteDeclaradoUtilidadePublicaEstadual>>() {
					});
			List<EntesDeclaradosUtilidadePublicaEstadualDTO> listDTO = entityToDto(
					enteDeclaradoUtilidadePublicaEstadualList);

			String entesJsonList = objectMapper.writeValueAsString(listDTO);
			return entesJsonList;
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
