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
 * <p>Java class for republication-notes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="republication-notes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}republication-note" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "republication-notes", propOrder = {
    "republicationNote"
})
public class RepublicationNotes {

    @XmlElement(name = "republication-note", required = true)
    protected List<RepublicationNote> republicationNote;

    /**
     * Gets the value of the republicationNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the republicationNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepublicationNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepublicationNote }
     * 
     * 
     */
    public List<RepublicationNote> getRepublicationNote() {
        if (republicationNote == null) {
            republicationNote = new ArrayList<RepublicationNote>();
        }
        return this.republicationNote;
    }

}
