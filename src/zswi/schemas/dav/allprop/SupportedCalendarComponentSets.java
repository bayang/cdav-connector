//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.14 at 08:38:50 PM EDT 
//


package zswi.schemas.dav.allprop;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}supported-calendar-component-set" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supportedCalendarComponentSet"
})
@XmlRootElement(name = "supported-calendar-component-sets", namespace = "urn:ietf:params:xml:ns:caldav")
public class SupportedCalendarComponentSets {

    @XmlElement(name = "supported-calendar-component-set", namespace = "urn:ietf:params:xml:ns:caldav")
    protected List<SupportedCalendarComponentSet> supportedCalendarComponentSet;

    /**
     * Gets the value of the supportedCalendarComponentSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCalendarComponentSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedCalendarComponentSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedCalendarComponentSet }
     * 
     * 
     */
    public List<SupportedCalendarComponentSet> getSupportedCalendarComponentSet() {
        if (supportedCalendarComponentSet == null) {
            supportedCalendarComponentSet = new ArrayList<SupportedCalendarComponentSet>();
        }
        return this.supportedCalendarComponentSet;
    }

}