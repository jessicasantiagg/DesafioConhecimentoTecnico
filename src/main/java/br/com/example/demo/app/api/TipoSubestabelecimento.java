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
 * <p>Classe Java de tipoSubestabelecimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoSubestabelecimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSubestabelecimento", propOrder = {
    "cdtiposubestabelecimento",
    "nmtiposubestabelecimento"
})
public class TipoSubestabelecimento {

    protected Long cdtiposubestabelecimento;
    protected String nmtiposubestabelecimento;

    /**
     * Obtém o valor da propriedade cdtiposubestabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtiposubestabelecimento() {
        return cdtiposubestabelecimento;
    }

    /**
     * Define o valor da propriedade cdtiposubestabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtiposubestabelecimento(Long value) {
        this.cdtiposubestabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade nmtiposubestabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposubestabelecimento() {
        return nmtiposubestabelecimento;
    }

    /**
     * Define o valor da propriedade nmtiposubestabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposubestabelecimento(String value) {
        this.nmtiposubestabelecimento = value;
    }

}
