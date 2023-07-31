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
 * <p>Classe Java de tipoCobranca20 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoCobranca20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipocobranca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dispositivolegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtipocobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCobranca20", propOrder = {
    "cdtipocobranca",
    "dispositivolegal",
    "nmtipocobranca"
})
public class TipoCobranca20 {

    protected Long cdtipocobranca;
    protected String dispositivolegal;
    protected String nmtipocobranca;

    /**
     * Obtém o valor da propriedade cdtipocobranca.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipocobranca() {
        return cdtipocobranca;
    }

    /**
     * Define o valor da propriedade cdtipocobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipocobranca(Long value) {
        this.cdtipocobranca = value;
    }

    /**
     * Obtém o valor da propriedade dispositivolegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositivolegal() {
        return dispositivolegal;
    }

    /**
     * Define o valor da propriedade dispositivolegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositivolegal(String value) {
        this.dispositivolegal = value;
    }

    /**
     * Obtém o valor da propriedade nmtipocobranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipocobranca() {
        return nmtipocobranca;
    }

    /**
     * Define o valor da propriedade nmtipocobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipocobranca(String value) {
        this.nmtipocobranca = value;
    }

}
