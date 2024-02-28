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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for dl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}dt"/&gt;
 *         &lt;element ref="{}dd"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tsize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="compact"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="compact"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dl", propOrder = {
    "dtAndDd"
})
public class Dl {

    @XmlElements({
        @XmlElement(name = "dt", required = true, type = Dt.class),
        @XmlElement(name = "dd", required = true, type = Dd.class)
    })
    protected List<Object> dtAndDd;
    @XmlAttribute(name = "tsize")
    @XmlSchemaType(name = "anySimpleType")
    protected String tsize;
    @XmlAttribute(name = "compact")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compact;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the dtAndDd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtAndDd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtAndDd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dt }
     * {@link Dd }
     * 
     * 
     */
    public List<Object> getDtAndDd() {
        if (dtAndDd == null) {
            dtAndDd = new ArrayList<Object>();
        }
        return this.dtAndDd;
    }

    /**
     * Gets the value of the tsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsize() {
        return tsize;
    }

    /**
     * Sets the value of the tsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsize(String value) {
        this.tsize = value;
    }

    /**
     * Gets the value of the compact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompact() {
        return compact;
    }

    /**
     * Sets the value of the compact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompact(String value) {
        this.compact = value;
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

}
