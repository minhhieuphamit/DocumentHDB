//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 04:48:12 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_060_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.07}EntryStatus1Choice"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.07}CreditDebitCode"/>
 *         &lt;element name="FlrLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.07}Limit2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType2", propOrder = {
    "sts",
    "cdtDbtInd",
    "flrLmt"
})
public class TransactionType2 {

    @XmlElement(name = "Sts", required = true)
    protected EntryStatus1Choice sts;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "FlrLmt")
    protected List<Limit2> flrLmt;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link EntryStatus1Choice }
     *     
     */
    public EntryStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryStatus1Choice }
     *     
     */
    public void setSts(EntryStatus1Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the flrLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flrLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlrLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Limit2 }
     * 
     * 
     */
    public List<Limit2> getFlrLmt() {
        if (flrLmt == null) {
            flrLmt = new ArrayList<Limit2>();
        }
        return this.flrLmt;
    }

}
