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
 * <p>Classe Java de tipoEndosso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoEndosso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipoendosso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtipoendosso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEndosso", propOrder = {
    "cdtipoendosso",
    "nmtipoendosso"
})
public class TipoEndosso {

    protected Long cdtipoendosso;
    protected String nmtipoendosso;

    /**
     * Obtém o valor da propriedade cdtipoendosso.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoendosso() {
        return cdtipoendosso;
    }

    /**
     * Define o valor da propriedade cdtipoendosso.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoendosso(Long value) {
        this.cdtipoendosso = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoendosso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoendosso() {
        return nmtipoendosso;
    }

    /**
     * Define o valor da propriedade nmtipoendosso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoendosso(String value) {
        this.nmtipoendosso = value;
    }

}
