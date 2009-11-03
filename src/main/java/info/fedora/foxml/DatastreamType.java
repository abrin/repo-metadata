//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 02:32:58 PM MST 
//


package info.fedora.foxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for datastreamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datastreamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datastreamVersion" type="{info:fedora/fedora-system:def/foxml#}datastreamVersionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{info:fedora/fedora-system:def/foxml#}idType" />
 *       &lt;attribute name="CONTROL_GROUP" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="E"/>
 *             &lt;enumeration value="M"/>
 *             &lt;enumeration value="R"/>
 *             &lt;enumeration value="X"/>
 *             &lt;enumeration value="B"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FEDORA_URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="STATE" type="{info:fedora/fedora-system:def/foxml#}stateType" />
 *       &lt;attribute name="VERSIONABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datastreamType", propOrder = {
    "datastreamVersion"
})
public class DatastreamType {

    @XmlElement(required = true)
    protected List<DatastreamVersionType> datastreamVersion;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "CONTROL_GROUP", required = true)
    protected DatastreamType.ControlGroupValue controlgroup;
    @XmlAttribute(name = "FEDORA_URI")
    @XmlSchemaType(name = "anyURI")
    protected String fedorauri;
    @XmlAttribute(name = "STATE")
    protected StateType state;
    @XmlAttribute(name = "VERSIONABLE")
    protected Boolean versionable;

    /**
     * Gets the value of the datastreamVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastreamVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatastreamVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatastreamVersionType }
     * 
     * 
     */
    public List<DatastreamVersionType> getDatastreamVersion() {
        if (datastreamVersion == null) {
            datastreamVersion = new ArrayList<DatastreamVersionType>();
        }
        return this.datastreamVersion;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the controlgroup property.
     * 
     * @return
     *     possible object is
     *     {@link DatastreamType.ControlGroupValue }
     *     
     */
    public DatastreamType.ControlGroupValue getCONTROLGROUP() {
        return controlgroup;
    }

    /**
     * Sets the value of the controlgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastreamType.ControlGroupValue }
     *     
     */
    public void setCONTROLGROUP(DatastreamType.ControlGroupValue value) {
        this.controlgroup = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setSTATE(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the versionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVERSIONABLE() {
        if (versionable == null) {
            return true;
        } else {
            return versionable;
        }
    }

    /**
     * Sets the value of the versionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVERSIONABLE(Boolean value) {
        this.versionable = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="E"/>
     *     &lt;enumeration value="M"/>
     *     &lt;enumeration value="R"/>
     *     &lt;enumeration value="X"/>
     *     &lt;enumeration value="B"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ControlGroupValue {

        E,
        M,
        R,
        X,
        B;

        public String value() {
            return name();
        }

        public static DatastreamType.ControlGroupValue fromValue(String v) {
            return valueOf(v);
        }

    }

}
