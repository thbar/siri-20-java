//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package uk.org.ifopt.ifopt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a collection of one or more references to ADMINISTRATIVE ZONEs.
 * 
 * <p>Java class for AdministrativeAreaRefsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrativeAreaRefsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdministrativeAreaRef" type="{http://www.ifopt.org.uk/ifopt}AdministrativeAreaVersionedRefStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrativeAreaRefsStructure", propOrder = {
    "administrativeAreaRef"
})
public class AdministrativeAreaRefsStructure {

    @XmlElement(name = "AdministrativeAreaRef", required = true)
    protected List<AdministrativeAreaVersionedRefStructure> administrativeAreaRef;

    /**
     * Gets the value of the administrativeAreaRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeAreaRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeAreaRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeAreaVersionedRefStructure }
     * 
     * 
     */
    public List<AdministrativeAreaVersionedRefStructure> getAdministrativeAreaRef() {
        if (administrativeAreaRef == null) {
            administrativeAreaRef = new ArrayList<AdministrativeAreaVersionedRefStructure>();
        }
        return this.administrativeAreaRef;
    }

}