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
 * <p>Java class for ServiceConditionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceConditionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti13_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti13_1"/>
 *     &lt;enumeration value="altered"/>
 *     &lt;enumeration value="pti13_2"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="pti13_3"/>
 *     &lt;enumeration value="delayed"/>
 *     &lt;enumeration value="pti13_4"/>
 *     &lt;enumeration value="diverted"/>
 *     &lt;enumeration value="pti13_5"/>
 *     &lt;enumeration value="noService"/>
 *     &lt;enumeration value="pti13_6"/>
 *     &lt;enumeration value="disrupted"/>
 *     &lt;enumeration value="pti13_7"/>
 *     &lt;enumeration value="additionalService"/>
 *     &lt;enumeration value="pti13_8"/>
 *     &lt;enumeration value="specialService"/>
 *     &lt;enumeration value="pti13_9"/>
 *     &lt;enumeration value="onTime"/>
 *     &lt;enumeration value="pti13_10"/>
 *     &lt;enumeration value="normalService"/>
 *     &lt;enumeration value="pti13_11"/>
 *     &lt;enumeration value="intermittentService"/>
 *     &lt;enumeration value="pti13_12"/>
 *     &lt;enumeration value="shortFormedService"/>
 *     &lt;enumeration value="pti13_13"/>
 *     &lt;enumeration value="fullLengthService"/>
 *     &lt;enumeration value="pti13_14"/>
 *     &lt;enumeration value="extendedService"/>
 *     &lt;enumeration value="pti13_15"/>
 *     &lt;enumeration value="splittingTrain"/>
 *     &lt;enumeration value="pti13_16"/>
 *     &lt;enumeration value="replacementTransport"/>
 *     &lt;enumeration value="pti13_17"/>
 *     &lt;enumeration value="arrivesEarly"/>
 *     &lt;enumeration value="pti13_18"/>
 *     &lt;enumeration value="shuttleService"/>
 *     &lt;enumeration value="pti13_19"/>
 *     &lt;enumeration value="replacementService"/>
 *     &lt;enumeration value="pti13_255"/>
 *     &lt;enumeration value="undefinedServiceInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceConditionEnumeration")
@XmlEnum
public enum ServiceConditionEnumeration {

    @XmlEnumValue("pti13_0")
    PTI_13_0("pti13_0"),

    /**
     * TPEG Pti13_unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti13_1")
    PTI_13_1("pti13_1"),

    /**
     * TPEG Pti13_altered.
     * 
     */
    @XmlEnumValue("altered")
    ALTERED("altered"),
    @XmlEnumValue("pti13_2")
    PTI_13_2("pti13_2"),

    /**
     * TPEG Pti13_cancelled.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("pti13_3")
    PTI_13_3("pti13_3"),

    /**
     * TPEG Pti13_delayed.
     * 
     */
    @XmlEnumValue("delayed")
    DELAYED("delayed"),
    @XmlEnumValue("pti13_4")
    PTI_13_4("pti13_4"),

    /**
     * TPEG Pti13_diverted.
     * 
     */
    @XmlEnumValue("diverted")
    DIVERTED("diverted"),
    @XmlEnumValue("pti13_5")
    PTI_13_5("pti13_5"),

    /**
     * TPEG Pti13_no service.
     * 
     */
    @XmlEnumValue("noService")
    NO_SERVICE("noService"),
    @XmlEnumValue("pti13_6")
    PTI_13_6("pti13_6"),

    /**
     * TPEG Pti13_disrupted.
     * 
     */
    @XmlEnumValue("disrupted")
    DISRUPTED("disrupted"),
    @XmlEnumValue("pti13_7")
    PTI_13_7("pti13_7"),

    /**
     * TPEG Pti13_additional service.
     * 
     */
    @XmlEnumValue("additionalService")
    ADDITIONAL_SERVICE("additionalService"),
    @XmlEnumValue("pti13_8")
    PTI_13_8("pti13_8"),

    /**
     * TPEG Pti13_special service.
     * 
     */
    @XmlEnumValue("specialService")
    SPECIAL_SERVICE("specialService"),
    @XmlEnumValue("pti13_9")
    PTI_13_9("pti13_9"),

    /**
     * TPEG Pti13_on time.
     * 
     */
    @XmlEnumValue("onTime")
    ON_TIME("onTime"),
    @XmlEnumValue("pti13_10")
    PTI_13_10("pti13_10"),

    /**
     * TPEG Pti13_normal service.
     * 
     */
    @XmlEnumValue("normalService")
    NORMAL_SERVICE("normalService"),
    @XmlEnumValue("pti13_11")
    PTI_13_11("pti13_11"),

    /**
     * TPEG Pti13_intermittent service.
     * 
     */
    @XmlEnumValue("intermittentService")
    INTERMITTENT_SERVICE("intermittentService"),
    @XmlEnumValue("pti13_12")
    PTI_13_12("pti13_12"),

    /**
     * TPEG Pti13_short formed service.
     * 
     */
    @XmlEnumValue("shortFormedService")
    SHORT_FORMED_SERVICE("shortFormedService"),
    @XmlEnumValue("pti13_13")
    PTI_13_13("pti13_13"),

    /**
     * TPEG Pti13_full length service.
     * 
     */
    @XmlEnumValue("fullLengthService")
    FULL_LENGTH_SERVICE("fullLengthService"),
    @XmlEnumValue("pti13_14")
    PTI_13_14("pti13_14"),

    /**
     * TPEG Pti13_extended service.
     * 
     */
    @XmlEnumValue("extendedService")
    EXTENDED_SERVICE("extendedService"),
    @XmlEnumValue("pti13_15")
    PTI_13_15("pti13_15"),

    /**
     * TPEG Pti13_splitting train.
     * 
     */
    @XmlEnumValue("splittingTrain")
    SPLITTING_TRAIN("splittingTrain"),
    @XmlEnumValue("pti13_16")
    PTI_13_16("pti13_16"),

    /**
     * TPEG Pti13_replacement transport.
     * 
     */
    @XmlEnumValue("replacementTransport")
    REPLACEMENT_TRANSPORT("replacementTransport"),
    @XmlEnumValue("pti13_17")
    PTI_13_17("pti13_17"),

    /**
     * TPEG Pti13_arrives early.
     * 
     */
    @XmlEnumValue("arrivesEarly")
    ARRIVES_EARLY("arrivesEarly"),
    @XmlEnumValue("pti13_18")
    PTI_13_18("pti13_18"),

    /**
     * TPEG Pti13_shuttle service.
     * 
     */
    @XmlEnumValue("shuttleService")
    SHUTTLE_SERVICE("shuttleService"),
    @XmlEnumValue("pti13_19")
    PTI_13_19("pti13_19"),

    /**
     * TPEG Pti13_replacement service.
     * 
     */
    @XmlEnumValue("replacementService")
    REPLACEMENT_SERVICE("replacementService"),
    @XmlEnumValue("pti13_255")
    PTI_13_255("pti13_255"),

    /**
     * TPEG Pti13_Undefined service information.
     * 
     */
    @XmlEnumValue("undefinedServiceInformation")
    UNDEFINED_SERVICE_INFORMATION("undefinedServiceInformation");
    private final String value;

    ServiceConditionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceConditionEnumeration fromValue(String v) {
        for (ServiceConditionEnumeration c: ServiceConditionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
