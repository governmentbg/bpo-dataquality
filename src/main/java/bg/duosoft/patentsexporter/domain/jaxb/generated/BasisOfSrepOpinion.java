//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 03:57:02 PM EEST 
//


package bg.duosoft.patentsexporter.domain.jaxb.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basis-of-srep-opinion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basis-of-srep-opinion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}translation-of-appl" minOccurs="0"/&gt;
 *         &lt;element ref="{}sequence-list-basis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basis-of-srep-opinion", propOrder = {
    "translationOfAppl",
    "sequenceListBasis"
})
public class BasisOfSrepOpinion {

    @XmlElement(name = "translation-of-appl")
    protected TranslationOfAppl translationOfAppl;
    @XmlElement(name = "sequence-list-basis")
    protected SequenceListBasis sequenceListBasis;

    /**
     * Gets the value of the translationOfAppl property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationOfAppl }
     *     
     */
    public TranslationOfAppl getTranslationOfAppl() {
        return translationOfAppl;
    }

    /**
     * Sets the value of the translationOfAppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationOfAppl }
     *     
     */
    public void setTranslationOfAppl(TranslationOfAppl value) {
        this.translationOfAppl = value;
    }

    /**
     * Gets the value of the sequenceListBasis property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceListBasis }
     *     
     */
    public SequenceListBasis getSequenceListBasis() {
        return sequenceListBasis;
    }

    /**
     * Sets the value of the sequenceListBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceListBasis }
     *     
     */
    public void setSequenceListBasis(SequenceListBasis value) {
        this.sequenceListBasis = value;
    }

}
