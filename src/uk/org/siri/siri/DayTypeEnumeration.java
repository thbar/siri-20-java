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
 * <p>Java class for DayTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti34_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti34_1"/>
 *     &lt;enumeration value="monday"/>
 *     &lt;enumeration value="pti34_2"/>
 *     &lt;enumeration value="tuesday"/>
 *     &lt;enumeration value="pti34_3"/>
 *     &lt;enumeration value="wednesday"/>
 *     &lt;enumeration value="pti34_4"/>
 *     &lt;enumeration value="thursday"/>
 *     &lt;enumeration value="pti34_5"/>
 *     &lt;enumeration value="friday"/>
 *     &lt;enumeration value="pti34_6"/>
 *     &lt;enumeration value="saturday"/>
 *     &lt;enumeration value="pti34_7"/>
 *     &lt;enumeration value="sunday"/>
 *     &lt;enumeration value="pti34_8"/>
 *     &lt;enumeration value="weekdays"/>
 *     &lt;enumeration value="pti34_9"/>
 *     &lt;enumeration value="weekends"/>
 *     &lt;enumeration value="pti34_10"/>
 *     &lt;enumeration value="holiday"/>
 *     &lt;enumeration value="pti34_11"/>
 *     &lt;enumeration value="publicHoliday"/>
 *     &lt;enumeration value="pti34_12"/>
 *     &lt;enumeration value="religiousHoliday"/>
 *     &lt;enumeration value="pti34_13"/>
 *     &lt;enumeration value="federalHoliday"/>
 *     &lt;enumeration value="pti34_14"/>
 *     &lt;enumeration value="regionalHoliday"/>
 *     &lt;enumeration value="pti34_15"/>
 *     &lt;enumeration value="nationalHoliday"/>
 *     &lt;enumeration value="pti34_16"/>
 *     &lt;enumeration value="mondayToFriday"/>
 *     &lt;enumeration value="pti34_17"/>
 *     &lt;enumeration value="mondayToSaturday"/>
 *     &lt;enumeration value="pti34_18"/>
 *     &lt;enumeration value="sundaysAndPublicHolidays"/>
 *     &lt;enumeration value="pti34_19"/>
 *     &lt;enumeration value="schoolDays"/>
 *     &lt;enumeration value="pti34_20"/>
 *     &lt;enumeration value="everyDay"/>
 *     &lt;enumeration value="pti34_255"/>
 *     &lt;enumeration value="undefinedDayType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayTypeEnumeration")
@XmlEnum
public enum DayTypeEnumeration {

    @XmlEnumValue("pti34_0")
    PTI_34_0("pti34_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti34_1")
    PTI_34_1("pti34_1"),
    @XmlEnumValue("monday")
    MONDAY("monday"),
    @XmlEnumValue("pti34_2")
    PTI_34_2("pti34_2"),
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),
    @XmlEnumValue("pti34_3")
    PTI_34_3("pti34_3"),
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),
    @XmlEnumValue("pti34_4")
    PTI_34_4("pti34_4"),
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),
    @XmlEnumValue("pti34_5")
    PTI_34_5("pti34_5"),
    @XmlEnumValue("friday")
    FRIDAY("friday"),
    @XmlEnumValue("pti34_6")
    PTI_34_6("pti34_6"),
    @XmlEnumValue("saturday")
    SATURDAY("saturday"),
    @XmlEnumValue("pti34_7")
    PTI_34_7("pti34_7"),
    @XmlEnumValue("sunday")
    SUNDAY("sunday"),
    @XmlEnumValue("pti34_8")
    PTI_34_8("pti34_8"),
    @XmlEnumValue("weekdays")
    WEEKDAYS("weekdays"),
    @XmlEnumValue("pti34_9")
    PTI_34_9("pti34_9"),
    @XmlEnumValue("weekends")
    WEEKENDS("weekends"),
    @XmlEnumValue("pti34_10")
    PTI_34_10("pti34_10"),
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),
    @XmlEnumValue("pti34_11")
    PTI_34_11("pti34_11"),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),
    @XmlEnumValue("pti34_12")
    PTI_34_12("pti34_12"),
    @XmlEnumValue("religiousHoliday")
    RELIGIOUS_HOLIDAY("religiousHoliday"),
    @XmlEnumValue("pti34_13")
    PTI_34_13("pti34_13"),
    @XmlEnumValue("federalHoliday")
    FEDERAL_HOLIDAY("federalHoliday"),
    @XmlEnumValue("pti34_14")
    PTI_34_14("pti34_14"),
    @XmlEnumValue("regionalHoliday")
    REGIONAL_HOLIDAY("regionalHoliday"),
    @XmlEnumValue("pti34_15")
    PTI_34_15("pti34_15"),
    @XmlEnumValue("nationalHoliday")
    NATIONAL_HOLIDAY("nationalHoliday"),
    @XmlEnumValue("pti34_16")
    PTI_34_16("pti34_16"),
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY("mondayToFriday"),
    @XmlEnumValue("pti34_17")
    PTI_34_17("pti34_17"),
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY("mondayToSaturday"),
    @XmlEnumValue("pti34_18")
    PTI_34_18("pti34_18"),
    @XmlEnumValue("sundaysAndPublicHolidays")
    SUNDAYS_AND_PUBLIC_HOLIDAYS("sundaysAndPublicHolidays"),
    @XmlEnumValue("pti34_19")
    PTI_34_19("pti34_19"),
    @XmlEnumValue("schoolDays")
    SCHOOL_DAYS("schoolDays"),
    @XmlEnumValue("pti34_20")
    PTI_34_20("pti34_20"),
    @XmlEnumValue("everyDay")
    EVERY_DAY("everyDay"),
    @XmlEnumValue("pti34_255")
    PTI_34_255("pti34_255"),
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE("undefinedDayType");
    private final String value;

    DayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayTypeEnumeration fromValue(String v) {
        for (DayTypeEnumeration c: DayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
