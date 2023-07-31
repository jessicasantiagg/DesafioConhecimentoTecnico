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
 * <p>Classe Java de banco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="banco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdbanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmbanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banco", propOrder = {
    "cdbanco",
    "nmbanco"
})
public class Banco {

    protected String cdbanco;
    protected String nmbanco;

    /**
     * Obtém o valor da propriedade cdbanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdbanco() {
        return cdbanco;
    }

    /**
     * Define o valor da propriedade cdbanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdbanco(String value) {
        this.cdbanco = value;
    }

    /**
     * Obtém o valor da propriedade nmbanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbanco() {
        return nmbanco;
    }

    /**
     * Define o valor da propriedade nmbanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbanco(String value) {
        this.nmbanco = value;
    }

}
