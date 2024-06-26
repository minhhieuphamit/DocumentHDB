//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 02:57:07 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_026_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyV10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnableToApplyV10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}CaseAssignment6"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}Case6" minOccurs="0"/>
 *         &lt;element name="Undrlyg" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}UnderlyingTransaction8Choice"/>
 *         &lt;element name="Justfn" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}UnableToApplyJustification4Choice"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyV10", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "justfn",
    "splmtryData"
})
public class UnableToApplyV10 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment6 assgnmt;
    @XmlElement(name = "Case")
    protected Case6 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction8Choice undrlyg;
    @XmlElement(name = "Justfn", required = true)
    protected UnableToApplyJustification4Choice justfn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment6 }
     *     
     */
    public CaseAssignment6 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment6 }
     *     
     */
    public void setAssgnmt(CaseAssignment6 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case6 }
     *     
     */
    public Case6 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case6 }
     *     
     */
    public void setCase(Case6 value) {
        this._case = value;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction8Choice }
     *     
     */
    public UnderlyingTransaction8Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction8Choice }
     *     
     */
    public void setUndrlyg(UnderlyingTransaction8Choice value) {
        this.undrlyg = value;
    }

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyJustification4Choice }
     *     
     */
    public UnableToApplyJustification4Choice getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyJustification4Choice }
     *     
     */
    public void setJustfn(UnableToApplyJustification4Choice value) {
        this.justfn = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
