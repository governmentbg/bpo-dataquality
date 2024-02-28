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
 * <p>Java class for srep-fields-searched complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="srep-fields-searched"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}minimum-documentation"/&gt;
 *         &lt;element ref="{}other-documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}database-searched" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "srep-fields-searched", propOrder = {
    "minimumDocumentation",
    "otherDocumentation",
    "databaseSearched"
})
public class SrepFieldsSearched {

    @XmlElement(name = "minimum-documentation", required = true)
    protected MinimumDocumentation minimumDocumentation;
    @XmlElement(name = "other-documentation")
    protected List<OtherDocumentation> otherDocumentation;
    @XmlElement(name = "database-searched")
    protected DatabaseSearched databaseSearched;

    /**
     * Gets the value of the minimumDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumDocumentation }
     *     
     */
    public MinimumDocumentation getMinimumDocumentation() {
        return minimumDocumentation;
    }

    /**
     * Sets the value of the minimumDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumDocumentation }
     *     
     */
    public void setMinimumDocumentation(MinimumDocumentation value) {
        this.minimumDocumentation = value;
    }

    /**
     * Gets the value of the otherDocumentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the otherDocumentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherDocumentation }
     * 
     * 
     */
    public List<OtherDocumentation> getOtherDocumentation() {
        if (otherDocumentation == null) {
            otherDocumentation = new ArrayList<OtherDocumentation>();
        }
        return this.otherDocumentation;
    }

    /**
     * Gets the value of the databaseSearched property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSearched }
     *     
     */
    public DatabaseSearched getDatabaseSearched() {
        return databaseSearched;
    }

    /**
     * Sets the value of the databaseSearched property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSearched }
     *     
     */
    public void setDatabaseSearched(DatabaseSearched value) {
        this.databaseSearched = value;
    }

}