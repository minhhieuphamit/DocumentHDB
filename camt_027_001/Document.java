//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 02:57:19 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_027_001;

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
 *         &lt;element name="ClmNonRct" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.10}ClaimNonReceiptV10"/>
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
    "clmNonRct"
})
public class Document {

    @XmlElement(name = "ClmNonRct", required = true)
    protected ClaimNonReceiptV10 clmNonRct;

    /**
     * Gets the value of the clmNonRct property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceiptV10 }
     *     
     */
    public ClaimNonReceiptV10 getClmNonRct() {
        return clmNonRct;
    }

    /**
     * Sets the value of the clmNonRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceiptV10 }
     *     
     */
    public void setClmNonRct(ClaimNonReceiptV10 value) {
        this.clmNonRct = value;
    }

}
