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
 * <p>Java class for serial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}sertitle"/&gt;
 *         &lt;element ref="{}alttitle" minOccurs="0"/&gt;
 *         &lt;element ref="{}subname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}issue" minOccurs="0"/&gt;
 *         &lt;element ref="{}imprint" minOccurs="0"/&gt;
 *         &lt;element ref="{}pubdate" minOccurs="0"/&gt;
 *         &lt;element ref="{}descrip" minOccurs="0"/&gt;
 *         &lt;element ref="{}notes" minOccurs="0"/&gt;
 *         &lt;element ref="{}pubid" minOccurs="0"/&gt;
 *         &lt;element ref="{}vid" minOccurs="0"/&gt;
 *         &lt;element ref="{}ino" minOccurs="0"/&gt;
 *         &lt;element ref="{}doi" minOccurs="0"/&gt;
 *         &lt;element ref="{}issn" minOccurs="0"/&gt;
 *         &lt;element ref="{}isbn" minOccurs="0"/&gt;
 *         &lt;element ref="{}cpyrt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serial", propOrder = {
    "sertitle",
    "alttitle",
    "subname",
    "issue",
    "imprint",
    "pubdate",
    "descrip",
    "notes",
    "pubid",
    "vid",
    "ino",
    "doi",
    "issn",
    "isbn",
    "cpyrt"
})
public class Serial {

    @XmlElement(required = true)
    protected Sertitle sertitle;
    protected Alttitle alttitle;
    protected List<Subname> subname;
    protected Issue issue;
    protected Imprint imprint;
    protected Pubdate pubdate;
    protected Descrip descrip;
    protected Notes notes;
    protected Pubid pubid;
    protected Vid vid;
    protected Ino ino;
    protected Doi doi;
    protected Issn issn;
    protected Isbn isbn;
    protected Cpyrt cpyrt;

    /**
     * Gets the value of the sertitle property.
     * 
     * @return
     *     possible object is
     *     {@link Sertitle }
     *     
     */
    public Sertitle getSertitle() {
        return sertitle;
    }

    /**
     * Sets the value of the sertitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sertitle }
     *     
     */
    public void setSertitle(Sertitle value) {
        this.sertitle = value;
    }

    /**
     * Gets the value of the alttitle property.
     * 
     * @return
     *     possible object is
     *     {@link Alttitle }
     *     
     */
    public Alttitle getAlttitle() {
        return alttitle;
    }

    /**
     * Sets the value of the alttitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alttitle }
     *     
     */
    public void setAlttitle(Alttitle value) {
        this.alttitle = value;
    }

    /**
     * Gets the value of the subname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subname }
     * 
     * 
     */
    public List<Subname> getSubname() {
        if (subname == null) {
            subname = new ArrayList<Subname>();
        }
        return this.subname;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link Issue }
     *     
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issue }
     *     
     */
    public void setIssue(Issue value) {
        this.issue = value;
    }

    /**
     * Gets the value of the imprint property.
     * 
     * @return
     *     possible object is
     *     {@link Imprint }
     *     
     */
    public Imprint getImprint() {
        return imprint;
    }

    /**
     * Sets the value of the imprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Imprint }
     *     
     */
    public void setImprint(Imprint value) {
        this.imprint = value;
    }

    /**
     * Gets the value of the pubdate property.
     * 
     * @return
     *     possible object is
     *     {@link Pubdate }
     *     
     */
    public Pubdate getPubdate() {
        return pubdate;
    }

    /**
     * Sets the value of the pubdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pubdate }
     *     
     */
    public void setPubdate(Pubdate value) {
        this.pubdate = value;
    }

    /**
     * Gets the value of the descrip property.
     * 
     * @return
     *     possible object is
     *     {@link Descrip }
     *     
     */
    public Descrip getDescrip() {
        return descrip;
    }

    /**
     * Sets the value of the descrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descrip }
     *     
     */
    public void setDescrip(Descrip value) {
        this.descrip = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the pubid property.
     * 
     * @return
     *     possible object is
     *     {@link Pubid }
     *     
     */
    public Pubid getPubid() {
        return pubid;
    }

    /**
     * Sets the value of the pubid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pubid }
     *     
     */
    public void setPubid(Pubid value) {
        this.pubid = value;
    }

    /**
     * Gets the value of the vid property.
     * 
     * @return
     *     possible object is
     *     {@link Vid }
     *     
     */
    public Vid getVid() {
        return vid;
    }

    /**
     * Sets the value of the vid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vid }
     *     
     */
    public void setVid(Vid value) {
        this.vid = value;
    }

    /**
     * Gets the value of the ino property.
     * 
     * @return
     *     possible object is
     *     {@link Ino }
     *     
     */
    public Ino getIno() {
        return ino;
    }

    /**
     * Sets the value of the ino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ino }
     *     
     */
    public void setIno(Ino value) {
        this.ino = value;
    }

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link Doi }
     *     
     */
    public Doi getDoi() {
        return doi;
    }

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doi }
     *     
     */
    public void setDoi(Doi value) {
        this.doi = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link Issn }
     *     
     */
    public Issn getIssn() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issn }
     *     
     */
    public void setIssn(Issn value) {
        this.issn = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link Isbn }
     *     
     */
    public Isbn getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Isbn }
     *     
     */
    public void setIsbn(Isbn value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the cpyrt property.
     * 
     * @return
     *     possible object is
     *     {@link Cpyrt }
     *     
     */
    public Cpyrt getCpyrt() {
        return cpyrt;
    }

    /**
     * Sets the value of the cpyrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cpyrt }
     *     
     */
    public void setCpyrt(Cpyrt value) {
        this.cpyrt = value;
    }

}
