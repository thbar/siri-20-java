//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualVehicleMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualVehicleMeasurements">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="vehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleSpeed" minOccurs="0"/>
 *         &lt;element name="vehicleDetectionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleDetectionTime" minOccurs="0"/>
 *         &lt;element name="vehicleHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleHeadway" minOccurs="0"/>
 *         &lt;element name="individualVehicleMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleMeasurements", propOrder = {
    "vehicleSpeed",
    "vehicleDetectionTime",
    "vehicleHeadway",
    "individualVehicleMeasurementsExtension"
})
public class IndividualVehicleMeasurements
    extends TrafficValue
{

    protected VehicleSpeed vehicleSpeed;
    protected VehicleDetectionTime vehicleDetectionTime;
    protected VehicleHeadway vehicleHeadway;
    protected ExtensionType individualVehicleMeasurementsExtension;

    /**
     * Gets the value of the vehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpeed }
     *     
     */
    public VehicleSpeed getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Sets the value of the vehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpeed }
     *     
     */
    public void setVehicleSpeed(VehicleSpeed value) {
        this.vehicleSpeed = value;
    }

    /**
     * Gets the value of the vehicleDetectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public VehicleDetectionTime getVehicleDetectionTime() {
        return vehicleDetectionTime;
    }

    /**
     * Sets the value of the vehicleDetectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public void setVehicleDetectionTime(VehicleDetectionTime value) {
        this.vehicleDetectionTime = value;
    }

    /**
     * Gets the value of the vehicleHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleHeadway }
     *     
     */
    public VehicleHeadway getVehicleHeadway() {
        return vehicleHeadway;
    }

    /**
     * Sets the value of the vehicleHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleHeadway }
     *     
     */
    public void setVehicleHeadway(VehicleHeadway value) {
        this.vehicleHeadway = value;
    }

    /**
     * Gets the value of the individualVehicleMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualVehicleMeasurementsExtension() {
        return individualVehicleMeasurementsExtension;
    }

    /**
     * Sets the value of the individualVehicleMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualVehicleMeasurementsExtension(ExtensionType value) {
        this.individualVehicleMeasurementsExtension = value;
    }

}
