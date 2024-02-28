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
 * <p>Java class for material-of-sequence-list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="material-of-sequence-list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}sequence-listing-material-type"/&gt;
 *         &lt;element ref="{}sequence-listing-material-format"/&gt;
 *         &lt;element ref="{}sequence-listing-filing-time"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "material-of-sequence-list", propOrder = {
    "sequenceListingMaterialType",
    "sequenceListingMaterialFormat",
    "sequenceListingFilingTime"
})
public class MaterialOfSequenceList {

    @XmlElement(name = "sequence-listing-material-type", required = true)
    protected SequenceListingMaterialType sequenceListingMaterialType;
    @XmlElement(name = "sequence-listing-material-format", required = true)
    protected SequenceListingMaterialFormat sequenceListingMaterialFormat;
    @XmlElement(name = "sequence-listing-filing-time", required = true)
    protected SequenceListingFilingTime sequenceListingFilingTime;

    /**
     * Gets the value of the sequenceListingMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceListingMaterialType }
     *     
     */
    public SequenceListingMaterialType getSequenceListingMaterialType() {
        return sequenceListingMaterialType;
    }

    /**
     * Sets the value of the sequenceListingMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceListingMaterialType }
     *     
     */
    public void setSequenceListingMaterialType(SequenceListingMaterialType value) {
        this.sequenceListingMaterialType = value;
    }

    /**
     * Gets the value of the sequenceListingMaterialFormat property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceListingMaterialFormat }
     *     
     */
    public SequenceListingMaterialFormat getSequenceListingMaterialFormat() {
        return sequenceListingMaterialFormat;
    }

    /**
     * Sets the value of the sequenceListingMaterialFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceListingMaterialFormat }
     *     
     */
    public void setSequenceListingMaterialFormat(SequenceListingMaterialFormat value) {
        this.sequenceListingMaterialFormat = value;
    }

    /**
     * Gets the value of the sequenceListingFilingTime property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceListingFilingTime }
     *     
     */
    public SequenceListingFilingTime getSequenceListingFilingTime() {
        return sequenceListingFilingTime;
    }

    /**
     * Sets the value of the sequenceListingFilingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceListingFilingTime }
     *     
     */
    public void setSequenceListingFilingTime(SequenceListingFilingTime value) {
        this.sequenceListingFilingTime = value;
    }

}
