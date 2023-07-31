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
 * <p>Classe Java de estado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estado", propOrder = {
    "cdestado",
    "deestado"
})
public class Estado {

    protected String cdestado;
    protected String deestado;

    /**
     * Obtém o valor da propriedade cdestado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdestado() {
        return cdestado;
    }

    /**
     * Define o valor da propriedade cdestado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdestado(String value) {
        this.cdestado = value;
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

}
