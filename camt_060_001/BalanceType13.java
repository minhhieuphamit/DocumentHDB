//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 04:48:12 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_060_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceType13">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.07}BalanceType10Choice"/>
 *         &lt;element name="SubTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.07}BalanceSubType1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType13", propOrder = {
    "cdOrPrtry",
    "subTp"
})
public class BalanceType13 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected BalanceType10Choice cdOrPrtry;
    @XmlElement(name = "SubTp")
    protected BalanceSubType1Choice subTp;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType10Choice }
     *     
     */
    public BalanceType10Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType10Choice }
     *     
     */
    public void setCdOrPrtry(BalanceType10Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public BalanceSubType1Choice getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public void setSubTp(BalanceSubType1Choice value) {
        this.subTp = value;
    }

}
