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
 * <p>Classe Java de cartorioLivro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cartorioLivro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdcartoriolivro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdtipoformalivro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdtipolivro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dtabertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtencerramento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nmtipoformalivro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtipolivro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nucartorioresponsavel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seqlivro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorioLivro", propOrder = {
    "cdcartoriolivro",
    "cdtipoformalivro",
    "cdtipolivro",
    "dtabertura",
    "dtencerramento",
    "nmtipoformalivro",
    "nmtipolivro",
    "nucartorio",
    "nucartorioresponsavel",
    "seqlivro"
})
public class CartorioLivro {

    protected Long cdcartoriolivro;
    protected Integer cdtipoformalivro;
    protected Integer cdtipolivro;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtabertura;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtencerramento;
    protected String nmtipoformalivro;
    protected String nmtipolivro;
    protected Integer nucartorio;
    protected Integer nucartorioresponsavel;
    protected String seqlivro;

    /**
     * Obtém o valor da propriedade cdcartoriolivro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdcartoriolivro() {
        return cdcartoriolivro;
    }

    /**
     * Define o valor da propriedade cdcartoriolivro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdcartoriolivro(Long value) {
        this.cdcartoriolivro = value;
    }

    /**
     * Obtém o valor da propriedade cdtipoformalivro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtipoformalivro() {
        return cdtipoformalivro;
    }

    /**
     * Define o valor da propriedade cdtipoformalivro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtipoformalivro(Integer value) {
        this.cdtipoformalivro = value;
    }

    /**
     * Obtém o valor da propriedade cdtipolivro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtipolivro() {
        return cdtipolivro;
    }

    /**
     * Define o valor da propriedade cdtipolivro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtipolivro(Integer value) {
        this.cdtipolivro = value;
    }

    /**
     * Obtém o valor da propriedade dtabertura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtabertura() {
        return dtabertura;
    }

    /**
     * Define o valor da propriedade dtabertura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtabertura(XMLGregorianCalendar value) {
        this.dtabertura = value;
    }

    /**
     * Obtém o valor da propriedade dtencerramento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtencerramento() {
        return dtencerramento;
    }

    /**
     * Define o valor da propriedade dtencerramento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtencerramento(XMLGregorianCalendar value) {
        this.dtencerramento = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoformalivro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoformalivro() {
        return nmtipoformalivro;
    }

    /**
     * Define o valor da propriedade nmtipoformalivro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoformalivro(String value) {
        this.nmtipoformalivro = value;
    }

    /**
     * Obtém o valor da propriedade nmtipolivro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipolivro() {
        return nmtipolivro;
    }

    /**
     * Define o valor da propriedade nmtipolivro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipolivro(String value) {
        this.nmtipolivro = value;
    }

    /**
     * Obtém o valor da propriedade nucartorio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNucartorio() {
        return nucartorio;
    }

    /**
     * Define o valor da propriedade nucartorio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNucartorio(Integer value) {
        this.nucartorio = value;
    }

    /**
     * Obtém o valor da propriedade nucartorioresponsavel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNucartorioresponsavel() {
        return nucartorioresponsavel;
    }

    /**
     * Define o valor da propriedade nucartorioresponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNucartorioresponsavel(Integer value) {
        this.nucartorioresponsavel = value;
    }

    /**
     * Obtém o valor da propriedade seqlivro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqlivro() {
        return seqlivro;
    }

    /**
     * Define o valor da propriedade seqlivro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqlivro(String value) {
        this.seqlivro = value;
    }

}
