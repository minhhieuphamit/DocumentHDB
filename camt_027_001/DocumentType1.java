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
 * <p>Java class for DocumentType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.10}DocumentType2Choice"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:camt.027.001.10}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType1", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class DocumentType1 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected DocumentType2Choice cdOrPrtry;
    @XmlElement(name = "Issr")
    protected String issr;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType2Choice }
     *     
     */
    public DocumentType2Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType2Choice }
     *     
     */
    public void setCdOrPrtry(DocumentType2Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
