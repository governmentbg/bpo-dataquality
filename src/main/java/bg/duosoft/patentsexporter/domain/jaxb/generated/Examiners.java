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
 * <p>Java class for examiners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="examiners"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}primary-examiner" minOccurs="0"/&gt;
 *         &lt;element ref="{}assistant-examiner" minOccurs="0"/&gt;
 *         &lt;element ref="{}authorized-officer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "examiners", propOrder = {
    "primaryExaminer",
    "assistantExaminer",
    "authorizedOfficer"
})
public class Examiners {

    @XmlElement(name = "primary-examiner")
    protected PrimaryExaminer primaryExaminer;
    @XmlElement(name = "assistant-examiner")
    protected AssistantExaminer assistantExaminer;
    @XmlElement(name = "authorized-officer")
    protected AuthorizedOfficer authorizedOfficer;

    /**
     * Gets the value of the primaryExaminer property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryExaminer }
     *     
     */
    public PrimaryExaminer getPrimaryExaminer() {
        return primaryExaminer;
    }

    /**
     * Sets the value of the primaryExaminer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryExaminer }
     *     
     */
    public void setPrimaryExaminer(PrimaryExaminer value) {
        this.primaryExaminer = value;
    }

    /**
     * Gets the value of the assistantExaminer property.
     * 
     * @return
     *     possible object is
     *     {@link AssistantExaminer }
     *     
     */
    public AssistantExaminer getAssistantExaminer() {
        return assistantExaminer;
    }

    /**
     * Sets the value of the assistantExaminer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistantExaminer }
     *     
     */
    public void setAssistantExaminer(AssistantExaminer value) {
        this.assistantExaminer = value;
    }

    /**
     * Gets the value of the authorizedOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedOfficer }
     *     
     */
    public AuthorizedOfficer getAuthorizedOfficer() {
        return authorizedOfficer;
    }

    /**
     * Sets the value of the authorizedOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedOfficer }
     *     
     */
    public void setAuthorizedOfficer(AuthorizedOfficer value) {
        this.authorizedOfficer = value;
    }

}
