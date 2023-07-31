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
 * <p>Classe Java de getMotivosDeProtestoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getMotivosDeProtestoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="motivosDeProtesto" type="{http://www.tjsc.jus.br/selo}motivoProtesto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMotivosDeProtestoResponse", propOrder = {
    "motivosDeProtesto"
})
public class GetMotivosDeProtestoResponse {

    protected List<MotivoProtesto> motivosDeProtesto;

    /**
     * Gets the value of the motivosDeProtesto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motivosDeProtesto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotivosDeProtesto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MotivoProtesto }
     * 
     * 
     */
    public List<MotivoProtesto> getMotivosDeProtesto() {
        if (motivosDeProtesto == null) {
            motivosDeProtesto = new ArrayList<MotivoProtesto>();
        }
        return this.motivosDeProtesto;
    }

}
