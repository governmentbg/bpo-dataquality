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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for srep-prior-art-docs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="srep-prior-art-docs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}doc-page"/&gt;
 *         &lt;element ref="{}prior-art-xml-doc"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="prior-art" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "srep-prior-art-docs", propOrder = {
    "docPageOrPriorArtXmlDoc"
})
public class SrepPriorArtDocs {

    @XmlElements({
        @XmlElement(name = "doc-page", type = DocPage.class),
        @XmlElement(name = "prior-art-xml-doc", type = PriorArtXmlDoc.class)
    })
    protected List<Object> docPageOrPriorArtXmlDoc;
    @XmlAttribute(name = "prior-art", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String priorArt;

    /**
     * Gets the value of the docPageOrPriorArtXmlDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the docPageOrPriorArtXmlDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocPageOrPriorArtXmlDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocPage }
     * {@link PriorArtXmlDoc }
     * 
     * 
     */
    public List<Object> getDocPageOrPriorArtXmlDoc() {
        if (docPageOrPriorArtXmlDoc == null) {
            docPageOrPriorArtXmlDoc = new ArrayList<Object>();
        }
        return this.docPageOrPriorArtXmlDoc;
    }

    /**
     * Gets the value of the priorArt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorArt() {
        return priorArt;
    }

    /**
     * Sets the value of the priorArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorArt(String value) {
        this.priorArt = value;
    }

}
