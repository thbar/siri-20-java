//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 08:24:17 PM JST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Response to a request to terminate a subscription or subscriptions.
 * 
 * <p>Java class for TerminateSubscriptionResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseEndpointStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminationStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionResponseStructure", propOrder = {
    "terminationResponseStatus"
})
public class TerminateSubscriptionResponseStructure
    extends ResponseEndpointStructure
{

    @XmlElement(name = "TerminationResponseStatus")
    protected List<TerminationResponseStatusStructure> terminationResponseStatus;

    /**
     * Gets the value of the terminationResponseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationResponseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminationResponseStatusStructure }
     * 
     * 
     */
    public List<TerminationResponseStatusStructure> getTerminationResponseStatus() {
        if (terminationResponseStatus == null) {
            terminationResponseStatus = new ArrayList<TerminationResponseStatusStructure>();
        }
        return this.terminationResponseStatus;
    }

}
