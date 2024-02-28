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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDOBI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDOBI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B000" minOccurs="0"/&gt;
 *         &lt;element ref="{}B100"/&gt;
 *         &lt;element ref="{}B200" minOccurs="0"/&gt;
 *         &lt;element ref="{}B300" minOccurs="0"/&gt;
 *         &lt;element ref="{}B400" minOccurs="0"/&gt;
 *         &lt;element ref="{}B500" minOccurs="0"/&gt;
 *         &lt;element ref="{}B600" minOccurs="0"/&gt;
 *         &lt;element ref="{}B700" minOccurs="0"/&gt;
 *         &lt;element ref="{}B800" minOccurs="0"/&gt;
 *         &lt;element ref="{}B900" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDOBI", propOrder = {
    "b000",
    "b100",
    "b200",
    "b300",
    "b400",
    "b500",
    "b600",
    "b700",
    "b800",
    "b900"
})
public class SDOBI {

    @XmlElement(name = "B000")
    protected B000 b000;
    @XmlElement(name = "B100", required = true)
    protected B100 b100;
    @XmlElement(name = "B200")
    protected B200 b200;
    @XmlElement(name = "B300")
    protected B300 b300;
    @XmlElement(name = "B400")
    protected B400 b400;
    @XmlElement(name = "B500")
    protected B500 b500;
    @XmlElement(name = "B600")
    protected B600 b600;
    @XmlElement(name = "B700")
    protected B700 b700;
    @XmlElement(name = "B800")
    protected B800 b800;
    @XmlElement(name = "B900")
    protected B900 b900;
    @XmlAttribute(name = "lang")
    @XmlSchemaType(name = "anySimpleType")
    protected String lang;

    /**
     * Gets the value of the b000 property.
     * 
     * @return
     *     possible object is
     *     {@link B000 }
     *     
     */
    public B000 getB000() {
        return b000;
    }

    /**
     * Sets the value of the b000 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B000 }
     *     
     */
    public void setB000(B000 value) {
        this.b000 = value;
    }

    /**
     * Gets the value of the b100 property.
     * 
     * @return
     *     possible object is
     *     {@link B100 }
     *     
     */
    public B100 getB100() {
        return b100;
    }

    /**
     * Sets the value of the b100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B100 }
     *     
     */
    public void setB100(B100 value) {
        this.b100 = value;
    }

    /**
     * Gets the value of the b200 property.
     * 
     * @return
     *     possible object is
     *     {@link B200 }
     *     
     */
    public B200 getB200() {
        return b200;
    }

    /**
     * Sets the value of the b200 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B200 }
     *     
     */
    public void setB200(B200 value) {
        this.b200 = value;
    }

    /**
     * Gets the value of the b300 property.
     * 
     * @return
     *     possible object is
     *     {@link B300 }
     *     
     */
    public B300 getB300() {
        return b300;
    }

    /**
     * Sets the value of the b300 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B300 }
     *     
     */
    public void setB300(B300 value) {
        this.b300 = value;
    }

    /**
     * Gets the value of the b400 property.
     * 
     * @return
     *     possible object is
     *     {@link B400 }
     *     
     */
    public B400 getB400() {
        return b400;
    }

    /**
     * Sets the value of the b400 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B400 }
     *     
     */
    public void setB400(B400 value) {
        this.b400 = value;
    }

    /**
     * Gets the value of the b500 property.
     * 
     * @return
     *     possible object is
     *     {@link B500 }
     *     
     */
    public B500 getB500() {
        return b500;
    }

    /**
     * Sets the value of the b500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B500 }
     *     
     */
    public void setB500(B500 value) {
        this.b500 = value;
    }

    /**
     * Gets the value of the b600 property.
     * 
     * @return
     *     possible object is
     *     {@link B600 }
     *     
     */
    public B600 getB600() {
        return b600;
    }

    /**
     * Sets the value of the b600 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B600 }
     *     
     */
    public void setB600(B600 value) {
        this.b600 = value;
    }

    /**
     * Gets the value of the b700 property.
     * 
     * @return
     *     possible object is
     *     {@link B700 }
     *     
     */
    public B700 getB700() {
        return b700;
    }

    /**
     * Sets the value of the b700 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B700 }
     *     
     */
    public void setB700(B700 value) {
        this.b700 = value;
    }

    /**
     * Gets the value of the b800 property.
     * 
     * @return
     *     possible object is
     *     {@link B800 }
     *     
     */
    public B800 getB800() {
        return b800;
    }

    /**
     * Sets the value of the b800 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B800 }
     *     
     */
    public void setB800(B800 value) {
        this.b800 = value;
    }

    /**
     * Gets the value of the b900 property.
     * 
     * @return
     *     possible object is
     *     {@link B900 }
     *     
     */
    public B900 getB900() {
        return b900;
    }

    /**
     * Sets the value of the b900 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B900 }
     *     
     */
    public void setB900(B900 value) {
        this.b900 = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}