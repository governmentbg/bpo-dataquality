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
 * <p>Java class for B520 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B520"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B527"/&gt;
 *         &lt;element ref="{}B526" minOccurs="0"/&gt;
 *         &lt;element ref="{}B521"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}B522"/&gt;
 *           &lt;element ref="{}B523"/&gt;
 *           &lt;element ref="{}B524"/&gt;
 *           &lt;element ref="{}B525"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B520", propOrder = {
    "b527",
    "b526",
    "b521",
    "b522OrB523OrB524"
})
public class B520 {

    @XmlElement(name = "B527", required = true)
    protected B527 b527;
    @XmlElement(name = "B526")
    protected B526 b526;
    @XmlElement(name = "B521", required = true)
    protected B521 b521;
    @XmlElements({
        @XmlElement(name = "B522", type = B522 .class),
        @XmlElement(name = "B523", type = B523 .class),
        @XmlElement(name = "B524", type = B524 .class),
        @XmlElement(name = "B525", type = B525 .class)
    })
    protected List<Object> b522OrB523OrB524;

    /**
     * Gets the value of the b527 property.
     * 
     * @return
     *     possible object is
     *     {@link B527 }
     *     
     */
    public B527 getB527() {
        return b527;
    }

    /**
     * Sets the value of the b527 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B527 }
     *     
     */
    public void setB527(B527 value) {
        this.b527 = value;
    }

    /**
     * Gets the value of the b526 property.
     * 
     * @return
     *     possible object is
     *     {@link B526 }
     *     
     */
    public B526 getB526() {
        return b526;
    }

    /**
     * Sets the value of the b526 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B526 }
     *     
     */
    public void setB526(B526 value) {
        this.b526 = value;
    }

    /**
     * Gets the value of the b521 property.
     * 
     * @return
     *     possible object is
     *     {@link B521 }
     *     
     */
    public B521 getB521() {
        return b521;
    }

    /**
     * Sets the value of the b521 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B521 }
     *     
     */
    public void setB521(B521 value) {
        this.b521 = value;
    }

    /**
     * Gets the value of the b522OrB523OrB524 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the b522OrB523OrB524 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB522OrB523OrB524().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B522 }
     * {@link B523 }
     * {@link B524 }
     * {@link B525 }
     * 
     * 
     */
    public List<Object> getB522OrB523OrB524() {
        if (b522OrB523OrB524 == null) {
            b522OrB523OrB524 = new ArrayList<Object>();
        }
        return this.b522OrB523OrB524;
    }

}