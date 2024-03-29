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
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for us-rights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="us-rights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="to-dead-inventor" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="kind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="administratrix"/&gt;
 *             &lt;enumeration value="executrix"/&gt;
 *             &lt;enumeration value="estate"/&gt;
 *             &lt;enumeration value="legal-heirs"/&gt;
 *             &lt;enumeration value="heiress"/&gt;
 *             &lt;enumeration value="executors"/&gt;
 *             &lt;enumeration value="administrator"/&gt;
 *             &lt;enumeration value="heir"/&gt;
 *             &lt;enumeration value="heirs"/&gt;
 *             &lt;enumeration value="legal-representative"/&gt;
 *             &lt;enumeration value="legal-representatives"/&gt;
 *             &lt;enumeration value="executor"/&gt;
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
@XmlType(name = "us-rights", propOrder = {
    "content"
})
public class UsRights {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "to-dead-inventor", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String toDeadInventor;
    @XmlAttribute(name = "kind", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kind;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the toDeadInventor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDeadInventor() {
        return toDeadInventor;
    }

    /**
     * Sets the value of the toDeadInventor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDeadInventor(String value) {
        this.toDeadInventor = value;
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

}
