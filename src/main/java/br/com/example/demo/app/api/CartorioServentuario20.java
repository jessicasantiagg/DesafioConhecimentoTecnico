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
 * <p>Classe Java de cartorioServentuario20 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cartorioServentuario20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdserventuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nmserventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorioServentuario20", propOrder = {
    "cdserventuario",
    "cdtiposerventuario",
    "nmserventuario",
    "nmtiposerventuario",
    "nucartorio"
})
public class CartorioServentuario20 {

    protected Integer cdserventuario;
    protected Integer cdtiposerventuario;
    protected String nmserventuario;
    protected String nmtiposerventuario;
    protected Integer nucartorio;

    /**
     * Obtém o valor da propriedade cdserventuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdserventuario() {
        return cdserventuario;
    }

    /**
     * Define o valor da propriedade cdserventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdserventuario(Integer value) {
        this.cdserventuario = value;
    }

    /**
     * Obtém o valor da propriedade cdtiposerventuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtiposerventuario() {
        return cdtiposerventuario;
    }

    /**
     * Define o valor da propriedade cdtiposerventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtiposerventuario(Integer value) {
        this.cdtiposerventuario = value;
    }

    /**
     * Obtém o valor da propriedade nmserventuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmserventuario() {
        return nmserventuario;
    }

    /**
     * Define o valor da propriedade nmserventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmserventuario(String value) {
        this.nmserventuario = value;
    }

    /**
     * Obtém o valor da propriedade nmtiposerventuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposerventuario() {
        return nmtiposerventuario;
    }

    /**
     * Define o valor da propriedade nmtiposerventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposerventuario(String value) {
        this.nmtiposerventuario = value;
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

}
