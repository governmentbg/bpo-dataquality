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
 * <p>Java class for priority-claim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priority-claim"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}country"/&gt;
 *         &lt;element ref="{}doc-number" minOccurs="0"/&gt;
 *         &lt;element ref="{}date"/&gt;
 *         &lt;element ref="{}office-of-filing" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}priority-doc-requested"/&gt;
 *           &lt;element ref="{}priority-doc-attached"/&gt;
 *           &lt;element ref="{}priority-doc-from-library"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}restore-rights" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="kind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="international"/&gt;
 *             &lt;enumeration value="regional"/&gt;
 *             &lt;enumeration value="national"/&gt;
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
@XmlType(name = "priority-claim", propOrder = {
    "country",
    "docNumber",
    "date",
    "officeOfFiling",
    "priorityDocRequested",
    "priorityDocAttached",
    "priorityDocFromLibrary",
    "restoreRights"
})
public class PriorityClaim {

    @XmlElement(required = true)
    protected Country country;
    @XmlElement(name = "doc-number")
    protected DocNumber docNumber;
    @XmlElement(required = true)
    protected Date date;
    @XmlElement(name = "office-of-filing")
    protected OfficeOfFiling officeOfFiling;
    @XmlElement(name = "priority-doc-requested")
    protected PriorityDocRequested priorityDocRequested;
    @XmlElement(name = "priority-doc-attached")
    protected PriorityDocAttached priorityDocAttached;
    @XmlElement(name = "priority-doc-from-library")
    protected PriorityDocFromLibrary priorityDocFromLibrary;
    @XmlElement(name = "restore-rights")
    protected RestoreRights restoreRights;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequence;
    @XmlAttribute(name = "kind")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kind;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DocNumber }
     *     
     */
    public DocNumber getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocNumber }
     *     
     */
    public void setDocNumber(DocNumber value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the officeOfFiling property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeOfFiling }
     *     
     */
    public OfficeOfFiling getOfficeOfFiling() {
        return officeOfFiling;
    }

    /**
     * Sets the value of the officeOfFiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeOfFiling }
     *     
     */
    public void setOfficeOfFiling(OfficeOfFiling value) {
        this.officeOfFiling = value;
    }

    /**
     * Gets the value of the priorityDocRequested property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityDocRequested }
     *     
     */
    public PriorityDocRequested getPriorityDocRequested() {
        return priorityDocRequested;
    }

    /**
     * Sets the value of the priorityDocRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDocRequested }
     *     
     */
    public void setPriorityDocRequested(PriorityDocRequested value) {
        this.priorityDocRequested = value;
    }

    /**
     * Gets the value of the priorityDocAttached property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityDocAttached }
     *     
     */
    public PriorityDocAttached getPriorityDocAttached() {
        return priorityDocAttached;
    }

    /**
     * Sets the value of the priorityDocAttached property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDocAttached }
     *     
     */
    public void setPriorityDocAttached(PriorityDocAttached value) {
        this.priorityDocAttached = value;
    }

    /**
     * Gets the value of the priorityDocFromLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityDocFromLibrary }
     *     
     */
    public PriorityDocFromLibrary getPriorityDocFromLibrary() {
        return priorityDocFromLibrary;
    }

    /**
     * Sets the value of the priorityDocFromLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDocFromLibrary }
     *     
     */
    public void setPriorityDocFromLibrary(PriorityDocFromLibrary value) {
        this.priorityDocFromLibrary = value;
    }

    /**
     * Gets the value of the restoreRights property.
     * 
     * @return
     *     possible object is
     *     {@link RestoreRights }
     *     
     */
    public RestoreRights getRestoreRights() {
        return restoreRights;
    }

    /**
     * Sets the value of the restoreRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestoreRights }
     *     
     */
    public void setRestoreRights(RestoreRights value) {
        this.restoreRights = value;
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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

}
