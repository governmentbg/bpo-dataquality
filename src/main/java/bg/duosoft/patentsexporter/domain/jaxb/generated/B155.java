//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B155 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B155"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}B1551"/&gt;
 *         &lt;element ref="{}B1552"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B155", propOrder = {
    "b1551AndB1552"
})
public class B155 {

    @XmlElements({
        @XmlElement(name = "B1551", required = true, type = B1551 .class),
        @XmlElement(name = "B1552", required = true, type = B1552 .class)
    })
    protected List<Object> b1551AndB1552;

    /**
     * Gets the value of the b1551AndB1552 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the b1551AndB1552 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB1551AndB1552().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B1551 }
     * {@link B1552 }
     * 
     * 
     */
    public List<Object> getB1551AndB1552() {
        if (b1551AndB1552 == null) {
            b1551AndB1552 = new ArrayList<Object>();
        }
        return this.b1551AndB1552;
    }

}