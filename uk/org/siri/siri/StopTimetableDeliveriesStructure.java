//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for stop timetable deliveries. Used in WSDL.
 * 
 * <p>Java class for StopTimetableDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetableDelivery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimetableDeliveriesStructure", propOrder = {
    "stopTimetableDelivery"
})
public class StopTimetableDeliveriesStructure {

    @XmlElement(name = "StopTimetableDelivery", required = true)
    protected StopTimetableDeliveryStructure stopTimetableDelivery;

    /**
     * Gets the value of the stopTimetableDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableDeliveryStructure }
     *     
     */
    public StopTimetableDeliveryStructure getStopTimetableDelivery() {
        return stopTimetableDelivery;
    }

    /**
     * Sets the value of the stopTimetableDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableDeliveryStructure }
     *     
     */
    public void setStopTimetableDelivery(StopTimetableDeliveryStructure value) {
        this.stopTimetableDelivery = value;
    }

}
