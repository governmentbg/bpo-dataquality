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
 * <p>Java class for st50-republication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="st50-republication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}republication-code" minOccurs="0"/&gt;
 *         &lt;element ref="{}cancellation-date" minOccurs="0"/&gt;
 *         &lt;element ref="{}modifications" minOccurs="0"/&gt;
 *         &lt;element ref="{}republication-notes" minOccurs="0"/&gt;
 *         &lt;element ref="{}correction-notice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "st50-republication", propOrder = {
    "republicationCode",
    "cancellationDate",
    "modifications",
    "republicationNotes",
    "correctionNotice"
})
public class St50Republication {

    @XmlElement(name = "republication-code")
    protected RepublicationCode republicationCode;
    @XmlElement(name = "cancellation-date")
    protected CancellationDate cancellationDate;
    protected Modifications modifications;
    @XmlElement(name = "republication-notes")
    protected RepublicationNotes republicationNotes;
    @XmlElement(name = "correction-notice", required = true)
    protected CorrectionNotice correctionNotice;

    /**
     * Gets the value of the republicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link RepublicationCode }
     *     
     */
    public RepublicationCode getRepublicationCode() {
        return republicationCode;
    }

    /**
     * Sets the value of the republicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepublicationCode }
     *     
     */
    public void setRepublicationCode(RepublicationCode value) {
        this.republicationCode = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationDate }
     *     
     */
    public CancellationDate getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationDate }
     *     
     */
    public void setCancellationDate(CancellationDate value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the modifications property.
     * 
     * @return
     *     possible object is
     *     {@link Modifications }
     *     
     */
    public Modifications getModifications() {
        return modifications;
    }

    /**
     * Sets the value of the modifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifications }
     *     
     */
    public void setModifications(Modifications value) {
        this.modifications = value;
    }

    /**
     * Gets the value of the republicationNotes property.
     * 
     * @return
     *     possible object is
     *     {@link RepublicationNotes }
     *     
     */
    public RepublicationNotes getRepublicationNotes() {
        return republicationNotes;
    }

    /**
     * Sets the value of the republicationNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepublicationNotes }
     *     
     */
    public void setRepublicationNotes(RepublicationNotes value) {
        this.republicationNotes = value;
    }

    /**
     * Gets the value of the correctionNotice property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionNotice }
     *     
     */
    public CorrectionNotice getCorrectionNotice() {
        return correctionNotice;
    }

    /**
     * Sets the value of the correctionNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionNotice }
     *     
     */
    public void setCorrectionNotice(CorrectionNotice value) {
        this.correctionNotice = value;
    }

}
