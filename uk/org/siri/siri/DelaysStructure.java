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
import javax.xml.datatype.Duration;
import eu.datex2.schema._2_0rc1._2_0.DelaysTypeEnum;


/**
 * Type for easement info.
 * 
 * <p>Java class for DelaysStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelaysStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelayBand" type="{http://www.siri.org.uk/siri}DelayBandEnumeration" minOccurs="0"/>
 *         &lt;element name="DelayType" type="{http://datex2.eu/schema/2_0RC1/2_0}DelaysTypeEnum" minOccurs="0"/>
 *         &lt;element name="Delay" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelaysStructure", propOrder = {
    "delayBand",
    "delayType",
    "delay"
})
public class DelaysStructure {

    @XmlElement(name = "DelayBand")
    protected DelayBandEnumeration delayBand;
    @XmlElement(name = "DelayType")
    protected DelaysTypeEnum delayType;
    @XmlElement(name = "Delay")
    protected Duration delay;

    /**
     * Gets the value of the delayBand property.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public DelayBandEnumeration getDelayBand() {
        return delayBand;
    }

    /**
     * Sets the value of the delayBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public void setDelayBand(DelayBandEnumeration value) {
        this.delayBand = value;
    }

    /**
     * Gets the value of the delayType property.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelayType() {
        return delayType;
    }

    /**
     * Sets the value of the delayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelayType(DelaysTypeEnum value) {
        this.delayType = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

}
