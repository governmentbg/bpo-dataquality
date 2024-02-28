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
 * <p>Java class for bg-patent-document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bg-patent-document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}doc-page" maxOccurs="unbounded"/&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{}bibliographic-data"/&gt;
 *             &lt;element ref="{}SDOBI"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{}description" minOccurs="0"/&gt;
 *           &lt;element ref="{}claims" minOccurs="0"/&gt;
 *           &lt;element ref="{}amended-claims" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{}amended-claims-statement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{}abstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{}drawings" minOccurs="0"/&gt;
 *           &lt;element ref="{}search-report-data" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{}sequence-list-doc" minOccurs="0"/&gt;
 *           &lt;element ref="{}table-external-doc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="dtd-version" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="country" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="file-reference-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="correction-code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="doc-number" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="kind" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="date-produced" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="date-publ" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bg-patent-document", propOrder = {
    "docPage",
    "bibliographicData",
    "sdobi",
    "description",
    "claims",
    "amendedClaims",
    "amendedClaimsStatement",
    "_abstract",
    "drawings",
    "searchReportData",
    "sequenceListDoc",
    "tableExternalDoc"
})
public class BgPatentDocument {

    @XmlElement(name = "doc-page")
    protected List<DocPage> docPage;
    @XmlElement(name = "bibliographic-data")
    protected BibliographicData bibliographicData;
    @XmlElement(name = "SDOBI")
    protected SDOBI sdobi;
    protected Description description;
    protected Claims claims;
    @XmlElement(name = "amended-claims")
    protected List<AmendedClaims> amendedClaims;
    @XmlElement(name = "amended-claims-statement")
    protected List<AmendedClaimsStatement> amendedClaimsStatement;
    @XmlElement(name = "abstract")
    protected List<Abstract> _abstract;
    protected Drawings drawings;
    @XmlElement(name = "search-report-data")
    protected List<SearchReportData> searchReportData;
    @XmlElement(name = "sequence-list-doc")
    protected SequenceListDoc sequenceListDoc;
    @XmlElement(name = "table-external-doc")
    protected List<TableExternalDoc> tableExternalDoc;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "lang", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String lang;
    @XmlAttribute(name = "dtd-version")
    @XmlSchemaType(name = "anySimpleType")
    protected String dtdVersion;
    @XmlAttribute(name = "file")
    @XmlSchemaType(name = "anySimpleType")
    protected String file;
    @XmlAttribute(name = "country", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String country;
    @XmlAttribute(name = "file-reference-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String fileReferenceId;
    @XmlAttribute(name = "correction-code")
    @XmlSchemaType(name = "anySimpleType")
    protected String correctionCode;
    @XmlAttribute(name = "doc-number")
    @XmlSchemaType(name = "anySimpleType")
    protected String docNumber;
    @XmlAttribute(name = "kind")
    @XmlSchemaType(name = "anySimpleType")
    protected String kind;
    @XmlAttribute(name = "date-produced")
    @XmlSchemaType(name = "anySimpleType")
    protected String dateProduced;
    @XmlAttribute(name = "date-publ")
    @XmlSchemaType(name = "anySimpleType")
    protected String datePubl;
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
     * Gets the value of the bibliographicData property.
     * 
     * @return
     *     possible object is
     *     {@link BibliographicData }
     *     
     */
    public BibliographicData getBibliographicData() {
        return bibliographicData;
    }

    /**
     * Sets the value of the bibliographicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliographicData }
     *     
     */
    public void setBibliographicData(BibliographicData value) {
        this.bibliographicData = value;
    }

    /**
     * Gets the value of the sdobi property.
     * 
     * @return
     *     possible object is
     *     {@link SDOBI }
     *     
     */
    public SDOBI getSDOBI() {
        return sdobi;
    }

    /**
     * Sets the value of the sdobi property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDOBI }
     *     
     */
    public void setSDOBI(SDOBI value) {
        this.sdobi = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the claims property.
     * 
     * @return
     *     possible object is
     *     {@link Claims }
     *     
     */
    public Claims getClaims() {
        return claims;
    }

    /**
     * Sets the value of the claims property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claims }
     *     
     */
    public void setClaims(Claims value) {
        this.claims = value;
    }

    /**
     * Gets the value of the amendedClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amendedClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendedClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmendedClaims }
     * 
     * 
     */
    public List<AmendedClaims> getAmendedClaims() {
        if (amendedClaims == null) {
            amendedClaims = new ArrayList<AmendedClaims>();
        }
        return this.amendedClaims;
    }

    /**
     * Gets the value of the amendedClaimsStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amendedClaimsStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendedClaimsStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmendedClaimsStatement }
     * 
     * 
     */
    public List<AmendedClaimsStatement> getAmendedClaimsStatement() {
        if (amendedClaimsStatement == null) {
            amendedClaimsStatement = new ArrayList<AmendedClaimsStatement>();
        }
        return this.amendedClaimsStatement;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abstract }
     * 
     * 
     */
    public List<Abstract> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<Abstract>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the drawings property.
     * 
     * @return
     *     possible object is
     *     {@link Drawings }
     *     
     */
    public Drawings getDrawings() {
        return drawings;
    }

    /**
     * Sets the value of the drawings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drawings }
     *     
     */
    public void setDrawings(Drawings value) {
        this.drawings = value;
    }

    /**
     * Gets the value of the searchReportData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the searchReportData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchReportData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchReportData }
     * 
     * 
     */
    public List<SearchReportData> getSearchReportData() {
        if (searchReportData == null) {
            searchReportData = new ArrayList<SearchReportData>();
        }
        return this.searchReportData;
    }

    /**
     * Gets the value of the sequenceListDoc property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceListDoc }
     *     
     */
    public SequenceListDoc getSequenceListDoc() {
        return sequenceListDoc;
    }

    /**
     * Sets the value of the sequenceListDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceListDoc }
     *     
     */
    public void setSequenceListDoc(SequenceListDoc value) {
        this.sequenceListDoc = value;
    }

    /**
     * Gets the value of the tableExternalDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tableExternalDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableExternalDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableExternalDoc }
     * 
     * 
     */
    public List<TableExternalDoc> getTableExternalDoc() {
        if (tableExternalDoc == null) {
            tableExternalDoc = new ArrayList<TableExternalDoc>();
        }
        return this.tableExternalDoc;
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
     * Gets the value of the dtdVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtdVersion() {
        return dtdVersion;
    }

    /**
     * Sets the value of the dtdVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtdVersion(String value) {
        this.dtdVersion = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the fileReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceId() {
        return fileReferenceId;
    }

    /**
     * Sets the value of the fileReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceId(String value) {
        this.fileReferenceId = value;
    }

    /**
     * Gets the value of the correctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionCode() {
        return correctionCode;
    }

    /**
     * Sets the value of the correctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionCode(String value) {
        this.correctionCode = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
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
     * Gets the value of the datePubl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePubl() {
        return datePubl;
    }

    /**
     * Sets the value of the datePubl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePubl(String value) {
        this.datePubl = value;
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