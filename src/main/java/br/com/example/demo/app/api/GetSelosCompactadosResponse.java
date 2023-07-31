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
 * <p>Classe Java de getSelosCompactadosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSelosCompactadosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selosCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosCompactadosResponse", propOrder = {
    "selosCompactados"
})
public class GetSelosCompactadosResponse {

    protected byte[] selosCompactados;

    /**
     * Obtém o valor da propriedade selosCompactados.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosCompactados() {
        return selosCompactados;
    }

    /**
     * Define o valor da propriedade selosCompactados.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosCompactados(byte[] value) {
        this.selosCompactados = value;
    }

}
