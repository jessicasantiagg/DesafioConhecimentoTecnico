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
 * <p>Classe Java de cartorio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cartorio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsbairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsendereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flsituacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nmcartorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nucnpjcpf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nufone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorio", propOrder = {
    "cdmunicipio",
    "deemail",
    "dsbairro",
    "dsendereco",
    "flsituacao",
    "nmcartorio",
    "nmtitular",
    "nucartorio",
    "nucnpjcpf",
    "nufone"
})
public class Cartorio {

    protected String cdmunicipio;
    protected String deemail;
    protected String dsbairro;
    protected String dsendereco;
    protected Integer flsituacao;
    protected String nmcartorio;
    protected String nmtitular;
    protected Integer nucartorio;
    protected Long nucnpjcpf;
    protected String nufone;

    /**
     * Obtém o valor da propriedade cdmunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdmunicipio() {
        return cdmunicipio;
    }

    /**
     * Define o valor da propriedade cdmunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdmunicipio(String value) {
        this.cdmunicipio = value;
    }

    /**
     * Obtém o valor da propriedade deemail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeemail() {
        return deemail;
    }

    /**
     * Define o valor da propriedade deemail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeemail(String value) {
        this.deemail = value;
    }

    /**
     * Obtém o valor da propriedade dsbairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsbairro() {
        return dsbairro;
    }

    /**
     * Define o valor da propriedade dsbairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsbairro(String value) {
        this.dsbairro = value;
    }

    /**
     * Obtém o valor da propriedade dsendereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsendereco() {
        return dsendereco;
    }

    /**
     * Define o valor da propriedade dsendereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsendereco(String value) {
        this.dsendereco = value;
    }

    /**
     * Obtém o valor da propriedade flsituacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlsituacao() {
        return flsituacao;
    }

    /**
     * Define o valor da propriedade flsituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlsituacao(Integer value) {
        this.flsituacao = value;
    }

    /**
     * Obtém o valor da propriedade nmcartorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmcartorio() {
        return nmcartorio;
    }

    /**
     * Define o valor da propriedade nmcartorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmcartorio(String value) {
        this.nmcartorio = value;
    }

    /**
     * Obtém o valor da propriedade nmtitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtitular() {
        return nmtitular;
    }

    /**
     * Define o valor da propriedade nmtitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtitular(String value) {
        this.nmtitular = value;
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
     * Obtém o valor da propriedade nucnpjcpf.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNucnpjcpf() {
        return nucnpjcpf;
    }

    /**
     * Define o valor da propriedade nucnpjcpf.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNucnpjcpf(Long value) {
        this.nucnpjcpf = value;
    }

    /**
     * Obtém o valor da propriedade nufone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNufone() {
        return nufone;
    }

    /**
     * Define o valor da propriedade nufone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNufone(String value) {
        this.nufone = value;
    }

}
