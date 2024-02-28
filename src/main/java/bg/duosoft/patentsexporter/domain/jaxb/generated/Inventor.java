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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for inventor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}addressbook" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}designated-states" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="designation"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="all"/&gt;
 *             &lt;enumeration value="us-only"/&gt;
 *             &lt;enumeration value="as-indicated"/&gt;
 *             &lt;enumeration value="all-except-us"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventor", propOrder = {
    "addressbook",
    "designatedStates"
})
public class Inventor {

    @XmlElement(required = true)
    protected List<AddressBookType> addressbook;
    @XmlElement(name = "designated-states")
    protected DesignatedStates designatedStates;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequence;
    @XmlAttribute(name = "designation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String designation;

    /**
     * Gets the value of the addressbook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addressbook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressbook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressBookType }
     * 
     * 
     */
    public List<AddressBookType> getAddressbook() {
        if (addressbook == null) {
            addressbook = new ArrayList<AddressBookType>();
        }
        return this.addressbook;
    }

    /**
     * Gets the value of the designatedStates property.
     * 
     * @return
     *     possible object is
     *     {@link DesignatedStates }
     *     
     */
    public DesignatedStates getDesignatedStates() {
        return designatedStates;
    }

    /**
     * Sets the value of the designatedStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignatedStates }
     *     
     */
    public void setDesignatedStates(DesignatedStates value) {
        this.designatedStates = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

}
