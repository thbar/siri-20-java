//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideServiceDisruptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadsideServiceDisruptionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="barClosed"/>
 *     &lt;enumeration value="dieselShortage"/>
 *     &lt;enumeration value="fuelShortage"/>
 *     &lt;enumeration value="lpgShortage"/>
 *     &lt;enumeration value="methaneShortage"/>
 *     &lt;enumeration value="noDieselForHeavyVehicles"/>
 *     &lt;enumeration value="noDieselForLightVehicles"/>
 *     &lt;enumeration value="noPublicTelephones"/>
 *     &lt;enumeration value="noToiletFacilities"/>
 *     &lt;enumeration value="noVehicleRepairFacilities"/>
 *     &lt;enumeration value="petrolShortage"/>
 *     &lt;enumeration value="restAreaBusy"/>
 *     &lt;enumeration value="restAreaClosed"/>
 *     &lt;enumeration value="restAreaOvercrowdedDriveToAnotherRestArea"/>
 *     &lt;enumeration value="serviceAreaBusy"/>
 *     &lt;enumeration value="serviceAreaClosed"/>
 *     &lt;enumeration value="serviceAreaFuelStationClosed"/>
 *     &lt;enumeration value="serviceAreaOvercrowdedDriveToAnotherServiceArea"/>
 *     &lt;enumeration value="serviceAreaRestaurantClosed"/>
 *     &lt;enumeration value="someCommercialServicesClosed"/>
 *     &lt;enumeration value="waterShortage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadsideServiceDisruptionTypeEnum")
@XmlEnum
public enum RoadsideServiceDisruptionTypeEnum {

    @XmlEnumValue("barClosed")
    BAR_CLOSED("barClosed"),
    @XmlEnumValue("dieselShortage")
    DIESEL_SHORTAGE("dieselShortage"),
    @XmlEnumValue("fuelShortage")
    FUEL_SHORTAGE("fuelShortage"),
    @XmlEnumValue("lpgShortage")
    LPG_SHORTAGE("lpgShortage"),
    @XmlEnumValue("methaneShortage")
    METHANE_SHORTAGE("methaneShortage"),
    @XmlEnumValue("noDieselForHeavyVehicles")
    NO_DIESEL_FOR_HEAVY_VEHICLES("noDieselForHeavyVehicles"),
    @XmlEnumValue("noDieselForLightVehicles")
    NO_DIESEL_FOR_LIGHT_VEHICLES("noDieselForLightVehicles"),
    @XmlEnumValue("noPublicTelephones")
    NO_PUBLIC_TELEPHONES("noPublicTelephones"),
    @XmlEnumValue("noToiletFacilities")
    NO_TOILET_FACILITIES("noToiletFacilities"),
    @XmlEnumValue("noVehicleRepairFacilities")
    NO_VEHICLE_REPAIR_FACILITIES("noVehicleRepairFacilities"),
    @XmlEnumValue("petrolShortage")
    PETROL_SHORTAGE("petrolShortage"),
    @XmlEnumValue("restAreaBusy")
    REST_AREA_BUSY("restAreaBusy"),
    @XmlEnumValue("restAreaClosed")
    REST_AREA_CLOSED("restAreaClosed"),
    @XmlEnumValue("restAreaOvercrowdedDriveToAnotherRestArea")
    REST_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_REST_AREA("restAreaOvercrowdedDriveToAnotherRestArea"),
    @XmlEnumValue("serviceAreaBusy")
    SERVICE_AREA_BUSY("serviceAreaBusy"),
    @XmlEnumValue("serviceAreaClosed")
    SERVICE_AREA_CLOSED("serviceAreaClosed"),
    @XmlEnumValue("serviceAreaFuelStationClosed")
    SERVICE_AREA_FUEL_STATION_CLOSED("serviceAreaFuelStationClosed"),
    @XmlEnumValue("serviceAreaOvercrowdedDriveToAnotherServiceArea")
    SERVICE_AREA_OVERCROWDED_DRIVE_TO_ANOTHER_SERVICE_AREA("serviceAreaOvercrowdedDriveToAnotherServiceArea"),
    @XmlEnumValue("serviceAreaRestaurantClosed")
    SERVICE_AREA_RESTAURANT_CLOSED("serviceAreaRestaurantClosed"),
    @XmlEnumValue("someCommercialServicesClosed")
    SOME_COMMERCIAL_SERVICES_CLOSED("someCommercialServicesClosed"),
    @XmlEnumValue("waterShortage")
    WATER_SHORTAGE("waterShortage");
    private final String value;

    RoadsideServiceDisruptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideServiceDisruptionTypeEnum fromValue(String v) {
        for (RoadsideServiceDisruptionTypeEnum c: RoadsideServiceDisruptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
