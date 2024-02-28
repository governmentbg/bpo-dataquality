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
 * <p>Java class for designation-of-states complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designation-of-states"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}designation-pct"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}precautionary-designation-statement" minOccurs="0"/&gt;
 *           &lt;element ref="{}exclusion-from-designation" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designation-of-states", propOrder = {
    "designationPct",
    "precautionaryDesignationStatement",
    "exclusionFromDesignation"
})
public class DesignationOfStates {

    @XmlElement(name = "designation-pct", required = true)
    protected DesignationPct designationPct;
    @XmlElement(name = "precautionary-designation-statement")
    protected PrecautionaryDesignationStatement precautionaryDesignationStatement;
    @XmlElement(name = "exclusion-from-designation")
    protected ExclusionFromDesignation exclusionFromDesignation;

    /**
     * Gets the value of the designationPct property.
     * 
     * @return
     *     possible object is
     *     {@link DesignationPct }
     *     
     */
    public DesignationPct getDesignationPct() {
        return designationPct;
    }

    /**
     * Sets the value of the designationPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignationPct }
     *     
     */
    public void setDesignationPct(DesignationPct value) {
        this.designationPct = value;
    }

    /**
     * Gets the value of the precautionaryDesignationStatement property.
     * 
     * @return
     *     possible object is
     *     {@link PrecautionaryDesignationStatement }
     *     
     */
    public PrecautionaryDesignationStatement getPrecautionaryDesignationStatement() {
        return precautionaryDesignationStatement;
    }

    /**
     * Sets the value of the precautionaryDesignationStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecautionaryDesignationStatement }
     *     
     */
    public void setPrecautionaryDesignationStatement(PrecautionaryDesignationStatement value) {
        this.precautionaryDesignationStatement = value;
    }

    /**
     * Gets the value of the exclusionFromDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionFromDesignation }
     *     
     */
    public ExclusionFromDesignation getExclusionFromDesignation() {
        return exclusionFromDesignation;
    }

    /**
     * Sets the value of the exclusionFromDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionFromDesignation }
     *     
     */
    public void setExclusionFromDesignation(ExclusionFromDesignation value) {
        this.exclusionFromDesignation = value;
    }

}
