//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuitabilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuitabilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="suitable"/>
 *     &lt;enumeration value="notSuitable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuitabilityEnumeration")
@XmlEnum
public enum SuitabilityEnumeration {

    @XmlEnumValue("suitable")
    SUITABLE("suitable"),
    @XmlEnumValue("notSuitable")
    NOT_SUITABLE("notSuitable");
    private final String value;

    SuitabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuitabilityEnumeration fromValue(String v) {
        for (SuitabilityEnumeration c: SuitabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
