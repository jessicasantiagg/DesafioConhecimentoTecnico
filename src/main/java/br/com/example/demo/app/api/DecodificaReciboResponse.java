//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7-b41 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.07.30 às 09:41:22 PM BRT 
//


package br.com.example.demo.app.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de decodificaReciboResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="decodificaReciboResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reciboDecodificado" type="{http://www.tjsc.jus.br/selo}reciboProtocolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decodificaReciboResponse", propOrder = {
    "reciboDecodificado"
})
public class DecodificaReciboResponse {

    protected ReciboProtocolo reciboDecodificado;

    /**
     * Obtém o valor da propriedade reciboDecodificado.
     * 
     * @return
     *     possible object is
     *     {@link ReciboProtocolo }
     *     
     */
    public ReciboProtocolo getReciboDecodificado() {
        return reciboDecodificado;
    }

    /**
     * Define o valor da propriedade reciboDecodificado.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboProtocolo }
     *     
     */
    public void setReciboDecodificado(ReciboProtocolo value) {
        this.reciboDecodificado = value;
    }

}
