//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 03:05:27 PM ICT 
//


package iso.std.iso._20022.tech.xsd.pacs_003_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInstruction14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInstruction14">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SttlmMtd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.003.001.11}SettlementMethod2Code"/>
 *         &lt;element name="SttlmAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.003.001.11}CashAccount40" minOccurs="0"/>
 *         &lt;element name="ClrSys" type="{urn:iso:std:iso:20022:tech:xsd:pacs.003.001.11}ClearingSystemIdentification3Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstruction14", propOrder = {
    "sttlmMtd",
    "sttlmAcct",
    "clrSys"
})
public class SettlementInstruction14 {

    @XmlElement(name = "SttlmMtd", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementMethod2Code sttlmMtd;
    @XmlElement(name = "SttlmAcct")
    protected CashAccount40 sttlmAcct;
    @XmlElement(name = "ClrSys")
    protected ClearingSystemIdentification3Choice clrSys;

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod2Code }
     *     
     */
    public SettlementMethod2Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod2Code }
     *     
     */
    public void setSttlmMtd(SettlementMethod2Code value) {
        this.sttlmMtd = value;
    }

    /**
     * Gets the value of the sttlmAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getSttlmAcct() {
        return sttlmAcct;
    }

    /**
     * Sets the value of the sttlmAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setSttlmAcct(CashAccount40 value) {
        this.sttlmAcct = value;
    }

    /**
     * Gets the value of the clrSys property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification3Choice }
     *     
     */
    public ClearingSystemIdentification3Choice getClrSys() {
        return clrSys;
    }

    /**
     * Sets the value of the clrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification3Choice }
     *     
     */
    public void setClrSys(ClearingSystemIdentification3Choice value) {
        this.clrSys = value;
    }

}
