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
 * <p>Classe Java de etnia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="etnia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdetnia" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="deetnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etnia", propOrder = {
    "cdetnia",
    "deetnia"
})
public class Etnia {

    protected Short cdetnia;
    protected String deetnia;

    /**
     * Obtém o valor da propriedade cdetnia.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdetnia() {
        return cdetnia;
    }

    /**
     * Define o valor da propriedade cdetnia.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdetnia(Short value) {
        this.cdetnia = value;
    }

    /**
     * Obtém o valor da propriedade deetnia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeetnia() {
        return deetnia;
    }

    /**
     * Define o valor da propriedade deetnia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeetnia(String value) {
        this.deetnia = value;
    }

}
