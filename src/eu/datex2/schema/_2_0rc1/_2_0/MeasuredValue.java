//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasuredValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasuredValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="locationCharacteristicsOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationCharacteristicsOverride" minOccurs="0"/>
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"/>
 *         &lt;element name="measuredValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredValue", propOrder = {
    "measurementEquipmentTypeUsed",
    "locationCharacteristicsOverride",
    "basicDataValue",
    "measuredValueExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.SiteMeasurements.MeasuredValue.class
})
public class MeasuredValue {

    protected MultilingualString measurementEquipmentTypeUsed;
    protected LocationCharacteristicsOverride locationCharacteristicsOverride;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType measuredValueExtension;

    /**
     * Gets the value of the measurementEquipmentTypeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Sets the value of the measurementEquipmentTypeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Gets the value of the locationCharacteristicsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public LocationCharacteristicsOverride getLocationCharacteristicsOverride() {
        return locationCharacteristicsOverride;
    }

    /**
     * Sets the value of the locationCharacteristicsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public void setLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        this.locationCharacteristicsOverride = value;
    }

    /**
     * Gets the value of the basicDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Sets the value of the basicDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    /**
     * Gets the value of the measuredValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredValueExtension() {
        return measuredValueExtension;
    }

    /**
     * Sets the value of the measuredValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredValueExtension(ExtensionType value) {
        this.measuredValueExtension = value;
    }

}