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
 * <p>Classe Java de escolaridade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="escolaridade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdescolaridade" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="deescolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escolaridade", propOrder = {
    "cdescolaridade",
    "deescolaridade"
})
public class Escolaridade {

    protected Short cdescolaridade;
    protected String deescolaridade;

    /**
     * Obtém o valor da propriedade cdescolaridade.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdescolaridade() {
        return cdescolaridade;
    }

    /**
     * Define o valor da propriedade cdescolaridade.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdescolaridade(Short value) {
        this.cdescolaridade = value;
    }

    /**
     * Obtém o valor da propriedade deescolaridade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeescolaridade() {
        return deescolaridade;
    }

    /**
     * Define o valor da propriedade deescolaridade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeescolaridade(String value) {
        this.deescolaridade = value;
    }

}
