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
 * <p>Classe Java de tipoProcuracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoProcuracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoProcuracao", propOrder = {
    "cdtipoprocuracao",
    "nmtipoprocuracao"
})
public class TipoProcuracao {

    protected Long cdtipoprocuracao;
    protected String nmtipoprocuracao;

    /**
     * Obtém o valor da propriedade cdtipoprocuracao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoprocuracao() {
        return cdtipoprocuracao;
    }

    /**
     * Define o valor da propriedade cdtipoprocuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoprocuracao(Long value) {
        this.cdtipoprocuracao = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoprocuracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoprocuracao() {
        return nmtipoprocuracao;
    }

    /**
     * Define o valor da propriedade nmtipoprocuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoprocuracao(String value) {
        this.nmtipoprocuracao = value;
    }

}
