//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for B860 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B860"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B861"/&gt;
 *         &lt;element ref="{}B862" minOccurs="0"/&gt;
 *         &lt;element ref="{}B863" minOccurs="0"/&gt;
 *         &lt;element ref="{}B864" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B860", propOrder = {
    "b861",
    "b862",
    "b863",
    "b864"
})
public class B860 {

    @XmlElement(name = "B861", required = true)
    protected B861 b861;
    @XmlElement(name = "B862")
    protected B862 b862;
    @XmlElement(name = "B863")
    protected B863 b863;
    @XmlElement(name = "B864")
    protected B864 b864;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the b861 property.
     * 
     * @return
     *     possible object is
     *     {@link B861 }
     *     
     */
    public B861 getB861() {
        return b861;
    }

    /**
     * Sets the value of the b861 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B861 }
     *     
     */
    public void setB861(B861 value) {
        this.b861 = value;
    }

    /**
     * Gets the value of the b862 property.
     * 
     * @return
     *     possible object is
     *     {@link B862 }
     *     
     */
    public B862 getB862() {
        return b862;
    }

    /**
     * Sets the value of the b862 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B862 }
     *     
     */
    public void setB862(B862 value) {
        this.b862 = value;
    }

    /**
     * Gets the value of the b863 property.
     * 
     * @return
     *     possible object is
     *     {@link B863 }
     *     
     */
    public B863 getB863() {
        return b863;
    }

    /**
     * Sets the value of the b863 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B863 }
     *     
     */
    public void setB863(B863 value) {
        this.b863 = value;
    }

    /**
     * Gets the value of the b864 property.
     * 
     * @return
     *     possible object is
     *     {@link B864 }
     *     
     */
    public B864 getB864() {
        return b864;
    }

    /**
     * Sets the value of the b864 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B864 }
     *     
     */
    public void setB864(B864 value) {
        this.b864 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}