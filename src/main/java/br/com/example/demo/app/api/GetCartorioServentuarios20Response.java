//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7-b41 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.07.30 às 09:41:22 PM BRT 
//


package br.com.example.demo.app.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getCartorioServentuarios20Response complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getCartorioServentuarios20Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartorioServentuarios20" type="{http://www.tjsc.jus.br/selo}cartorioServentuario20" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCartorioServentuarios20Response", propOrder = {
    "cartorioServentuarios20"
})
public class GetCartorioServentuarios20Response {

    protected List<CartorioServentuario20> cartorioServentuarios20;

    /**
     * Gets the value of the cartorioServentuarios20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartorioServentuarios20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartorioServentuarios20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartorioServentuario20 }
     * 
     * 
     */
    public List<CartorioServentuario20> getCartorioServentuarios20() {
        if (cartorioServentuarios20 == null) {
            cartorioServentuarios20 = new ArrayList<CartorioServentuario20>();
        }
        return this.cartorioServentuarios20;
    }

}
