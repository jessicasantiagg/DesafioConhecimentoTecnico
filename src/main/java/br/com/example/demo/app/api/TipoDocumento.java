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
 * <p>Classe Java de tipoDocumento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtpdocumento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="detpdocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detpdocumentoabrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = {
    "cdtpdocumento",
    "detpdocumento",
    "detpdocumentoabrev"
})
public class TipoDocumento {

    protected Short cdtpdocumento;
    protected String detpdocumento;
    protected String detpdocumentoabrev;

    /**
     * Obtém o valor da propriedade cdtpdocumento.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtpdocumento() {
        return cdtpdocumento;
    }

    /**
     * Define o valor da propriedade cdtpdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtpdocumento(Short value) {
        this.cdtpdocumento = value;
    }

    /**
     * Obtém o valor da propriedade detpdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpdocumento() {
        return detpdocumento;
    }

    /**
     * Define o valor da propriedade detpdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpdocumento(String value) {
        this.detpdocumento = value;
    }

    /**
     * Obtém o valor da propriedade detpdocumentoabrev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpdocumentoabrev() {
        return detpdocumentoabrev;
    }

    /**
     * Define o valor da propriedade detpdocumentoabrev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpdocumentoabrev(String value) {
        this.detpdocumentoabrev = value;
    }

}
