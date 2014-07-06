//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Connection Protection.
 * 
 * <p>Java class for ConnectionTimetableDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionTimetablePayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTimetableDeliveryStructure", propOrder = {
    "timetabledFeederArrival",
    "timetabledFeederArrivalCancellation",
    "extensions"
})
public class ConnectionTimetableDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "TimetabledFeederArrival")
    protected List<TimetabledFeederArrivalStructure> timetabledFeederArrival;
    @XmlElement(name = "TimetabledFeederArrivalCancellation")
    protected List<TimetabledFeederArrivalCancellationStructure> timetabledFeederArrivalCancellation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the timetabledFeederArrival property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetabledFeederArrival property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetabledFeederArrival().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetabledFeederArrivalStructure }
     * 
     * 
     */
    public List<TimetabledFeederArrivalStructure> getTimetabledFeederArrival() {
        if (timetabledFeederArrival == null) {
            timetabledFeederArrival = new ArrayList<TimetabledFeederArrivalStructure>();
        }
        return this.timetabledFeederArrival;
    }

    /**
     * Gets the value of the timetabledFeederArrivalCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetabledFeederArrivalCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetabledFeederArrivalCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetabledFeederArrivalCancellationStructure }
     * 
     * 
     */
    public List<TimetabledFeederArrivalCancellationStructure> getTimetabledFeederArrivalCancellation() {
        if (timetabledFeederArrivalCancellation == null) {
            timetabledFeederArrivalCancellation = new ArrayList<TimetabledFeederArrivalCancellationStructure>();
        }
        return this.timetabledFeederArrivalCancellation;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
