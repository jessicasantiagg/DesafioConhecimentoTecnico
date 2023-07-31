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
 * <p>Classe Java de tipoServentuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoServentuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoServentuario", propOrder = {
    "cdtiposerventuario",
    "nmtiposerventuario"
})
public class TipoServentuario {

    protected Short cdtiposerventuario;
    protected String nmtiposerventuario;

    /**
     * Obtém o valor da propriedade cdtiposerventuario.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtiposerventuario() {
        return cdtiposerventuario;
    }

    /**
     * Define o valor da propriedade cdtiposerventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtiposerventuario(Short value) {
        this.cdtiposerventuario = value;
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

}
