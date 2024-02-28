//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}text"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}serpart" minOccurs="0"/&gt;
 *           &lt;element ref="{}sersect" minOccurs="0"/&gt;
 *           &lt;element ref="{}chapter" minOccurs="0"/&gt;
 *           &lt;element ref="{}pp" minOccurs="0"/&gt;
 *           &lt;element ref="{}column" minOccurs="0"/&gt;
 *           &lt;element ref="{}para" minOccurs="0"/&gt;
 *           &lt;element ref="{}line" minOccurs="0"/&gt;
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
@XmlType(name = "location", propOrder = {
    "text",
    "serpart",
    "sersect",
    "chapter",
    "pp",
    "column",
    "para",
    "line"
})
public class Location {

    protected Text text;
    protected Serpart serpart;
    protected Sersect sersect;
    protected Chapter chapter;
    protected Pp pp;
    protected Column column;
    protected Para para;
    protected Line line;

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
     * Gets the value of the serpart property.
     * 
     * @return
     *     possible object is
     *     {@link Serpart }
     *     
     */
    public Serpart getSerpart() {
        return serpart;
    }

    /**
     * Sets the value of the serpart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Serpart }
     *     
     */
    public void setSerpart(Serpart value) {
        this.serpart = value;
    }

    /**
     * Gets the value of the sersect property.
     * 
     * @return
     *     possible object is
     *     {@link Sersect }
     *     
     */
    public Sersect getSersect() {
        return sersect;
    }

    /**
     * Sets the value of the sersect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sersect }
     *     
     */
    public void setSersect(Sersect value) {
        this.sersect = value;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link Chapter }
     *     
     */
    public Chapter getChapter() {
        return chapter;
    }

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chapter }
     *     
     */
    public void setChapter(Chapter value) {
        this.chapter = value;
    }

    /**
     * Gets the value of the pp property.
     * 
     * @return
     *     possible object is
     *     {@link Pp }
     *     
     */
    public Pp getPp() {
        return pp;
    }

    /**
     * Sets the value of the pp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pp }
     *     
     */
    public void setPp(Pp value) {
        this.pp = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link Column }
     *     
     */
    public Column getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link Column }
     *     
     */
    public void setColumn(Column value) {
        this.column = value;
    }

    /**
     * Gets the value of the para property.
     * 
     * @return
     *     possible object is
     *     {@link Para }
     *     
     */
    public Para getPara() {
        return para;
    }

    /**
     * Sets the value of the para property.
     * 
     * @param value
     *     allowed object is
     *     {@link Para }
     *     
     */
    public void setPara(Para value) {
        this.para = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

}
