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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B780 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B780"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B781" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}B787"/&gt;
 *           &lt;element ref="{}B788"/&gt;
 *           &lt;element ref="{}B789"/&gt;
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
@XmlType(name = "B780", propOrder = {
    "b781",
    "b787",
    "b788",
    "b789"
})
public class B780 {

    @XmlElement(name = "B781")
    protected List<B781> b781;
    @XmlElement(name = "B787")
    protected B787 b787;
    @XmlElement(name = "B788")
    protected B788 b788;
    @XmlElement(name = "B789")
    protected B789 b789;

    /**
     * Gets the value of the b781 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the b781 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB781().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B781 }
     * 
     * 
     */
    public List<B781> getB781() {
        if (b781 == null) {
            b781 = new ArrayList<B781>();
        }
        return this.b781;
    }

    /**
     * Gets the value of the b787 property.
     * 
     * @return
     *     possible object is
     *     {@link B787 }
     *     
     */
    public B787 getB787() {
        return b787;
    }

    /**
     * Sets the value of the b787 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B787 }
     *     
     */
    public void setB787(B787 value) {
        this.b787 = value;
    }

    /**
     * Gets the value of the b788 property.
     * 
     * @return
     *     possible object is
     *     {@link B788 }
     *     
     */
    public B788 getB788() {
        return b788;
    }

    /**
     * Sets the value of the b788 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B788 }
     *     
     */
    public void setB788(B788 value) {
        this.b788 = value;
    }

    /**
     * Gets the value of the b789 property.
     * 
     * @return
     *     possible object is
     *     {@link B789 }
     *     
     */
    public B789 getB789() {
        return b789;
    }

    /**
     * Sets the value of the b789 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B789 }
     *     
     */
    public void setB789(B789 value) {
        this.b789 = value;
    }

}
