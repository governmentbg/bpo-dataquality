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
 * <p>Java class for B100 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B100"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B110"/&gt;
 *         &lt;element ref="{}B120" minOccurs="0"/&gt;
 *         &lt;element ref="{}B130"/&gt;
 *         &lt;element ref="{}B131EP" minOccurs="0"/&gt;
 *         &lt;element ref="{}B132EP" minOccurs="0"/&gt;
 *         &lt;element ref="{}B133EP" minOccurs="0"/&gt;
 *         &lt;element ref="{}B140"/&gt;
 *         &lt;element ref="{}B150" minOccurs="0"/&gt;
 *         &lt;element ref="{}B190"/&gt;
 *         &lt;element ref="{}B195" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B100", propOrder = {
    "b110",
    "b120",
    "b130",
    "b131EP",
    "b132EP",
    "b133EP",
    "b140",
    "b150",
    "b190",
    "b195"
})
public class B100 {

    @XmlElement(name = "B110", required = true)
    protected B110 b110;
    @XmlElement(name = "B120")
    protected B120 b120;
    @XmlElement(name = "B130", required = true)
    protected B130 b130;
    @XmlElement(name = "B131EP")
    protected B131EP b131EP;
    @XmlElement(name = "B132EP")
    protected B132EP b132EP;
    @XmlElement(name = "B133EP")
    protected B133EP b133EP;
    @XmlElement(name = "B140", required = true)
    protected B140 b140;
    @XmlElement(name = "B150")
    protected B150 b150;
    @XmlElement(name = "B190", required = true)
    protected B190 b190;
    @XmlElement(name = "B195")
    protected B195 b195;

    /**
     * Gets the value of the b110 property.
     * 
     * @return
     *     possible object is
     *     {@link B110 }
     *     
     */
    public B110 getB110() {
        return b110;
    }

    /**
     * Sets the value of the b110 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B110 }
     *     
     */
    public void setB110(B110 value) {
        this.b110 = value;
    }

    /**
     * Gets the value of the b120 property.
     * 
     * @return
     *     possible object is
     *     {@link B120 }
     *     
     */
    public B120 getB120() {
        return b120;
    }

    /**
     * Sets the value of the b120 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B120 }
     *     
     */
    public void setB120(B120 value) {
        this.b120 = value;
    }

    /**
     * Gets the value of the b130 property.
     * 
     * @return
     *     possible object is
     *     {@link B130 }
     *     
     */
    public B130 getB130() {
        return b130;
    }

    /**
     * Sets the value of the b130 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B130 }
     *     
     */
    public void setB130(B130 value) {
        this.b130 = value;
    }

    /**
     * Gets the value of the b131EP property.
     * 
     * @return
     *     possible object is
     *     {@link B131EP }
     *     
     */
    public B131EP getB131EP() {
        return b131EP;
    }

    /**
     * Sets the value of the b131EP property.
     * 
     * @param value
     *     allowed object is
     *     {@link B131EP }
     *     
     */
    public void setB131EP(B131EP value) {
        this.b131EP = value;
    }

    /**
     * Gets the value of the b132EP property.
     * 
     * @return
     *     possible object is
     *     {@link B132EP }
     *     
     */
    public B132EP getB132EP() {
        return b132EP;
    }

    /**
     * Sets the value of the b132EP property.
     * 
     * @param value
     *     allowed object is
     *     {@link B132EP }
     *     
     */
    public void setB132EP(B132EP value) {
        this.b132EP = value;
    }

    /**
     * Gets the value of the b133EP property.
     * 
     * @return
     *     possible object is
     *     {@link B133EP }
     *     
     */
    public B133EP getB133EP() {
        return b133EP;
    }

    /**
     * Sets the value of the b133EP property.
     * 
     * @param value
     *     allowed object is
     *     {@link B133EP }
     *     
     */
    public void setB133EP(B133EP value) {
        this.b133EP = value;
    }

    /**
     * Gets the value of the b140 property.
     * 
     * @return
     *     possible object is
     *     {@link B140 }
     *     
     */
    public B140 getB140() {
        return b140;
    }

    /**
     * Sets the value of the b140 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B140 }
     *     
     */
    public void setB140(B140 value) {
        this.b140 = value;
    }

    /**
     * Gets the value of the b150 property.
     * 
     * @return
     *     possible object is
     *     {@link B150 }
     *     
     */
    public B150 getB150() {
        return b150;
    }

    /**
     * Sets the value of the b150 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B150 }
     *     
     */
    public void setB150(B150 value) {
        this.b150 = value;
    }

    /**
     * Gets the value of the b190 property.
     * 
     * @return
     *     possible object is
     *     {@link B190 }
     *     
     */
    public B190 getB190() {
        return b190;
    }

    /**
     * Sets the value of the b190 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B190 }
     *     
     */
    public void setB190(B190 value) {
        this.b190 = value;
    }

    /**
     * Gets the value of the b195 property.
     * 
     * @return
     *     possible object is
     *     {@link B195 }
     *     
     */
    public B195 getB195() {
        return b195;
    }

    /**
     * Sets the value of the b195 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B195 }
     *     
     */
    public void setB195(B195 value) {
        this.b195 = value;
    }

}
