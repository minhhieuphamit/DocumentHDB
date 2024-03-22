//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 09:25:55 AM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_052_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountAndCurrencyExchange4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountAndCurrencyExchange4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.12}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         &lt;element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.12}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         &lt;element name="CntrValAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.12}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         &lt;element name="AnncdPstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.12}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         &lt;element name="PrtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.12}AmountAndCurrencyExchangeDetails6" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchange4", propOrder = {
    "instdAmt",
    "txAmt",
    "cntrValAmt",
    "anncdPstngAmt",
    "prtryAmt"
})
public class AmountAndCurrencyExchange4 {

    @XmlElement(name = "InstdAmt")
    protected AmountAndCurrencyExchangeDetails5 instdAmt;
    @XmlElement(name = "TxAmt")
    protected AmountAndCurrencyExchangeDetails5 txAmt;
    @XmlElement(name = "CntrValAmt")
    protected AmountAndCurrencyExchangeDetails5 cntrValAmt;
    @XmlElement(name = "AnncdPstngAmt")
    protected AmountAndCurrencyExchangeDetails5 anncdPstngAmt;
    @XmlElement(name = "PrtryAmt")
    protected List<AmountAndCurrencyExchangeDetails6> prtryAmt;

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setInstdAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setTxAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the cntrValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getCntrValAmt() {
        return cntrValAmt;
    }

    /**
     * Sets the value of the cntrValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setCntrValAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.cntrValAmt = value;
    }

    /**
     * Gets the value of the anncdPstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    /**
     * Sets the value of the anncdPstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setAnncdPstngAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.anncdPstngAmt = value;
    }

    /**
     * Gets the value of the prtryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndCurrencyExchangeDetails6 }
     * 
     * 
     */
    public List<AmountAndCurrencyExchangeDetails6> getPrtryAmt() {
        if (prtryAmt == null) {
            prtryAmt = new ArrayList<AmountAndCurrencyExchangeDetails6>();
        }
        return this.prtryAmt;
    }

}
