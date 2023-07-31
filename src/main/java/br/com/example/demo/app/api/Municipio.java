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
 * <p>Classe Java de municipio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="municipio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmmunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipio", propOrder = {
    "cdmunicipio",
    "deestado",
    "nmmunicipio"
})
public class Municipio {

    protected Integer cdmunicipio;
    protected String deestado;
    protected String nmmunicipio;

    /**
     * Obtém o valor da propriedade cdmunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdmunicipio() {
        return cdmunicipio;
    }

    /**
     * Define o valor da propriedade cdmunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdmunicipio(Integer value) {
        this.cdmunicipio = value;
    }

    /**
     * Obtém o valor da propriedade deestado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestado() {
        return deestado;
    }

    /**
     * Define o valor da propriedade deestado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestado(String value) {
        this.deestado = value;
    }

    /**
     * Obtém o valor da propriedade nmmunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmunicipio() {
        return nmmunicipio;
    }

    /**
     * Define o valor da propriedade nmmunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmunicipio(String value) {
        this.nmmunicipio = value;
    }

}
