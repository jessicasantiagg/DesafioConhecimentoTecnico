//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7-b41 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.07.30 às 09:41:22 PM BRT 
//


package br.com.example.demo.app.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de moeda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="moeda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmoeda" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="desimbolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtvigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flmoedabr" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="flvigente" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="nmmoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmmoedaplural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moeda", propOrder = {
    "cdmoeda",
    "desimbolo",
    "dtvigencia",
    "flmoedabr",
    "flvigente",
    "nmmoeda",
    "nmmoedaplural"
})
public class Moeda {

    protected Short cdmoeda;
    protected String desimbolo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtvigencia;
    protected short flmoedabr;
    protected short flvigente;
    protected String nmmoeda;
    protected String nmmoedaplural;

    /**
     * Obtém o valor da propriedade cdmoeda.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdmoeda() {
        return cdmoeda;
    }

    /**
     * Define o valor da propriedade cdmoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdmoeda(Short value) {
        this.cdmoeda = value;
    }

    /**
     * Obtém o valor da propriedade desimbolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesimbolo() {
        return desimbolo;
    }

    /**
     * Define o valor da propriedade desimbolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesimbolo(String value) {
        this.desimbolo = value;
    }

    /**
     * Obtém o valor da propriedade dtvigencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtvigencia() {
        return dtvigencia;
    }

    /**
     * Define o valor da propriedade dtvigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtvigencia(XMLGregorianCalendar value) {
        this.dtvigencia = value;
    }

    /**
     * Obtém o valor da propriedade flmoedabr.
     * 
     */
    public short getFlmoedabr() {
        return flmoedabr;
    }

    /**
     * Define o valor da propriedade flmoedabr.
     * 
     */
    public void setFlmoedabr(short value) {
        this.flmoedabr = value;
    }

    /**
     * Obtém o valor da propriedade flvigente.
     * 
     */
    public short getFlvigente() {
        return flvigente;
    }

    /**
     * Define o valor da propriedade flvigente.
     * 
     */
    public void setFlvigente(short value) {
        this.flvigente = value;
    }

    /**
     * Obtém o valor da propriedade nmmoeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmoeda() {
        return nmmoeda;
    }

    /**
     * Define o valor da propriedade nmmoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmoeda(String value) {
        this.nmmoeda = value;
    }

    /**
     * Obtém o valor da propriedade nmmoedaplural.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmoedaplural() {
        return nmmoedaplural;
    }

    /**
     * Define o valor da propriedade nmmoedaplural.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmoedaplural(String value) {
        this.nmmoedaplural = value;
    }

}
