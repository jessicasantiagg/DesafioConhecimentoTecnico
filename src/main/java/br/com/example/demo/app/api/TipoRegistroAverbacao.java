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
 * <p>Classe Java de tipoRegistroAverbacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoRegistroAverbacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRegistroAverbacao", propOrder = {
    "cdtiporegaverbacao",
    "nmtiporegaverbacao"
})
public class TipoRegistroAverbacao {

    protected String cdtiporegaverbacao;
    protected String nmtiporegaverbacao;

    /**
     * Obtém o valor da propriedade cdtiporegaverbacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtiporegaverbacao() {
        return cdtiporegaverbacao;
    }

    /**
     * Define o valor da propriedade cdtiporegaverbacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtiporegaverbacao(String value) {
        this.cdtiporegaverbacao = value;
    }

    /**
     * Obtém o valor da propriedade nmtiporegaverbacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiporegaverbacao() {
        return nmtiporegaverbacao;
    }

    /**
     * Define o valor da propriedade nmtiporegaverbacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiporegaverbacao(String value) {
        this.nmtiporegaverbacao = value;
    }

}
