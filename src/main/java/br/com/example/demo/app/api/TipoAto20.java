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
 * <p>Classe Java de tipoAto20 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoAto20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipoato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="flativo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="modeloscompativeis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtipoato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAto20", propOrder = {
    "cdtipoato",
    "flativo",
    "modeloscompativeis",
    "nmtipoato"
})
public class TipoAto20 {

    protected Long cdtipoato;
    protected short flativo;
    protected String modeloscompativeis;
    protected String nmtipoato;

    /**
     * Obtém o valor da propriedade cdtipoato.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoato() {
        return cdtipoato;
    }

    /**
     * Define o valor da propriedade cdtipoato.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoato(Long value) {
        this.cdtipoato = value;
    }

    /**
     * Obtém o valor da propriedade flativo.
     * 
     */
    public short getFlativo() {
        return flativo;
    }

    /**
     * Define o valor da propriedade flativo.
     * 
     */
    public void setFlativo(short value) {
        this.flativo = value;
    }

    /**
     * Obtém o valor da propriedade modeloscompativeis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloscompativeis() {
        return modeloscompativeis;
    }

    /**
     * Define o valor da propriedade modeloscompativeis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloscompativeis(String value) {
        this.modeloscompativeis = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoato() {
        return nmtipoato;
    }

    /**
     * Define o valor da propriedade nmtipoato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoato(String value) {
        this.nmtipoato = value;
    }

}
