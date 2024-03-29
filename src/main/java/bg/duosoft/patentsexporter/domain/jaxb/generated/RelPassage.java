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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rel-passage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rel-passage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}text"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}passage" maxOccurs="unbounded"/&gt;
 *           &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;element ref="{}category"/&gt;
 *             &lt;element ref="{}rel-claims" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "rel-passage", propOrder = {
    "text",
    "passage",
    "categoryAndRelClaims"
})
public class RelPassage {

    protected Text text;
    protected List<Passage> passage;
    @XmlElements({
        @XmlElement(name = "category", type = Category.class),
        @XmlElement(name = "rel-claims", type = RelClaims.class)
    })
    protected List<Object> categoryAndRelClaims;

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
     * Gets the value of the passage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passage }
     * 
     * 
     */
    public List<Passage> getPassage() {
        if (passage == null) {
            passage = new ArrayList<Passage>();
        }
        return this.passage;
    }

    /**
     * Gets the value of the categoryAndRelClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the categoryAndRelClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryAndRelClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * {@link RelClaims }
     * 
     * 
     */
    public List<Object> getCategoryAndRelClaims() {
        if (categoryAndRelClaims == null) {
            categoryAndRelClaims = new ArrayList<Object>();
        }
        return this.categoryAndRelClaims;
    }

}
