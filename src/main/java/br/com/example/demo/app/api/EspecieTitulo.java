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
 * <p>Classe Java de especieTitulo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="especieTitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdespecietitulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmespecietitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sgespecietitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "especieTitulo", propOrder = {
    "cdespecietitulo",
    "nmespecietitulo",
    "sgespecietitulo"
})
public class EspecieTitulo {

    protected Short cdespecietitulo;
    protected String nmespecietitulo;
    protected String sgespecietitulo;

    /**
     * Obtém o valor da propriedade cdespecietitulo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdespecietitulo() {
        return cdespecietitulo;
    }

    /**
     * Define o valor da propriedade cdespecietitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdespecietitulo(Short value) {
        this.cdespecietitulo = value;
    }

    /**
     * Obtém o valor da propriedade nmespecietitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmespecietitulo() {
        return nmespecietitulo;
    }

    /**
     * Define o valor da propriedade nmespecietitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmespecietitulo(String value) {
        this.nmespecietitulo = value;
    }

    /**
     * Obtém o valor da propriedade sgespecietitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgespecietitulo() {
        return sgespecietitulo;
    }

    /**
     * Define o valor da propriedade sgespecietitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgespecietitulo(String value) {
        this.sgespecietitulo = value;
    }

}
