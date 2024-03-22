//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 02:57:40 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_028_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingTransaction8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingTransaction8Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Initn" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.12}UnderlyingPaymentInstruction9"/>
 *         &lt;element name="IntrBk" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.12}UnderlyingPaymentTransaction8"/>
 *         &lt;element name="StmtNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.12}UnderlyingStatementEntry3"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction8Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry"
})
public class UnderlyingTransaction8Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction9 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction8 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry3 stmtNtry;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction9 }
     *     
     */
    public UnderlyingPaymentInstruction9 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction9 }
     *     
     */
    public void setInitn(UnderlyingPaymentInstruction9 value) {
        this.initn = value;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction8 }
     *     
     */
    public UnderlyingPaymentTransaction8 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction8 }
     *     
     */
    public void setIntrBk(UnderlyingPaymentTransaction8 value) {
        this.intrBk = value;
    }

    /**
     * Gets the value of the stmtNtry property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingStatementEntry3 }
     *     
     */
    public UnderlyingStatementEntry3 getStmtNtry() {
        return stmtNtry;
    }

    /**
     * Sets the value of the stmtNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingStatementEntry3 }
     *     
     */
    public void setStmtNtry(UnderlyingStatementEntry3 value) {
        this.stmtNtry = value;
    }

}
