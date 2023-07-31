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
 * <p>Classe Java de tipoTestamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoTestamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipotestamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtipotestamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTestamento", propOrder = {
    "cdtipotestamento",
    "nmtipotestamento"
})
public class TipoTestamento {

    protected Long cdtipotestamento;
    protected String nmtipotestamento;

    /**
     * Obtém o valor da propriedade cdtipotestamento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipotestamento() {
        return cdtipotestamento;
    }

    /**
     * Define o valor da propriedade cdtipotestamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipotestamento(Long value) {
        this.cdtipotestamento = value;
    }

    /**
     * Obtém o valor da propriedade nmtipotestamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipotestamento() {
        return nmtipotestamento;
    }

    /**
     * Define o valor da propriedade nmtipotestamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipotestamento(String value) {
        this.nmtipotestamento = value;
    }

}
