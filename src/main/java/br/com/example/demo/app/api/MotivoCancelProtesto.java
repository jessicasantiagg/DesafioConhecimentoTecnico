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
 * <p>Classe Java de motivoCancelProtesto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="motivoCancelProtesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoCancelProtesto", propOrder = {
    "cdmotivocancelprotesto",
    "nmmotivocancelprotesto"
})
public class MotivoCancelProtesto {

    protected Long cdmotivocancelprotesto;
    protected String nmmotivocancelprotesto;

    /**
     * Obtém o valor da propriedade cdmotivocancelprotesto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivocancelprotesto() {
        return cdmotivocancelprotesto;
    }

    /**
     * Define o valor da propriedade cdmotivocancelprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivocancelprotesto(Long value) {
        this.cdmotivocancelprotesto = value;
    }

    /**
     * Obtém o valor da propriedade nmmotivocancelprotesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivocancelprotesto() {
        return nmmotivocancelprotesto;
    }

    /**
     * Define o valor da propriedade nmmotivocancelprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivocancelprotesto(String value) {
        this.nmmotivocancelprotesto = value;
    }

}
