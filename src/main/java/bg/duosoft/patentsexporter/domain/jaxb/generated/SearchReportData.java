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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for search-report-data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="search-report-data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}doc-page" maxOccurs="unbounded"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}srep-info" minOccurs="0"/&gt;
 *           &lt;element ref="{}srep-for-pub" minOccurs="0"/&gt;
 *           &lt;element ref="{}srep-written-opinion" minOccurs="0"/&gt;
 *           &lt;element ref="{}srep-search-opinion" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="date-produced" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="srep-office" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="srep-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "search-report-data", propOrder = {
    "docPage",
    "srepInfo",
    "srepForPub",
    "srepWrittenOpinion",
    "srepSearchOpinion"
})
public class SearchReportData {

    @XmlElement(name = "doc-page")
    protected List<DocPage> docPage;
    @XmlElement(name = "srep-info")
    protected SrepInfo srepInfo;
    @XmlElement(name = "srep-for-pub")
    protected SrepForPub srepForPub;
    @XmlElement(name = "srep-written-opinion")
    protected SrepWrittenOpinion srepWrittenOpinion;
    @XmlElement(name = "srep-search-opinion")
    protected SrepSearchOpinion srepSearchOpinion;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang")
    @XmlSchemaType(name = "anySimpleType")
    protected String lang;
    @XmlAttribute(name = "date-produced", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dateProduced;
    @XmlAttribute(name = "srep-office", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String srepOffice;
    @XmlAttribute(name = "srep-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String srepType;
    @XmlAttribute(name = "status")
    @XmlSchemaType(name = "anySimpleType")
    protected String status;

    /**
     * Gets the value of the docPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the docPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocPage }
     * 
     * 
     */
    public List<DocPage> getDocPage() {
        if (docPage == null) {
            docPage = new ArrayList<DocPage>();
        }
        return this.docPage;
    }

    /**
     * Gets the value of the srepInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SrepInfo }
     *     
     */
    public SrepInfo getSrepInfo() {
        return srepInfo;
    }

    /**
     * Sets the value of the srepInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrepInfo }
     *     
     */
    public void setSrepInfo(SrepInfo value) {
        this.srepInfo = value;
    }

    /**
     * Gets the value of the srepForPub property.
     * 
     * @return
     *     possible object is
     *     {@link SrepForPub }
     *     
     */
    public SrepForPub getSrepForPub() {
        return srepForPub;
    }

    /**
     * Sets the value of the srepForPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrepForPub }
     *     
     */
    public void setSrepForPub(SrepForPub value) {
        this.srepForPub = value;
    }

    /**
     * Gets the value of the srepWrittenOpinion property.
     * 
     * @return
     *     possible object is
     *     {@link SrepWrittenOpinion }
     *     
     */
    public SrepWrittenOpinion getSrepWrittenOpinion() {
        return srepWrittenOpinion;
    }

    /**
     * Sets the value of the srepWrittenOpinion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrepWrittenOpinion }
     *     
     */
    public void setSrepWrittenOpinion(SrepWrittenOpinion value) {
        this.srepWrittenOpinion = value;
    }

    /**
     * Gets the value of the srepSearchOpinion property.
     * 
     * @return
     *     possible object is
     *     {@link SrepSearchOpinion }
     *     
     */
    public SrepSearchOpinion getSrepSearchOpinion() {
        return srepSearchOpinion;
    }

    /**
     * Sets the value of the srepSearchOpinion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrepSearchOpinion }
     *     
     */
    public void setSrepSearchOpinion(SrepSearchOpinion value) {
        this.srepSearchOpinion = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dateProduced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateProduced() {
        return dateProduced;
    }

    /**
     * Sets the value of the dateProduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateProduced(String value) {
        this.dateProduced = value;
    }

    /**
     * Gets the value of the srepOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrepOffice() {
        return srepOffice;
    }

    /**
     * Sets the value of the srepOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrepOffice(String value) {
        this.srepOffice = value;
    }

    /**
     * Gets the value of the srepType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrepType() {
        return srepType;
    }

    /**
     * Sets the value of the srepType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrepType(String value) {
        this.srepType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}