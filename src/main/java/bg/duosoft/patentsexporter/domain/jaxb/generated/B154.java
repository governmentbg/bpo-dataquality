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
 * <p>Java class for B154 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B154"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}B1541"/&gt;
 *         &lt;element ref="{}B1542"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B154", propOrder = {
    "b1541AndB1542"
})
public class B154 {

    @XmlElements({
        @XmlElement(name = "B1541", required = true, type = B1541 .class),
        @XmlElement(name = "B1542", required = true, type = B1542 .class)
    })
    protected List<Object> b1541AndB1542;

    /**
     * Gets the value of the b1541AndB1542 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the b1541AndB1542 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB1541AndB1542().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B1541 }
     * {@link B1542 }
     * 
     * 
     */
    public List<Object> getB1541AndB1542() {
        if (b1541AndB1542 == null) {
            b1541AndB1542 = new ArrayList<Object>();
        }
        return this.b1541AndB1542;
    }

}
