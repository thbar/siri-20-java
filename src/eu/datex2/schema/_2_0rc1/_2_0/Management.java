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
 * <p>Java class for Management complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Management">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lifeCycleManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}LifeCycleManagement" minOccurs="0"/>
 *         &lt;element name="filterExitManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterExitManagement" minOccurs="0"/>
 *         &lt;element name="managementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", propOrder = {
    "lifeCycleManagement",
    "filterExitManagement",
    "managementExtension"
})
public class Management {

    protected LifeCycleManagement lifeCycleManagement;
    protected FilterExitManagement filterExitManagement;
    protected ExtensionType managementExtension;

    /**
     * Gets the value of the lifeCycleManagement property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleManagement }
     *     
     */
    public LifeCycleManagement getLifeCycleManagement() {
        return lifeCycleManagement;
    }

    /**
     * Sets the value of the lifeCycleManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleManagement }
     *     
     */
    public void setLifeCycleManagement(LifeCycleManagement value) {
        this.lifeCycleManagement = value;
    }

    /**
     * Gets the value of the filterExitManagement property.
     * 
     * @return
     *     possible object is
     *     {@link FilterExitManagement }
     *     
     */
    public FilterExitManagement getFilterExitManagement() {
        return filterExitManagement;
    }

    /**
     * Sets the value of the filterExitManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExitManagement }
     *     
     */
    public void setFilterExitManagement(FilterExitManagement value) {
        this.filterExitManagement = value;
    }

    /**
     * Gets the value of the managementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagementExtension() {
        return managementExtension;
    }

    /**
     * Sets the value of the managementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagementExtension(ExtensionType value) {
        this.managementExtension = value;
    }

}
