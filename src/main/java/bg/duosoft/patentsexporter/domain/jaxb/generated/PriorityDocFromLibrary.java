//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priority-doc-from-library complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priority-doc-from-library"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="library-identifier" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="action-by" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priority-doc-from-library")
public class PriorityDocFromLibrary {

    @XmlAttribute(name = "library-identifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String libraryIdentifier;
    @XmlAttribute(name = "action-by")
    @XmlSchemaType(name = "anySimpleType")
    protected String actionBy;

    /**
     * Gets the value of the libraryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryIdentifier() {
        return libraryIdentifier;
    }

    /**
     * Sets the value of the libraryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryIdentifier(String value) {
        this.libraryIdentifier = value;
    }

    /**
     * Gets the value of the actionBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionBy() {
        return actionBy;
    }

    /**
     * Sets the value of the actionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionBy(String value) {
        this.actionBy = value;
    }

}
