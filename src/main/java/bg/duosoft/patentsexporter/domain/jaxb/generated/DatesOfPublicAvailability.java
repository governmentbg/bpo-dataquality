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
 * <p>Java class for dates-of-public-availability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dates-of-public-availability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}gazette-reference" minOccurs="0"/&gt;
 *         &lt;element ref="{}unexamined-not-printed-without-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}examined-not-printed-without-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}unexamined-printed-without-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}examined-printed-without-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}claims-only-available" minOccurs="0"/&gt;
 *         &lt;element ref="{}not-printed-with-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}term-of-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}invalidation-of-patent" minOccurs="0"/&gt;
 *         &lt;element ref="{}printed-as-amended" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dates-of-public-availability", propOrder = {
    "gazetteReference",
    "unexaminedNotPrintedWithoutGrant",
    "examinedNotPrintedWithoutGrant",
    "unexaminedPrintedWithoutGrant",
    "examinedPrintedWithoutGrant",
    "claimsOnlyAvailable",
    "notPrintedWithGrant",
    "termOfGrant",
    "invalidationOfPatent",
    "printedAsAmended"
})
public class DatesOfPublicAvailability {

    @XmlElement(name = "gazette-reference")
    protected GazetteReference gazetteReference;
    @XmlElement(name = "unexamined-not-printed-without-grant")
    protected UnexaminedNotPrintedWithoutGrant unexaminedNotPrintedWithoutGrant;
    @XmlElement(name = "examined-not-printed-without-grant")
    protected ExaminedNotPrintedWithoutGrant examinedNotPrintedWithoutGrant;
    @XmlElement(name = "unexamined-printed-without-grant")
    protected UnexaminedPrintedWithoutGrant unexaminedPrintedWithoutGrant;
    @XmlElement(name = "examined-printed-without-grant")
    protected ExaminedPrintedWithoutGrant examinedPrintedWithoutGrant;
    @XmlElement(name = "claims-only-available")
    protected ClaimsOnlyAvailable claimsOnlyAvailable;
    @XmlElement(name = "not-printed-with-grant")
    protected NotPrintedWithGrant notPrintedWithGrant;
    @XmlElement(name = "term-of-grant")
    protected TermOfGrant termOfGrant;
    @XmlElement(name = "invalidation-of-patent")
    protected InvalidationOfPatent invalidationOfPatent;
    @XmlElement(name = "printed-as-amended")
    protected PrintedAsAmended printedAsAmended;

    /**
     * Gets the value of the gazetteReference property.
     * 
     * @return
     *     possible object is
     *     {@link GazetteReference }
     *     
     */
    public GazetteReference getGazetteReference() {
        return gazetteReference;
    }

    /**
     * Sets the value of the gazetteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GazetteReference }
     *     
     */
    public void setGazetteReference(GazetteReference value) {
        this.gazetteReference = value;
    }

    /**
     * Gets the value of the unexaminedNotPrintedWithoutGrant property.
     * 
     * @return
     *     possible object is
     *     {@link UnexaminedNotPrintedWithoutGrant }
     *     
     */
    public UnexaminedNotPrintedWithoutGrant getUnexaminedNotPrintedWithoutGrant() {
        return unexaminedNotPrintedWithoutGrant;
    }

    /**
     * Sets the value of the unexaminedNotPrintedWithoutGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnexaminedNotPrintedWithoutGrant }
     *     
     */
    public void setUnexaminedNotPrintedWithoutGrant(UnexaminedNotPrintedWithoutGrant value) {
        this.unexaminedNotPrintedWithoutGrant = value;
    }

    /**
     * Gets the value of the examinedNotPrintedWithoutGrant property.
     * 
     * @return
     *     possible object is
     *     {@link ExaminedNotPrintedWithoutGrant }
     *     
     */
    public ExaminedNotPrintedWithoutGrant getExaminedNotPrintedWithoutGrant() {
        return examinedNotPrintedWithoutGrant;
    }

    /**
     * Sets the value of the examinedNotPrintedWithoutGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminedNotPrintedWithoutGrant }
     *     
     */
    public void setExaminedNotPrintedWithoutGrant(ExaminedNotPrintedWithoutGrant value) {
        this.examinedNotPrintedWithoutGrant = value;
    }

    /**
     * Gets the value of the unexaminedPrintedWithoutGrant property.
     * 
     * @return
     *     possible object is
     *     {@link UnexaminedPrintedWithoutGrant }
     *     
     */
    public UnexaminedPrintedWithoutGrant getUnexaminedPrintedWithoutGrant() {
        return unexaminedPrintedWithoutGrant;
    }

    /**
     * Sets the value of the unexaminedPrintedWithoutGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnexaminedPrintedWithoutGrant }
     *     
     */
    public void setUnexaminedPrintedWithoutGrant(UnexaminedPrintedWithoutGrant value) {
        this.unexaminedPrintedWithoutGrant = value;
    }

    /**
     * Gets the value of the examinedPrintedWithoutGrant property.
     * 
     * @return
     *     possible object is
     *     {@link ExaminedPrintedWithoutGrant }
     *     
     */
    public ExaminedPrintedWithoutGrant getExaminedPrintedWithoutGrant() {
        return examinedPrintedWithoutGrant;
    }

    /**
     * Sets the value of the examinedPrintedWithoutGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminedPrintedWithoutGrant }
     *     
     */
    public void setExaminedPrintedWithoutGrant(ExaminedPrintedWithoutGrant value) {
        this.examinedPrintedWithoutGrant = value;
    }

    /**
     * Gets the value of the claimsOnlyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsOnlyAvailable }
     *     
     */
    public ClaimsOnlyAvailable getClaimsOnlyAvailable() {
        return claimsOnlyAvailable;
    }

    /**
     * Sets the value of the claimsOnlyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsOnlyAvailable }
     *     
     */
    public void setClaimsOnlyAvailable(ClaimsOnlyAvailable value) {
        this.claimsOnlyAvailable = value;
    }

    /**
     * Gets the value of the notPrintedWithGrant property.
     * 
     * @return
     *     possible object is
     *     {@link NotPrintedWithGrant }
     *     
     */
    public NotPrintedWithGrant getNotPrintedWithGrant() {
        return notPrintedWithGrant;
    }

    /**
     * Sets the value of the notPrintedWithGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotPrintedWithGrant }
     *     
     */
    public void setNotPrintedWithGrant(NotPrintedWithGrant value) {
        this.notPrintedWithGrant = value;
    }

    /**
     * Gets the value of the termOfGrant property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfGrant }
     *     
     */
    public TermOfGrant getTermOfGrant() {
        return termOfGrant;
    }

    /**
     * Sets the value of the termOfGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfGrant }
     *     
     */
    public void setTermOfGrant(TermOfGrant value) {
        this.termOfGrant = value;
    }

    /**
     * Gets the value of the invalidationOfPatent property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidationOfPatent }
     *     
     */
    public InvalidationOfPatent getInvalidationOfPatent() {
        return invalidationOfPatent;
    }

    /**
     * Sets the value of the invalidationOfPatent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidationOfPatent }
     *     
     */
    public void setInvalidationOfPatent(InvalidationOfPatent value) {
        this.invalidationOfPatent = value;
    }

    /**
     * Gets the value of the printedAsAmended property.
     * 
     * @return
     *     possible object is
     *     {@link PrintedAsAmended }
     *     
     */
    public PrintedAsAmended getPrintedAsAmended() {
        return printedAsAmended;
    }

    /**
     * Sets the value of the printedAsAmended property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintedAsAmended }
     *     
     */
    public void setPrintedAsAmended(PrintedAsAmended value) {
        this.printedAsAmended = value;
    }

}