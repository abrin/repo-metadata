//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.physical_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import eml.ecoinformatics_org.resource_2_1.ConnectionType;
import eml.ecoinformatics_org.resource_2_1.UrlType;


/**
 * <p>Java class for PhysicalOnlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalOnlineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="onlineDescription" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="url" type="{eml://ecoinformatics.org/resource-2.1.1}UrlType"/>
 *           &lt;element name="connection" type="{eml://ecoinformatics.org/resource-2.1.1}ConnectionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalOnlineType", propOrder = {
    "onlineDescription",
    "url",
    "connection"
})
public class PhysicalOnlineType {

    protected String onlineDescription;
    protected UrlType url;
    protected ConnectionType connection;

    /**
     * Gets the value of the onlineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineDescription() {
        return onlineDescription;
    }

    /**
     * Sets the value of the onlineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineDescription(String value) {
        this.onlineDescription = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setUrl(UrlType value) {
        this.url = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionType }
     *     
     */
    public ConnectionType getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionType }
     *     
     */
    public void setConnection(ConnectionType value) {
        this.connection = value;
    }

}
