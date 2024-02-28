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


/**
 * <p>Java class for limitation-of-search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitation-of-search"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}text" minOccurs="0"/&gt;
 *         &lt;element ref="{}claims-searched" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}claims-searched-incompletely" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}claims-not-searched" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}reason-limited-search" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="reason-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitation-of-search", propOrder = {
    "text",
    "claimsSearched",
    "claimsSearchedIncompletely",
    "claimsNotSearched",
    "reasonLimitedSearch"
})
public class LimitationOfSearch {

    protected Text text;
    @XmlElement(name = "claims-searched")
    protected List<ClaimsSearched> claimsSearched;
    @XmlElement(name = "claims-searched-incompletely")
    protected List<ClaimsSearchedIncompletely> claimsSearchedIncompletely;
    @XmlElement(name = "claims-not-searched")
    protected List<ClaimsNotSearched> claimsNotSearched;
    @XmlElement(name = "reason-limited-search")
    protected List<ReasonLimitedSearch> reasonLimitedSearch;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequence;
    @XmlAttribute(name = "reason-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String reasonType;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Gets the value of the claimsSearched property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the claimsSearched property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsSearched().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsSearched }
     * 
     * 
     */
    public List<ClaimsSearched> getClaimsSearched() {
        if (claimsSearched == null) {
            claimsSearched = new ArrayList<ClaimsSearched>();
        }
        return this.claimsSearched;
    }

    /**
     * Gets the value of the claimsSearchedIncompletely property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the claimsSearchedIncompletely property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsSearchedIncompletely().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsSearchedIncompletely }
     * 
     * 
     */
    public List<ClaimsSearchedIncompletely> getClaimsSearchedIncompletely() {
        if (claimsSearchedIncompletely == null) {
            claimsSearchedIncompletely = new ArrayList<ClaimsSearchedIncompletely>();
        }
        return this.claimsSearchedIncompletely;
    }

    /**
     * Gets the value of the claimsNotSearched property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the claimsNotSearched property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsNotSearched().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsNotSearched }
     * 
     * 
     */
    public List<ClaimsNotSearched> getClaimsNotSearched() {
        if (claimsNotSearched == null) {
            claimsNotSearched = new ArrayList<ClaimsNotSearched>();
        }
        return this.claimsNotSearched;
    }

    /**
     * Gets the value of the reasonLimitedSearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reasonLimitedSearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonLimitedSearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonLimitedSearch }
     * 
     * 
     */
    public List<ReasonLimitedSearch> getReasonLimitedSearch() {
        if (reasonLimitedSearch == null) {
            reasonLimitedSearch = new ArrayList<ReasonLimitedSearch>();
        }
        return this.reasonLimitedSearch;
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
     * Gets the value of the reasonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonType() {
        return reasonType;
    }

    /**
     * Sets the value of the reasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonType(String value) {
        this.reasonType = value;
    }

}