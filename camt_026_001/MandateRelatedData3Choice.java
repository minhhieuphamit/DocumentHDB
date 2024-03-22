//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 02:57:07 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_026_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateRelatedData3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateRelatedData3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DrctDbtMndt" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}MandateRelatedInformation16" minOccurs="0"/>
 *         &lt;element name="CdtTrfMndt" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}CreditTransferMandateData1" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedData3Choice", propOrder = {
    "drctDbtMndt",
    "cdtTrfMndt"
})
public class MandateRelatedData3Choice {

    @XmlElement(name = "DrctDbtMndt")
    protected MandateRelatedInformation16 drctDbtMndt;
    @XmlElement(name = "CdtTrfMndt")
    protected CreditTransferMandateData1 cdtTrfMndt;

    /**
     * Gets the value of the drctDbtMndt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation16 }
     *     
     */
    public MandateRelatedInformation16 getDrctDbtMndt() {
        return drctDbtMndt;
    }

    /**
     * Sets the value of the drctDbtMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation16 }
     *     
     */
    public void setDrctDbtMndt(MandateRelatedInformation16 value) {
        this.drctDbtMndt = value;
    }

    /**
     * Gets the value of the cdtTrfMndt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getCdtTrfMndt() {
        return cdtTrfMndt;
    }

    /**
     * Sets the value of the cdtTrfMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public void setCdtTrfMndt(CreditTransferMandateData1 value) {
        this.cdtTrfMndt = value;
    }

}