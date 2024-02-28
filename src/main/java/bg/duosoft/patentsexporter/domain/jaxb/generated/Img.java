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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for img complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="img"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="he" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="wi" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="alt" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="img-content" default="drawing"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="graph"/&gt;
 *             &lt;enumeration value="program-listing"/&gt;
 *             &lt;enumeration value="photograph"/&gt;
 *             &lt;enumeration value="math"/&gt;
 *             &lt;enumeration value="dna"/&gt;
 *             &lt;enumeration value="flowchart"/&gt;
 *             &lt;enumeration value="drawing"/&gt;
 *             &lt;enumeration value="table"/&gt;
 *             &lt;enumeration value="character"/&gt;
 *             &lt;enumeration value="undefined"/&gt;
 *             &lt;enumeration value="chem"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="img-format" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="tif"/&gt;
 *             &lt;enumeration value="jpg"/&gt;
 *             &lt;enumeration value="st33"/&gt;
 *             &lt;enumeration value="st35"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="orientation" default="portrait"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="landscape"/&gt;
 *             &lt;enumeration value="portrait"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="inline" default="no"&gt;
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
@XmlType(name = "img")
public class Img {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "he", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String he;
    @XmlAttribute(name = "wi", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String wi;
    @XmlAttribute(name = "file", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String file;
    @XmlAttribute(name = "alt")
    @XmlSchemaType(name = "anySimpleType")
    protected String alt;
    @XmlAttribute(name = "img-content")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imgContent;
    @XmlAttribute(name = "img-format", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imgFormat;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "inline")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inline;

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

    /**
     * Gets the value of the he property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHe() {
        return he;
    }

    /**
     * Sets the value of the he property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHe(String value) {
        this.he = value;
    }

    /**
     * Gets the value of the wi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWi() {
        return wi;
    }

    /**
     * Sets the value of the wi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWi(String value) {
        this.wi = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    /**
     * Gets the value of the imgContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgContent() {
        if (imgContent == null) {
            return "drawing";
        } else {
            return imgContent;
        }
    }

    /**
     * Sets the value of the imgContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgContent(String value) {
        this.imgContent = value;
    }

    /**
     * Gets the value of the imgFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFormat() {
        return imgFormat;
    }

    /**
     * Sets the value of the imgFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFormat(String value) {
        this.imgFormat = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the inline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInline() {
        if (inline == null) {
            return "no";
        } else {
            return inline;
        }
    }

    /**
     * Sets the value of the inline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInline(String value) {
        this.inline = value;
    }

}