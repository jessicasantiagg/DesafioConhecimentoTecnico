package com.example.demo.app.auth;

import java.io.IOException;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.webservice.DesafioService;

@Service
public class AuthService {

	@Autowired
	private DesafioService desafioService;

	public String constructorSoapBodyRequest(String user, String pass) throws SOAPException, IOException {
		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope envelope = desafioService.createEnvelope(soapPart);
		createBodyAuth(envelope, user, pass);
		soapMessage.saveChanges();
		return desafioService.writeMessageSoapToString(soapMessage);
	}

	public void createBodyAuth(SOAPEnvelope envelope, String user, String pass)
			throws SOAPException {
		SOAPBody soapBody = envelope.getBody();
		SOAPElement soapBodyElem = soapBody.addChildElement("verificaTransmissao", "selo");
		SOAPElement userElem = soapBodyElem.addChildElement("user");
		userElem.addTextNode(user);
		SOAPElement passElem = soapBodyElem.addChildElement("pass");
		passElem.addTextNode(pass);
		SOAPElement messageIDtransmissaoElem = soapBodyElem.addChildElement("messageIDtransmissao");
		messageIDtransmissaoElem.addTextNode("");
	}

	public String verificaTransmissao(String user, String pass) {
		try {
			String body = constructorSoapBodyRequest(user, pass);
			return desafioService.requestWebService(body);
		} catch (SOAPException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Ocorreu um erro ao buscar dados");
		}
	}
}
