//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 02:57:58 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionOfInvestigationV13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionOfInvestigationV13">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}CaseAssignment6"/>
 *         &lt;element name="RslvdCase" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}Case6" minOccurs="0"/>
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}InvestigationStatus6Choice"/>
 *         &lt;element name="CxlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}UnderlyingTransaction32" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ModDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}PaymentTransaction157" minOccurs="0"/>
 *         &lt;element name="ClmNonRctDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}ClaimNonReceipt3Choice" minOccurs="0"/>
 *         &lt;element name="StmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}StatementResolutionEntry5" minOccurs="0"/>
 *         &lt;element name="CrrctnTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}CorrectiveTransaction5Choice" minOccurs="0"/>
 *         &lt;element name="RsltnRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}ResolutionData5" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV13", propOrder = {
    "assgnmt",
    "rslvdCase",
    "sts",
    "cxlDtls",
    "modDtls",
    "clmNonRctDtls",
    "stmtDtls",
    "crrctnTx",
    "rsltnRltdInf",
    "splmtryData"
})
public class ResolutionOfInvestigationV13 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment6 assgnmt;
    @XmlElement(name = "RslvdCase")
    protected Case6 rslvdCase;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus6Choice sts;
    @XmlElement(name = "CxlDtls")
    protected List<UnderlyingTransaction32> cxlDtls;
    @XmlElement(name = "ModDtls")
    protected PaymentTransaction157 modDtls;
    @XmlElement(name = "ClmNonRctDtls")
    protected ClaimNonReceipt3Choice clmNonRctDtls;
    @XmlElement(name = "StmtDtls")
    protected StatementResolutionEntry5 stmtDtls;
    @XmlElement(name = "CrrctnTx")
    protected CorrectiveTransaction5Choice crrctnTx;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionData5 rsltnRltdInf;
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
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case6 }
     *     
     */
    public Case6 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case6 }
     *     
     */
    public void setRslvdCase(Case6 value) {
        this.rslvdCase = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus6Choice }
     *     
     */
    public InvestigationStatus6Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus6Choice }
     *     
     */
    public void setSts(InvestigationStatus6Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingTransaction32 }
     * 
     * 
     */
    public List<UnderlyingTransaction32> getCxlDtls() {
        if (cxlDtls == null) {
            cxlDtls = new ArrayList<UnderlyingTransaction32>();
        }
        return this.cxlDtls;
    }

    /**
     * Gets the value of the modDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction157 }
     *     
     */
    public PaymentTransaction157 getModDtls() {
        return modDtls;
    }

    /**
     * Sets the value of the modDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction157 }
     *     
     */
    public void setModDtls(PaymentTransaction157 value) {
        this.modDtls = value;
    }

    /**
     * Gets the value of the clmNonRctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceipt3Choice }
     *     
     */
    public ClaimNonReceipt3Choice getClmNonRctDtls() {
        return clmNonRctDtls;
    }

    /**
     * Sets the value of the clmNonRctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceipt3Choice }
     *     
     */
    public void setClmNonRctDtls(ClaimNonReceipt3Choice value) {
        this.clmNonRctDtls = value;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StatementResolutionEntry5 }
     *     
     */
    public StatementResolutionEntry5 getStmtDtls() {
        return stmtDtls;
    }

    /**
     * Sets the value of the stmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementResolutionEntry5 }
     *     
     */
    public void setStmtDtls(StatementResolutionEntry5 value) {
        this.stmtDtls = value;
    }

    /**
     * Gets the value of the crrctnTx property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveTransaction5Choice }
     *     
     */
    public CorrectiveTransaction5Choice getCrrctnTx() {
        return crrctnTx;
    }

    /**
     * Sets the value of the crrctnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveTransaction5Choice }
     *     
     */
    public void setCrrctnTx(CorrectiveTransaction5Choice value) {
        this.crrctnTx = value;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionData5 }
     *     
     */
    public ResolutionData5 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionData5 }
     *     
     */
    public void setRsltnRltdInf(ResolutionData5 value) {
        this.rsltnRltdInf = value;
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