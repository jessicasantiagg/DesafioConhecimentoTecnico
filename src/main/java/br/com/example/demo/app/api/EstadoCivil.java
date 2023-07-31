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
 * <p>Classe Java de estadoCivil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estadoCivil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdestadocivil" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="deestadocivilfem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deestadocivilmasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadoCivil", propOrder = {
    "cdestadocivil",
    "deestadocivilfem",
    "deestadocivilmasc"
})
public class EstadoCivil {

    protected Short cdestadocivil;
    protected String deestadocivilfem;
    protected String deestadocivilmasc;

    /**
     * Obtém o valor da propriedade cdestadocivil.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdestadocivil() {
        return cdestadocivil;
    }

    /**
     * Define o valor da propriedade cdestadocivil.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdestadocivil(Short value) {
        this.cdestadocivil = value;
    }

    /**
     * Obtém o valor da propriedade deestadocivilfem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestadocivilfem() {
        return deestadocivilfem;
    }

    /**
     * Define o valor da propriedade deestadocivilfem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestadocivilfem(String value) {
        this.deestadocivilfem = value;
    }

    /**
     * Obtém o valor da propriedade deestadocivilmasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestadocivilmasc() {
        return deestadocivilmasc;
    }

    /**
     * Define o valor da propriedade deestadocivilmasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestadocivilmasc(String value) {
        this.deestadocivilmasc = value;
    }

}
