//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B700 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B700"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B710" minOccurs="0"/&gt;
 *         &lt;element ref="{}B720" minOccurs="0"/&gt;
 *         &lt;element ref="{}B730" minOccurs="0"/&gt;
 *         &lt;element ref="{}B740" minOccurs="0"/&gt;
 *         &lt;element ref="{}B745" minOccurs="0"/&gt;
 *         &lt;element ref="{}B780" minOccurs="0"/&gt;
 *         &lt;element ref="{}B790" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B700", propOrder = {
    "b710",
    "b720",
    "b730",
    "b740",
    "b745",
    "b780",
    "b790"
})
public class B700 {

    @XmlElement(name = "B710")
    protected B710 b710;
    @XmlElement(name = "B720")
    protected B720 b720;
    @XmlElement(name = "B730")
    protected B730 b730;
    @XmlElement(name = "B740")
    protected B740 b740;
    @XmlElement(name = "B745")
    protected B745 b745;
    @XmlElement(name = "B780")
    protected B780 b780;
    @XmlElement(name = "B790")
    protected B790 b790;

    /**
     * Gets the value of the b710 property.
     * 
     * @return
     *     possible object is
     *     {@link B710 }
     *     
     */
    public B710 getB710() {
        return b710;
    }

    /**
     * Sets the value of the b710 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B710 }
     *     
     */
    public void setB710(B710 value) {
        this.b710 = value;
    }

    /**
     * Gets the value of the b720 property.
     * 
     * @return
     *     possible object is
     *     {@link B720 }
     *     
     */
    public B720 getB720() {
        return b720;
    }

    /**
     * Sets the value of the b720 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B720 }
     *     
     */
    public void setB720(B720 value) {
        this.b720 = value;
    }

    /**
     * Gets the value of the b730 property.
     * 
     * @return
     *     possible object is
     *     {@link B730 }
     *     
     */
    public B730 getB730() {
        return b730;
    }

    /**
     * Sets the value of the b730 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B730 }
     *     
     */
    public void setB730(B730 value) {
        this.b730 = value;
    }

    /**
     * Gets the value of the b740 property.
     * 
     * @return
     *     possible object is
     *     {@link B740 }
     *     
     */
    public B740 getB740() {
        return b740;
    }

    /**
     * Sets the value of the b740 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B740 }
     *     
     */
    public void setB740(B740 value) {
        this.b740 = value;
    }

    /**
     * Gets the value of the b745 property.
     * 
     * @return
     *     possible object is
     *     {@link B745 }
     *     
     */
    public B745 getB745() {
        return b745;
    }

    /**
     * Sets the value of the b745 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B745 }
     *     
     */
    public void setB745(B745 value) {
        this.b745 = value;
    }

    /**
     * Gets the value of the b780 property.
     * 
     * @return
     *     possible object is
     *     {@link B780 }
     *     
     */
    public B780 getB780() {
        return b780;
    }

    /**
     * Sets the value of the b780 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B780 }
     *     
     */
    public void setB780(B780 value) {
        this.b780 = value;
    }

    /**
     * Gets the value of the b790 property.
     * 
     * @return
     *     possible object is
     *     {@link B790 }
     *     
     */
    public B790 getB790() {
        return b790;
    }

    /**
     * Sets the value of the b790 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B790 }
     *     
     */
    public void setB790(B790 value) {
        this.b790 = value;
    }

}
