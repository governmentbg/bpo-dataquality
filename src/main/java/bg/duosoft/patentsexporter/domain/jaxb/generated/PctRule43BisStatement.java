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
 * <p>Java class for pct-rule43bis-statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pct-rule43bis-statement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}novelty-valid"/&gt;
 *         &lt;element ref="{}novelty-not-valid"/&gt;
 *         &lt;element ref="{}inventive-step-valid"/&gt;
 *         &lt;element ref="{}inventive-step-not-valid"/&gt;
 *         &lt;element ref="{}applicability-valid"/&gt;
 *         &lt;element ref="{}applicability-not-valid"/&gt;
 *         &lt;element ref="{}citations-explanations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pct-rule43bis-statement", propOrder = {
    "noveltyValid",
    "noveltyNotValid",
    "inventiveStepValid",
    "inventiveStepNotValid",
    "applicabilityValid",
    "applicabilityNotValid",
    "citationsExplanations"
})
public class PctRule43BisStatement {

    @XmlElement(name = "novelty-valid", required = true)
    protected NoveltyValid noveltyValid;
    @XmlElement(name = "novelty-not-valid", required = true)
    protected NoveltyNotValid noveltyNotValid;
    @XmlElement(name = "inventive-step-valid", required = true)
    protected InventiveStepValid inventiveStepValid;
    @XmlElement(name = "inventive-step-not-valid", required = true)
    protected InventiveStepNotValid inventiveStepNotValid;
    @XmlElement(name = "applicability-valid", required = true)
    protected ApplicabilityValid applicabilityValid;
    @XmlElement(name = "applicability-not-valid", required = true)
    protected ApplicabilityNotValid applicabilityNotValid;
    @XmlElement(name = "citations-explanations")
    protected CitationsExplanations citationsExplanations;

    /**
     * Gets the value of the noveltyValid property.
     * 
     * @return
     *     possible object is
     *     {@link NoveltyValid }
     *     
     */
    public NoveltyValid getNoveltyValid() {
        return noveltyValid;
    }

    /**
     * Sets the value of the noveltyValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoveltyValid }
     *     
     */
    public void setNoveltyValid(NoveltyValid value) {
        this.noveltyValid = value;
    }

    /**
     * Gets the value of the noveltyNotValid property.
     * 
     * @return
     *     possible object is
     *     {@link NoveltyNotValid }
     *     
     */
    public NoveltyNotValid getNoveltyNotValid() {
        return noveltyNotValid;
    }

    /**
     * Sets the value of the noveltyNotValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoveltyNotValid }
     *     
     */
    public void setNoveltyNotValid(NoveltyNotValid value) {
        this.noveltyNotValid = value;
    }

    /**
     * Gets the value of the inventiveStepValid property.
     * 
     * @return
     *     possible object is
     *     {@link InventiveStepValid }
     *     
     */
    public InventiveStepValid getInventiveStepValid() {
        return inventiveStepValid;
    }

    /**
     * Sets the value of the inventiveStepValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventiveStepValid }
     *     
     */
    public void setInventiveStepValid(InventiveStepValid value) {
        this.inventiveStepValid = value;
    }

    /**
     * Gets the value of the inventiveStepNotValid property.
     * 
     * @return
     *     possible object is
     *     {@link InventiveStepNotValid }
     *     
     */
    public InventiveStepNotValid getInventiveStepNotValid() {
        return inventiveStepNotValid;
    }

    /**
     * Sets the value of the inventiveStepNotValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventiveStepNotValid }
     *     
     */
    public void setInventiveStepNotValid(InventiveStepNotValid value) {
        this.inventiveStepNotValid = value;
    }

    /**
     * Gets the value of the applicabilityValid property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicabilityValid }
     *     
     */
    public ApplicabilityValid getApplicabilityValid() {
        return applicabilityValid;
    }

    /**
     * Sets the value of the applicabilityValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicabilityValid }
     *     
     */
    public void setApplicabilityValid(ApplicabilityValid value) {
        this.applicabilityValid = value;
    }

    /**
     * Gets the value of the applicabilityNotValid property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicabilityNotValid }
     *     
     */
    public ApplicabilityNotValid getApplicabilityNotValid() {
        return applicabilityNotValid;
    }

    /**
     * Sets the value of the applicabilityNotValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicabilityNotValid }
     *     
     */
    public void setApplicabilityNotValid(ApplicabilityNotValid value) {
        this.applicabilityNotValid = value;
    }

    /**
     * Gets the value of the citationsExplanations property.
     * 
     * @return
     *     possible object is
     *     {@link CitationsExplanations }
     *     
     */
    public CitationsExplanations getCitationsExplanations() {
        return citationsExplanations;
    }

    /**
     * Sets the value of the citationsExplanations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationsExplanations }
     *     
     */
    public void setCitationsExplanations(CitationsExplanations value) {
        this.citationsExplanations = value;
    }

}
