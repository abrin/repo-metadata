//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 02:32:58 PM MST 
//


package info.fedora.foxml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for digitalObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="digitalObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectProperties" type="{info:fedora/fedora-system:def/foxml#}objectPropertiesType"/>
 *         &lt;element name="datastream" type="{info:fedora/fedora-system:def/foxml#}datastreamType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VERSION" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="1.1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PID" type="{info:fedora/fedora-system:def/foxml#}pidType" />
 *       &lt;attribute name="FEDORA_URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "digitalObjectType", propOrder = {
    "objectProperties",
    "datastream"
})
@XmlSeeAlso({
    DigitalObject.class
})
public class DigitalObjectType {

    @XmlElement(required = true)
    protected ObjectPropertiesType objectProperties;
    protected List<DatastreamType> datastream;
    @XmlAttribute(name = "VERSION", required = true)
    protected DigitalObjectType.VersionValue version;
    @XmlAttribute(name = "PID")
    protected String pid;
    @XmlAttribute(name = "FEDORA_URI")
    @XmlSchemaType(name = "anyURI")
    protected String fedorauri;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the objectProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectPropertiesType }
     *     
     */
    public ObjectPropertiesType getObjectProperties() {
        return objectProperties;
    }

    /**
     * Sets the value of the objectProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectPropertiesType }
     *     
     */
    public void setObjectProperties(ObjectPropertiesType value) {
        this.objectProperties = value;
    }

    /**
     * Gets the value of the datastream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatastream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatastreamType }
     * 
     * 
     */
    public List<DatastreamType> getDatastream() {
        if (datastream == null) {
            datastream = new ArrayList<DatastreamType>();
        }
        return this.datastream;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalObjectType.VersionValue }
     *     
     */
    public DigitalObjectType.VersionValue getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalObjectType.VersionValue }
     *     
     */
    public void setVERSION(DigitalObjectType.VersionValue value) {
        this.version = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the fedorauri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEDORAURI() {
        return fedorauri;
    }

    /**
     * Sets the value of the fedorauri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEDORAURI(String value) {
        this.fedorauri = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="1.1"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum VersionValue {

        @XmlEnumValue("1.1")
        OnePointOne("1.1");
        private final String value;

        VersionValue(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static DigitalObjectType.VersionValue fromValue(String v) {
            for (DigitalObjectType.VersionValue c: DigitalObjectType.VersionValue.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
