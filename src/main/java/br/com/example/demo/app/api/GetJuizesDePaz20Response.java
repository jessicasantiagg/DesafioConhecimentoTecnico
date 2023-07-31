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
 * <p>Classe Java de getJuizesDePaz20Response complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getJuizesDePaz20Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="juizesDePaz20" type="{http://www.tjsc.jus.br/selo}juizPaz20" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJuizesDePaz20Response", propOrder = {
    "juizesDePaz20"
})
public class GetJuizesDePaz20Response {

    protected List<JuizPaz20> juizesDePaz20;

    /**
     * Gets the value of the juizesDePaz20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the juizesDePaz20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJuizesDePaz20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JuizPaz20 }
     * 
     * 
     */
    public List<JuizPaz20> getJuizesDePaz20() {
        if (juizesDePaz20 == null) {
            juizesDePaz20 = new ArrayList<JuizPaz20>();
        }
        return this.juizesDePaz20;
    }

}
