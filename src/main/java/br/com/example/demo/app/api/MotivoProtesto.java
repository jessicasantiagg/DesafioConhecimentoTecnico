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
 * <p>Classe Java de motivoProtesto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="motivoProtesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmotivoprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmmotivoprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoProtesto", propOrder = {
    "cdmotivoprotesto",
    "nmmotivoprotesto"
})
public class MotivoProtesto {

    protected Long cdmotivoprotesto;
    protected String nmmotivoprotesto;

    /**
     * Obtém o valor da propriedade cdmotivoprotesto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivoprotesto() {
        return cdmotivoprotesto;
    }

    /**
     * Define o valor da propriedade cdmotivoprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivoprotesto(Long value) {
        this.cdmotivoprotesto = value;
    }

    /**
     * Obtém o valor da propriedade nmmotivoprotesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivoprotesto() {
        return nmmotivoprotesto;
    }

    /**
     * Define o valor da propriedade nmmotivoprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivoprotesto(String value) {
        this.nmmotivoprotesto = value;
    }

}
