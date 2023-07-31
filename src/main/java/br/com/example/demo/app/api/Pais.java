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
 * <p>Classe Java de pais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdpais" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="denacionalidadefeminina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denacionalidademasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pais", propOrder = {
    "cdpais",
    "denacionalidadefeminina",
    "denacionalidademasc",
    "depais"
})
public class Pais {

    protected Short cdpais;
    protected String denacionalidadefeminina;
    protected String denacionalidademasc;
    protected String depais;

    /**
     * Obtém o valor da propriedade cdpais.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdpais() {
        return cdpais;
    }

    /**
     * Define o valor da propriedade cdpais.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdpais(Short value) {
        this.cdpais = value;
    }

    /**
     * Obtém o valor da propriedade denacionalidadefeminina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenacionalidadefeminina() {
        return denacionalidadefeminina;
    }

    /**
     * Define o valor da propriedade denacionalidadefeminina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenacionalidadefeminina(String value) {
        this.denacionalidadefeminina = value;
    }

    /**
     * Obtém o valor da propriedade denacionalidademasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenacionalidademasc() {
        return denacionalidademasc;
    }

    /**
     * Define o valor da propriedade denacionalidademasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenacionalidademasc(String value) {
        this.denacionalidademasc = value;
    }

    /**
     * Obtém o valor da propriedade depais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepais() {
        return depais;
    }

    /**
     * Define o valor da propriedade depais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepais(String value) {
        this.depais = value;
    }

}
