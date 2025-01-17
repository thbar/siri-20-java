//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadsideReferencePointIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="administrativeArea" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="directionRelative" type="{http://datex2.eu/schema/2_0RC1/2_0}ReferencePointDirectionEnum" minOccurs="0"/>
 *         &lt;element name="distanceFromPrevious" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="distanceToNext" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="elevatedRoadSection" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="roadsideReferencePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePoint", propOrder = {
    "roadsideReferencePointIdentifier",
    "administrativeArea",
    "roadName",
    "roadNumber",
    "directionBound",
    "directionRelative",
    "distanceFromPrevious",
    "distanceToNext",
    "elevatedRoadSection",
    "roadsideReferencePointDescription",
    "roadsideReferencePointDistance",
    "roadsideReferencePointExtension"
})
public class RoadsideReferencePoint {

    @XmlElement(required = true)
    protected String roadsideReferencePointIdentifier;
    protected MultilingualString administrativeArea;
    protected MultilingualString roadName;
    protected String roadNumber;
    @XmlSchemaType(name = "string")
    protected DirectionEnum directionBound;
    @XmlSchemaType(name = "string")
    protected ReferencePointDirectionEnum directionRelative;
    protected Float distanceFromPrevious;
    protected Float distanceToNext;
    protected Boolean elevatedRoadSection;
    protected MultilingualString roadsideReferencePointDescription;
    protected Float roadsideReferencePointDistance;
    protected ExtensionType roadsideReferencePointExtension;

    /**
     * Gets the value of the roadsideReferencePointIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadsideReferencePointIdentifier() {
        return roadsideReferencePointIdentifier;
    }

    /**
     * Sets the value of the roadsideReferencePointIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadsideReferencePointIdentifier(String value) {
        this.roadsideReferencePointIdentifier = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeArea(MultilingualString value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the directionBound property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Sets the value of the directionBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
    }

    /**
     * Gets the value of the directionRelative property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public ReferencePointDirectionEnum getDirectionRelative() {
        return directionRelative;
    }

    /**
     * Sets the value of the directionRelative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public void setDirectionRelative(ReferencePointDirectionEnum value) {
        this.directionRelative = value;
    }

    /**
     * Gets the value of the distanceFromPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    /**
     * Sets the value of the distanceFromPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceFromPrevious(Float value) {
        this.distanceFromPrevious = value;
    }

    /**
     * Gets the value of the distanceToNext property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceToNext() {
        return distanceToNext;
    }

    /**
     * Sets the value of the distanceToNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceToNext(Float value) {
        this.distanceToNext = value;
    }

    /**
     * Gets the value of the elevatedRoadSection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElevatedRoadSection() {
        return elevatedRoadSection;
    }

    /**
     * Sets the value of the elevatedRoadSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElevatedRoadSection(Boolean value) {
        this.elevatedRoadSection = value;
    }

    /**
     * Gets the value of the roadsideReferencePointDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadsideReferencePointDescription() {
        return roadsideReferencePointDescription;
    }

    /**
     * Sets the value of the roadsideReferencePointDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadsideReferencePointDescription(MultilingualString value) {
        this.roadsideReferencePointDescription = value;
    }

    /**
     * Gets the value of the roadsideReferencePointDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoadsideReferencePointDistance() {
        return roadsideReferencePointDistance;
    }

    /**
     * Sets the value of the roadsideReferencePointDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoadsideReferencePointDistance(Float value) {
        this.roadsideReferencePointDistance = value;
    }

    /**
     * Gets the value of the roadsideReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointExtension() {
        return roadsideReferencePointExtension;
    }

    /**
     * Sets the value of the roadsideReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointExtension(ExtensionType value) {
        this.roadsideReferencePointExtension = value;
    }

}
