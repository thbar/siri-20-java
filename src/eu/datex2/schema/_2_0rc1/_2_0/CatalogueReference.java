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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogueReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyCatalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="catalogueReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueReference", propOrder = {
    "keyCatalogueReference",
    "catalogueReferenceExtension"
})
public class CatalogueReference {

    @XmlElement(required = true)
    protected String keyCatalogueReference;
    protected ExtensionType catalogueReferenceExtension;

    /**
     * Gets the value of the keyCatalogueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCatalogueReference() {
        return keyCatalogueReference;
    }

    /**
     * Sets the value of the keyCatalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCatalogueReference(String value) {
        this.keyCatalogueReference = value;
    }

    /**
     * Gets the value of the catalogueReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCatalogueReferenceExtension() {
        return catalogueReferenceExtension;
    }

    /**
     * Sets the value of the catalogueReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCatalogueReferenceExtension(ExtensionType value) {
        this.catalogueReferenceExtension = value;
    }

}
