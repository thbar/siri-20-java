//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceOptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceOptionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="advisory"/>
 *     &lt;enumeration value="mandatory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComplianceOptionEnum")
@XmlEnum
public enum ComplianceOptionEnum {

    @XmlEnumValue("advisory")
    ADVISORY("advisory"),
    @XmlEnumValue("mandatory")
    MANDATORY("mandatory");
    private final String value;

    ComplianceOptionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceOptionEnum fromValue(String v) {
        for (ComplianceOptionEnum c: ComplianceOptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}