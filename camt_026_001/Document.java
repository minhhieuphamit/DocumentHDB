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
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UblToApply" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.10}UnableToApplyV10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ublToApply"
})
public class Document {

    @XmlElement(name = "UblToApply", required = true)
    protected UnableToApplyV10 ublToApply;

    /**
     * Gets the value of the ublToApply property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyV10 }
     *     
     */
    public UnableToApplyV10 getUblToApply() {
        return ublToApply;
    }

    /**
     * Sets the value of the ublToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyV10 }
     *     
     */
    public void setUblToApply(UnableToApplyV10 value) {
        this.ublToApply = value;
    }

}
