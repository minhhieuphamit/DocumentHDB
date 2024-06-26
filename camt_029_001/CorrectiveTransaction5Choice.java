//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 02:57:58 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectiveTransaction5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectiveTransaction5Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Initn" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}CorrectivePaymentInitiation5"/>
 *         &lt;element name="IntrBk" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.13}CorrectiveInterbankTransaction3"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveTransaction5Choice", propOrder = {
    "initn",
    "intrBk"
})
public class CorrectiveTransaction5Choice {

    @XmlElement(name = "Initn")
    protected CorrectivePaymentInitiation5 initn;
    @XmlElement(name = "IntrBk")
    protected CorrectiveInterbankTransaction3 intrBk;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectivePaymentInitiation5 }
     *     
     */
    public CorrectivePaymentInitiation5 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectivePaymentInitiation5 }
     *     
     */
    public void setInitn(CorrectivePaymentInitiation5 value) {
        this.initn = value;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveInterbankTransaction3 }
     *     
     */
    public CorrectiveInterbankTransaction3 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveInterbankTransaction3 }
     *     
     */
    public void setIntrBk(CorrectiveInterbankTransaction3 value) {
        this.intrBk = value;
    }

}
