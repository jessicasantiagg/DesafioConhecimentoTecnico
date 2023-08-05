package com.example.demo.app.webservice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
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
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.example.demo.app.api.EnteDeclaradoUtilidadePublicaEstadual;

@Service
public class DesafioService {

	@Autowired()
	private WebClient webClient;

	public SOAPEnvelope createEnvelope(SOAPPart soapPart) throws SOAPException {
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration("selo", "http://www.tjsc.jus.br/selo");
		return envelope;
	}

	public void createBodyGetEntesDeclaradosUtilidadePublicaEstadual(SOAPEnvelope envelope) throws SOAPException {
		SOAPBody soapBody = envelope.getBody();
		soapBody.addChildElement("getEntesDeclaradosUtilidadePublicaEstadual", "selo");
	}

	public String writeMessageSoapToString(SOAPMessage soapMessage) throws SOAPException, IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		soapMessage.writeTo(out);
		return new String(out.toByteArray(), Charset.forName("UTF-8"));
	}

	public String constructorSoapBodyRequest() throws SOAPException, IOException {
		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope envelope = createEnvelope(soapPart);
		createBodyGetEntesDeclaradosUtilidadePublicaEstadual(envelope);
		soapMessage.saveChanges();
		return writeMessageSoapToString(soapMessage);
	}

	public String requestWebService(String bodyValue) {
		String response = webClient.post()
				.uri(uriBuilder -> uriBuilder.scheme("https").host("selo.tjsc.jus.br").path("/selo_teste/SeloService")
						.build())
				.contentType(MediaType.TEXT_XML).bodyValue(bodyValue).retrieve().bodyToMono(String.class).block();
		return response;
	}

	public List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual() {
		try {
			String body = constructorSoapBodyRequest();
			String response = requestWebService(body);
			String[] data = response.split("\n");
			JSONObject jsonObject = XML.toJSONObject(data[5]);
			JSONArray jsonArray = jsonObject.getJSONObject("soap:Envelope").getJSONObject("soap:Body")
					.getJSONObject("ns2:getEntesDeclaradosUtilidadePublicaEstadualResponse")
					.getJSONArray("entesDeclaradosUtilidadePublicaEstadual");

			ObjectMapper objectMapper = new ObjectMapper();
			List<EnteDeclaradoUtilidadePublicaEstadual> enteDeclaradoUtilidadePublicaEstadualList = objectMapper
					.readValue(jsonArray.toString(), new TypeReference<List<EnteDeclaradoUtilidadePublicaEstadual>>() {
					});

			return enteDeclaradoUtilidadePublicaEstadualList;
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
