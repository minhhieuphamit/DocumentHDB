//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.22 at 04:47:58 PM ICT 
//


package iso.std.iso._20022.tech.xsd.camt_054_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnvironment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEnvironment1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MERC"/>
 *     &lt;enumeration value="PRIV"/>
 *     &lt;enumeration value="PUBL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionEnvironment1Code")
@XmlEnum
public enum TransactionEnvironment1Code {

    MERC,
    PRIV,
    PUBL;

    public String value() {
        return name();
    }

    public static TransactionEnvironment1Code fromValue(String v) {
        return valueOf(v);
    }

}
