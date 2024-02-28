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
 * <p>Java class for FormattedAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedAddressType", propOrder = {
    "addressStreet",
    "addressCity",
    "addressCounty",
    "addressState",
    "addressPostcode",
    "formattedAddressCountryCode"
})
public class FormattedAddressType {

    @XmlElement(name = "AddressStreet")
    protected String addressStreet;
    @XmlElement(name = "AddressCity")
    protected String addressCity;
    @XmlElement(name = "AddressCounty")
    protected String addressCounty;
    @XmlElement(name = "AddressState")
    protected String addressState;
    @XmlElement(name = "AddressPostcode")
    protected String addressPostcode;
    @XmlElement(name = "FormattedAddressCountryCode")
    protected String formattedAddressCountryCode;

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet(String value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCity(String value) {
        this.addressCity = value;
    }

    /**
     * Gets the value of the addressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCounty() {
        return addressCounty;
    }

    /**
     * Sets the value of the addressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCounty(String value) {
        this.addressCounty = value;
    }

    /**
     * Gets the value of the addressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Sets the value of the addressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressState(String value) {
        this.addressState = value;
    }

    /**
     * Gets the value of the addressPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Sets the value of the addressPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPostcode(String value) {
        this.addressPostcode = value;
    }

    /**
     * Gets the value of the formattedAddressCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddressCountryCode() {
        return formattedAddressCountryCode;
    }

    /**
     * Sets the value of the formattedAddressCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddressCountryCode(String value) {
        this.formattedAddressCountryCode = value;
    }

}