//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoachSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoachSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti3_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti3_1"/>
 *     &lt;enumeration value="internationalCoachService"/>
 *     &lt;enumeration value="pti3_2"/>
 *     &lt;enumeration value="nationalCoachService"/>
 *     &lt;enumeration value="pti3_3"/>
 *     &lt;enumeration value="shuttleCoachService"/>
 *     &lt;enumeration value="pti3_4"/>
 *     &lt;enumeration value="regionalCoachService"/>
 *     &lt;enumeration value="pti3_5"/>
 *     &lt;enumeration value="specialCoachService"/>
 *     &lt;enumeration value="pti3_6"/>
 *     &lt;enumeration value="sightseeingCoachService"/>
 *     &lt;enumeration value="pti3_7"/>
 *     &lt;enumeration value="touristCoachService"/>
 *     &lt;enumeration value="pti3_8"/>
 *     &lt;enumeration value="commuterCoachService"/>
 *     &lt;enumeration value="pti3_9"/>
 *     &lt;enumeration value="allCoachServices"/>
 *     &lt;enumeration value="pti3_255"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoachSubmodesOfTransportEnumeration")
@XmlEnum
public enum CoachSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti3_0")
    PTI_3_0("pti3_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti3_1")
    PTI_3_1("pti3_1"),
    @XmlEnumValue("internationalCoachService")
    INTERNATIONAL_COACH_SERVICE("internationalCoachService"),
    @XmlEnumValue("pti3_2")
    PTI_3_2("pti3_2"),
    @XmlEnumValue("nationalCoachService")
    NATIONAL_COACH_SERVICE("nationalCoachService"),
    @XmlEnumValue("pti3_3")
    PTI_3_3("pti3_3"),
    @XmlEnumValue("shuttleCoachService")
    SHUTTLE_COACH_SERVICE("shuttleCoachService"),
    @XmlEnumValue("pti3_4")
    PTI_3_4("pti3_4"),
    @XmlEnumValue("regionalCoachService")
    REGIONAL_COACH_SERVICE("regionalCoachService"),
    @XmlEnumValue("pti3_5")
    PTI_3_5("pti3_5"),
    @XmlEnumValue("specialCoachService")
    SPECIAL_COACH_SERVICE("specialCoachService"),
    @XmlEnumValue("pti3_6")
    PTI_3_6("pti3_6"),
    @XmlEnumValue("sightseeingCoachService")
    SIGHTSEEING_COACH_SERVICE("sightseeingCoachService"),
    @XmlEnumValue("pti3_7")
    PTI_3_7("pti3_7"),
    @XmlEnumValue("touristCoachService")
    TOURIST_COACH_SERVICE("touristCoachService"),
    @XmlEnumValue("pti3_8")
    PTI_3_8("pti3_8"),
    @XmlEnumValue("commuterCoachService")
    COMMUTER_COACH_SERVICE("commuterCoachService"),
    @XmlEnumValue("pti3_9")
    PTI_3_9("pti3_9"),
    @XmlEnumValue("allCoachServices")
    ALL_COACH_SERVICES("allCoachServices"),
    @XmlEnumValue("pti3_255")
    PTI_3_255("pti3_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    CoachSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoachSubmodesOfTransportEnumeration fromValue(String v) {
        for (CoachSubmodesOfTransportEnumeration c: CoachSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
