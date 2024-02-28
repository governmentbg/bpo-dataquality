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
 * <p>Java class for not-annex-c-compliant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="not-annex-c-compliant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}annex-c" minOccurs="0"/&gt;
 *         &lt;element ref="{}annex-c-bis" minOccurs="0"/&gt;
 *         &lt;element ref="{}additional-info" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "not-annex-c-compliant", propOrder = {
    "annexC",
    "annexCBis",
    "additionalInfo"
})
public class NotAnnexCCompliant {

    @XmlElement(name = "annex-c")
    protected AnnexC annexC;
    @XmlElement(name = "annex-c-bis")
    protected AnnexCBis annexCBis;
    @XmlElement(name = "additional-info")
    protected AdditionalInfo additionalInfo;

    /**
     * Gets the value of the annexC property.
     * 
     * @return
     *     possible object is
     *     {@link AnnexC }
     *     
     */
    public AnnexC getAnnexC() {
        return annexC;
    }

    /**
     * Sets the value of the annexC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexC }
     *     
     */
    public void setAnnexC(AnnexC value) {
        this.annexC = value;
    }

    /**
     * Gets the value of the annexCBis property.
     * 
     * @return
     *     possible object is
     *     {@link AnnexCBis }
     *     
     */
    public AnnexCBis getAnnexCBis() {
        return annexCBis;
    }

    /**
     * Sets the value of the annexCBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexCBis }
     *     
     */
    public void setAnnexCBis(AnnexCBis value) {
        this.annexCBis = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfo }
     *     
     */
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfo }
     *     
     */
    public void setAdditionalInfo(AdditionalInfo value) {
        this.additionalInfo = value;
    }

}
