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
 * <p>Java class for citations-explanations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citations-explanations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}citation" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{}filing-date" minOccurs="0"/&gt;
 *           &lt;element ref="{}priority-date" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}p" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citations-explanations", propOrder = {
    "citation",
    "filingDate",
    "priorityDate",
    "p"
})
public class CitationsExplanations {

    protected List<Citation> citation;
    @XmlElement(name = "filing-date")
    protected FilingDate filingDate;
    @XmlElement(name = "priority-date")
    protected PriorityDate priorityDate;
    protected List<P> p;

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citation }
     * 
     * 
     */
    public List<Citation> getCitation() {
        if (citation == null) {
            citation = new ArrayList<Citation>();
        }
        return this.citation;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link FilingDate }
     *     
     */
    public FilingDate getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingDate }
     *     
     */
    public void setFilingDate(FilingDate value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the priorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityDate }
     *     
     */
    public PriorityDate getPriorityDate() {
        return priorityDate;
    }

    /**
     * Sets the value of the priorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDate }
     *     
     */
    public void setPriorityDate(PriorityDate value) {
        this.priorityDate = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the p property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * 
     * 
     */
    public List<P> getP() {
        if (p == null) {
            p = new ArrayList<P>();
        }
        return this.p;
    }

}
