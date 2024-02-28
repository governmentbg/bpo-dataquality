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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opinion-established-regarding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="opinion-established-regarding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}entire-application"/&gt;
 *         &lt;element ref="{}claim-num" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opinion-established-regarding", propOrder = {
    "entireApplication",
    "claimNum"
})
public class OpinionEstablishedRegarding {

    @XmlElement(name = "entire-application")
    protected EntireApplication entireApplication;
    @XmlElement(name = "claim-num")
    protected List<ClaimNum> claimNum;

    /**
     * Gets the value of the entireApplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntireApplication }
     *     
     */
    public EntireApplication getEntireApplication() {
        return entireApplication;
    }

    /**
     * Sets the value of the entireApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntireApplication }
     *     
     */
    public void setEntireApplication(EntireApplication value) {
        this.entireApplication = value;
    }

    /**
     * Gets the value of the claimNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the claimNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimNum }
     * 
     * 
     */
    public List<ClaimNum> getClaimNum() {
        if (claimNum == null) {
            claimNum = new ArrayList<ClaimNum>();
        }
        return this.claimNum;
    }

}
