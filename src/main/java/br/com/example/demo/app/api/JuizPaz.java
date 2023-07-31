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
 * <p>Classe Java de juizPaz complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="juizPaz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdtpjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detpjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtfimexercicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtiniexercicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "juizPaz", propOrder = {
    "cdcomarca",
    "cdjuizdepaz",
    "cdtpjuizdepaz",
    "cpf",
    "detpjuizdepaz",
    "dtfimexercicio",
    "dtiniexercicio",
    "nome"
})
public class JuizPaz {

    protected Integer cdcomarca;
    protected Long cdjuizdepaz;
    protected Integer cdtpjuizdepaz;
    protected String cpf;
    protected String detpjuizdepaz;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtfimexercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtiniexercicio;
    protected String nome;

    /**
     * Obtém o valor da propriedade cdcomarca.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdcomarca() {
        return cdcomarca;
    }

    /**
     * Define o valor da propriedade cdcomarca.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdcomarca(Integer value) {
        this.cdcomarca = value;
    }

    /**
     * Obtém o valor da propriedade cdjuizdepaz.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdjuizdepaz() {
        return cdjuizdepaz;
    }

    /**
     * Define o valor da propriedade cdjuizdepaz.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdjuizdepaz(Long value) {
        this.cdjuizdepaz = value;
    }

    /**
     * Obtém o valor da propriedade cdtpjuizdepaz.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtpjuizdepaz() {
        return cdtpjuizdepaz;
    }

    /**
     * Define o valor da propriedade cdtpjuizdepaz.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtpjuizdepaz(Integer value) {
        this.cdtpjuizdepaz = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade detpjuizdepaz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpjuizdepaz() {
        return detpjuizdepaz;
    }

    /**
     * Define o valor da propriedade detpjuizdepaz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpjuizdepaz(String value) {
        this.detpjuizdepaz = value;
    }

    /**
     * Obtém o valor da propriedade dtfimexercicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtfimexercicio() {
        return dtfimexercicio;
    }

    /**
     * Define o valor da propriedade dtfimexercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtfimexercicio(XMLGregorianCalendar value) {
        this.dtfimexercicio = value;
    }

    /**
     * Obtém o valor da propriedade dtiniexercicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtiniexercicio() {
        return dtiniexercicio;
    }

    /**
     * Define o valor da propriedade dtiniexercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtiniexercicio(XMLGregorianCalendar value) {
        this.dtiniexercicio = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
