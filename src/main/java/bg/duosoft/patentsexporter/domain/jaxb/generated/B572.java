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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B572 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B572"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}dnum" minOccurs="0"/&gt;
 *         &lt;element ref="{}date" minOccurs="0"/&gt;
 *         &lt;element ref="{}ctry" minOccurs="0"/&gt;
 *         &lt;element ref="{}kind" minOccurs="0"/&gt;
 *         &lt;element ref="{}bnum" minOccurs="0"/&gt;
 *         &lt;element ref="{}dtxt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B572", propOrder = {
    "dnum",
    "date",
    "ctry",
    "kind",
    "bnum",
    "dtxt"
})
public class B572 {

    protected Dnum dnum;
    protected Date date;
    protected Ctry ctry;
    protected Kind kind;
    protected Bnum bnum;
    protected List<Dtxt> dtxt;

    /**
     * Gets the value of the dnum property.
     * 
     * @return
     *     possible object is
     *     {@link Dnum }
     *     
     */
    public Dnum getDnum() {
        return dnum;
    }

    /**
     * Sets the value of the dnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dnum }
     *     
     */
    public void setDnum(Dnum value) {
        this.dnum = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link Ctry }
     *     
     */
    public Ctry getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ctry }
     *     
     */
    public void setCtry(Ctry value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link Kind }
     *     
     */
    public Kind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kind }
     *     
     */
    public void setKind(Kind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the bnum property.
     * 
     * @return
     *     possible object is
     *     {@link Bnum }
     *     
     */
    public Bnum getBnum() {
        return bnum;
    }

    /**
     * Sets the value of the bnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bnum }
     *     
     */
    public void setBnum(Bnum value) {
        this.bnum = value;
    }

    /**
     * Gets the value of the dtxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dtxt }
     * 
     * 
     */
    public List<Dtxt> getDtxt() {
        if (dtxt == null) {
            dtxt = new ArrayList<Dtxt>();
        }
        return this.dtxt;
    }

}
