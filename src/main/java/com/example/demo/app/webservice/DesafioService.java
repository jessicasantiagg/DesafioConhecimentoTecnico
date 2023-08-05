package com.example.demo.app.webservice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class DesafioService {

	@Autowired()
	private WebClient webClient;

	public SOAPEnvelope createEnvelope(SOAPPart soapPart) throws SOAPException {
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration("selo", "http://www.tjsc.jus.br/selo");
		return envelope;
	}

	public String writeMessageSoapToString(SOAPMessage soapMessage) throws SOAPException, IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		soapMessage.writeTo(out);
		return new String(out.toByteArray(), Charset.forName("UTF-8"));
	}

	public String requestWebService(String bodyValue) {
		Mono<ByteArrayResource> responseBody = webClient
				.post().uri(uriBuilder -> uriBuilder.scheme("https").host("selo.tjsc.jus.br")
						.path("/selo_teste/SeloService").build())
				.bodyValue(bodyValue).retrieve().bodyToMono(ByteArrayResource.class);

		return new String(responseBody.block().getByteArray(), Charset.forName("ISO-8859-2"));
	}

}
