//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 09:10:14 PM EDT 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Subscription for General Message Service.
 * 
 * <p>Java class for GeneralMessageSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}GeneralMessageRequest"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageSubscriptionStructure", propOrder = {
    "generalMessageRequest",
    "extensions"
})
public class GeneralMessageSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "GeneralMessageRequest", required = true)
    protected GeneralMessageRequestStructure generalMessageRequest;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the generalMessageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageRequestStructure }
     *     
     */
    public GeneralMessageRequestStructure getGeneralMessageRequest() {
        return generalMessageRequest;
    }

    /**
     * Sets the value of the generalMessageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageRequestStructure }
     *     
     */
    public void setGeneralMessageRequest(GeneralMessageRequestStructure value) {
        this.generalMessageRequest = value;
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

}