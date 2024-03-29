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
 * <p>Java class for claims-statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="claims-statement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}heading" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}p" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claims-statement", propOrder = {
    "headingAndP"
})
public class ClaimsStatement {

    @XmlElements({
        @XmlElement(name = "heading", required = true, type = Heading.class),
        @XmlElement(name = "p", required = true, type = P.class)
    })
    protected List<Object> headingAndP;

    /**
     * Gets the value of the headingAndP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the headingAndP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadingAndP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Heading }
     * {@link P }
     * 
     * 
     */
    public List<Object> getHeadingAndP() {
        if (headingAndP == null) {
            headingAndP = new ArrayList<Object>();
        }
        return this.headingAndP;
    }

}
