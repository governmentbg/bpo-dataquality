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
 * <p>Java class for patent-family complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patent-family"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}priority-application"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}family-member" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{}text"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patent-family", propOrder = {
    "priorityApplication",
    "familyMember",
    "text"
})
public class PatentFamily {

    @XmlElement(name = "priority-application", required = true)
    protected PriorityApplication priorityApplication;
    @XmlElement(name = "family-member")
    protected List<FamilyMember> familyMember;
    protected Text text;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the priorityApplication property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityApplication }
     *     
     */
    public PriorityApplication getPriorityApplication() {
        return priorityApplication;
    }

    /**
     * Sets the value of the priorityApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityApplication }
     *     
     */
    public void setPriorityApplication(PriorityApplication value) {
        this.priorityApplication = value;
    }

    /**
     * Gets the value of the familyMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the familyMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyMember }
     * 
     * 
     */
    public List<FamilyMember> getFamilyMember() {
        if (familyMember == null) {
            familyMember = new ArrayList<FamilyMember>();
        }
        return this.familyMember;
    }

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