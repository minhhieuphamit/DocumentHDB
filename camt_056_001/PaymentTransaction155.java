//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 03:15:41 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_056_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentTransaction155 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransaction155">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxlId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}Max35Text" minOccurs="0"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}Case6" minOccurs="0"/>
 *         &lt;element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}OriginalGroupInformation29" minOccurs="0"/>
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}UUIDv4Identifier" minOccurs="0"/>
 *         &lt;element name="OrgnlClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="OrgnlIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}ISODate" minOccurs="0"/>
 *         &lt;element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}BranchAndFinancialInstitutionIdentification8" minOccurs="0"/>
 *         &lt;element name="Assgne" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}BranchAndFinancialInstitutionIdentification8" minOccurs="0"/>
 *         &lt;element name="CxlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}PaymentCancellationReason6" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}OriginalTransactionReference42" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction155", propOrder = {
    "cxlId",
    "_case",
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlUETR",
    "orgnlClrSysRef",
    "orgnlIntrBkSttlmAmt",
    "orgnlIntrBkSttlmDt",
    "assgnr",
    "assgne",
    "cxlRsnInf",
    "orgnlTxRef",
    "splmtryData"
})
public class PaymentTransaction155 {

    @XmlElement(name = "CxlId")
    protected String cxlId;
    @XmlElement(name = "Case")
    protected Case6 _case;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "OrgnlClrSysRef")
    protected String orgnlClrSysRef;
    @XmlElement(name = "OrgnlIntrBkSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlIntrBkSttlmAmt;
    @XmlElement(name = "OrgnlIntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlIntrBkSttlmDt;
    @XmlElement(name = "Assgnr")
    protected BranchAndFinancialInstitutionIdentification8 assgnr;
    @XmlElement(name = "Assgne")
    protected BranchAndFinancialInstitutionIdentification8 assgne;
    @XmlElement(name = "CxlRsnInf")
    protected List<PaymentCancellationReason6> cxlRsnInf;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference42 orgnlTxRef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the cxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlId() {
        return cxlId;
    }

    /**
     * Sets the value of the cxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlId(String value) {
        this.cxlId = value;
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
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTxId(String value) {
        this.orgnlTxId = value;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

    /**
     * Gets the value of the orgnlClrSysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlClrSysRef() {
        return orgnlClrSysRef;
    }

    /**
     * Sets the value of the orgnlClrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlClrSysRef(String value) {
        this.orgnlClrSysRef = value;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlIntrBkSttlmAmt() {
        return orgnlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOrgnlIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlIntrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlIntrBkSttlmDt() {
        return orgnlIntrBkSttlmDt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.orgnlIntrBkSttlmDt = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setAssgnr(BranchAndFinancialInstitutionIdentification8 value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setAssgne(BranchAndFinancialInstitutionIdentification8 value) {
        this.assgne = value;
    }

    /**
     * Gets the value of the cxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCancellationReason6 }
     * 
     * 
     */
    public List<PaymentCancellationReason6> getCxlRsnInf() {
        if (cxlRsnInf == null) {
            cxlRsnInf = new ArrayList<PaymentCancellationReason6>();
        }
        return this.cxlRsnInf;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference42 }
     *     
     */
    public OriginalTransactionReference42 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference42 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference42 value) {
        this.orgnlTxRef = value;
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
