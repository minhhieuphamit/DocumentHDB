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
 * <p>Java class for AuthenticationEntity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationEntity1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ICCD"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="MERC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationEntity1Code")
@XmlEnum
public enum AuthenticationEntity1Code {

    ICCD,
    AGNT,
    MERC;

    public String value() {
        return name();
    }

    public static AuthenticationEntity1Code fromValue(String v) {
        return valueOf(v);
    }

}
