//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicant-name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicant-name"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{}name"/&gt;
 *             &lt;sequence&gt;
 *               &lt;element ref="{}prefix" minOccurs="0"/&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{}last-name"/&gt;
 *                 &lt;element ref="{}orgname"/&gt;
 *               &lt;/choice&gt;
 *               &lt;element ref="{}first-name" minOccurs="0"/&gt;
 *               &lt;element ref="{}middle-name" minOccurs="0"/&gt;
 *               &lt;element ref="{}first-last-name" minOccurs="0"/&gt;
 *               &lt;element ref="{}second-last-name" minOccurs="0"/&gt;
 *               &lt;element ref="{}suffix" minOccurs="0"/&gt;
 *               &lt;element ref="{}iid" minOccurs="0"/&gt;
 *               &lt;element ref="{}role" minOccurs="0"/&gt;
 *               &lt;element ref="{}orgname" minOccurs="0"/&gt;
 *               &lt;element ref="{}department" minOccurs="0"/&gt;
 *               &lt;element ref="{}synonym" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{}registered-number" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicant-name", propOrder = {
    "content"
})
public class ApplicantName {

    @XmlElementRefs({
        @XmlElementRef(name = "name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prefix", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "last-name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "orgname", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "first-name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "middle-name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "first-last-name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "second-last-name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "suffix", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "iid", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "role", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "department", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "synonym", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "registered-number", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Orgname" is used by two different parts of a schema. See: 
     * line 4344 of file:/D:/Local%20workspace/patents-exporter/src/main/schema/bg-patent-document-v2-3BG.xsd
     * line 4335 of file:/D:/Local%20workspace/patents-exporter/src/main/schema/bg-patent-document-v2-3BG.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Name }{@code >}
     * {@link JAXBElement }{@code <}{@link Prefix }{@code >}
     * {@link JAXBElement }{@code <}{@link LastName }{@code >}
     * {@link JAXBElement }{@code <}{@link Orgname }{@code >}
     * {@link JAXBElement }{@code <}{@link FirstName }{@code >}
     * {@link JAXBElement }{@code <}{@link MiddleName }{@code >}
     * {@link JAXBElement }{@code <}{@link FirstLastName }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondLastName }{@code >}
     * {@link JAXBElement }{@code <}{@link Suffix }{@code >}
     * {@link JAXBElement }{@code <}{@link Iid }{@code >}
     * {@link JAXBElement }{@code <}{@link Role }{@code >}
     * {@link JAXBElement }{@code <}{@link Department }{@code >}
     * {@link JAXBElement }{@code <}{@link Synonym }{@code >}
     * {@link JAXBElement }{@code <}{@link RegisteredNumber }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
