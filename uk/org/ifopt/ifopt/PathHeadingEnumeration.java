//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PathHeadingEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PathHeadingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="forward"/>
 *     &lt;enumeration value="back"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathHeadingEnumeration")
@XmlEnum
public enum PathHeadingEnumeration {

    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("back")
    BACK("back");
    private final String value;

    PathHeadingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathHeadingEnumeration fromValue(String v) {
        for (PathHeadingEnumeration c: PathHeadingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
