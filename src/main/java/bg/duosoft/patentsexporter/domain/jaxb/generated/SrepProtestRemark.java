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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for srep-protest-remark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="srep-protest-remark"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="protest-remark" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="no-protest"/&gt;
 *             &lt;enumeration value="protest-fee-paid"/&gt;
 *             &lt;enumeration value="protest-fee-not-paid"/&gt;
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
@XmlType(name = "srep-protest-remark")
public class SrepProtestRemark {

    @XmlAttribute(name = "protest-remark", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String protestRemark;

    /**
     * Gets the value of the protestRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtestRemark() {
        return protestRemark;
    }

    /**
     * Sets the value of the protestRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtestRemark(String value) {
        this.protestRemark = value;
    }

}
