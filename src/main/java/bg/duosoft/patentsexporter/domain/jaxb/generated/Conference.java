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
 * <p>Java class for conference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}text"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}conftitle"/&gt;
 *           &lt;element ref="{}confdate" minOccurs="0"/&gt;
 *           &lt;element ref="{}confno" minOccurs="0"/&gt;
 *           &lt;element ref="{}confplace" minOccurs="0"/&gt;
 *           &lt;element ref="{}confsponsor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conference", propOrder = {
    "text",
    "conftitle",
    "confdate",
    "confno",
    "confplace",
    "confsponsor"
})
public class Conference {

    protected Text text;
    protected Conftitle conftitle;
    protected Confdate confdate;
    protected Confno confno;
    protected Confplace confplace;
    protected List<Confsponsor> confsponsor;

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
     * Gets the value of the conftitle property.
     * 
     * @return
     *     possible object is
     *     {@link Conftitle }
     *     
     */
    public Conftitle getConftitle() {
        return conftitle;
    }

    /**
     * Sets the value of the conftitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conftitle }
     *     
     */
    public void setConftitle(Conftitle value) {
        this.conftitle = value;
    }

    /**
     * Gets the value of the confdate property.
     * 
     * @return
     *     possible object is
     *     {@link Confdate }
     *     
     */
    public Confdate getConfdate() {
        return confdate;
    }

    /**
     * Sets the value of the confdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confdate }
     *     
     */
    public void setConfdate(Confdate value) {
        this.confdate = value;
    }

    /**
     * Gets the value of the confno property.
     * 
     * @return
     *     possible object is
     *     {@link Confno }
     *     
     */
    public Confno getConfno() {
        return confno;
    }

    /**
     * Sets the value of the confno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confno }
     *     
     */
    public void setConfno(Confno value) {
        this.confno = value;
    }

    /**
     * Gets the value of the confplace property.
     * 
     * @return
     *     possible object is
     *     {@link Confplace }
     *     
     */
    public Confplace getConfplace() {
        return confplace;
    }

    /**
     * Sets the value of the confplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confplace }
     *     
     */
    public void setConfplace(Confplace value) {
        this.confplace = value;
    }

    /**
     * Gets the value of the confsponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the confsponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfsponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Confsponsor }
     * 
     * 
     */
    public List<Confsponsor> getConfsponsor() {
        if (confsponsor == null) {
            confsponsor = new ArrayList<Confsponsor>();
        }
        return this.confsponsor;
    }

}
