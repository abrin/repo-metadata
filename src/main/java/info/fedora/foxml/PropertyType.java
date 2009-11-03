//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 02:32:58 PM MST 
//


package info.fedora.foxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NAME" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="info:fedora/fedora-system:def/model#state"/>
 *             &lt;enumeration value="info:fedora/fedora-system:def/model#label"/>
 *             &lt;enumeration value="info:fedora/fedora-system:def/model#createdDate"/>
 *             &lt;enumeration value="info:fedora/fedora-system:def/view#lastModifiedDate"/>
 *             &lt;enumeration value="info:fedora/fedora-system:def/model#ownerId"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="VALUE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyType")
public class PropertyType {

    @XmlAttribute(name = "NAME", required = true)
    protected PropertyType.PropertyTypeName name;
    @XmlAttribute(name = "VALUE", required = true)
    protected String value;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.PropertyTypeName }
     *     
     */
    public PropertyType.PropertyTypeName getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.PropertyTypeName }
     *     
     */
    public void setNAME(PropertyType.PropertyTypeName value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="info:fedora/fedora-system:def/model#state"/>
     *     &lt;enumeration value="info:fedora/fedora-system:def/model#label"/>
     *     &lt;enumeration value="info:fedora/fedora-system:def/model#createdDate"/>
     *     &lt;enumeration value="info:fedora/fedora-system:def/view#lastModifiedDate"/>
     *     &lt;enumeration value="info:fedora/fedora-system:def/model#ownerId"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum PropertyTypeName {

        @XmlEnumValue("info:fedora/fedora-system:def/model#state")
        INFO_FEDORA_FEDORA_SYSTEM_DEF_MODEL_STATE("info:fedora/fedora-system:def/model#state"),
        @XmlEnumValue("info:fedora/fedora-system:def/model#label")
        INFO_FEDORA_FEDORA_SYSTEM_DEF_MODEL_LABEL("info:fedora/fedora-system:def/model#label"),
        @XmlEnumValue("info:fedora/fedora-system:def/model#createdDate")
        INFO_FEDORA_FEDORA_SYSTEM_DEF_MODEL_CREATED_DATE("info:fedora/fedora-system:def/model#createdDate"),
        @XmlEnumValue("info:fedora/fedora-system:def/view#lastModifiedDate")
        INFO_FEDORA_FEDORA_SYSTEM_DEF_VIEW_LAST_MODIFIED_DATE("info:fedora/fedora-system:def/view#lastModifiedDate"),
        @XmlEnumValue("info:fedora/fedora-system:def/model#ownerId")
        INFO_FEDORA_FEDORA_SYSTEM_DEF_MODEL_OWNER_ID("info:fedora/fedora-system:def/model#ownerId");
        private final String value;

        PropertyTypeName(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static PropertyType.PropertyTypeName fromValue(String v) {
            for (PropertyType.PropertyTypeName c: PropertyType.PropertyTypeName.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
