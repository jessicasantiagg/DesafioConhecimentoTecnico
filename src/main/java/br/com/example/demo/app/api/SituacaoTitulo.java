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
 * <p>Classe Java de situacaoTitulo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="situacaoTitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdsituacaotitulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmsituacaotitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "situacaoTitulo", propOrder = {
    "cdsituacaotitulo",
    "nmsituacaotitulo"
})
public class SituacaoTitulo {

    protected Short cdsituacaotitulo;
    protected String nmsituacaotitulo;

    /**
     * Obtém o valor da propriedade cdsituacaotitulo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdsituacaotitulo() {
        return cdsituacaotitulo;
    }

    /**
     * Define o valor da propriedade cdsituacaotitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdsituacaotitulo(Short value) {
        this.cdsituacaotitulo = value;
    }

    /**
     * Obtém o valor da propriedade nmsituacaotitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsituacaotitulo() {
        return nmsituacaotitulo;
    }

    /**
     * Define o valor da propriedade nmsituacaotitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsituacaotitulo(String value) {
        this.nmsituacaotitulo = value;
    }

}
