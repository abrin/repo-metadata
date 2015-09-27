//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.resource_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediumName" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *         &lt;element name="mediumDensity" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *         &lt;element name="mediumDensityUnits" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *         &lt;element name="mediumVolume" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *         &lt;element name="mediumFormat" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mediumNote" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineType", propOrder = {
    "mediumName",
    "mediumDensity",
    "mediumDensityUnits",
    "mediumVolume",
    "mediumFormat",
    "mediumNote"
})
public class OfflineType {

    @XmlElement(required = true)
    protected String mediumName;
    protected String mediumDensity;
    protected String mediumDensityUnits;
    protected String mediumVolume;
    protected List<String> mediumFormat;
    protected String mediumNote;

    /**
     * Gets the value of the mediumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumName() {
        return mediumName;
    }

    /**
     * Sets the value of the mediumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumName(String value) {
        this.mediumName = value;
    }

    /**
     * Gets the value of the mediumDensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumDensity() {
        return mediumDensity;
    }

    /**
     * Sets the value of the mediumDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumDensity(String value) {
        this.mediumDensity = value;
    }

    /**
     * Gets the value of the mediumDensityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumDensityUnits() {
        return mediumDensityUnits;
    }

    /**
     * Sets the value of the mediumDensityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumDensityUnits(String value) {
        this.mediumDensityUnits = value;
    }

    /**
     * Gets the value of the mediumVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumVolume() {
        return mediumVolume;
    }

    /**
     * Sets the value of the mediumVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumVolume(String value) {
        this.mediumVolume = value;
    }

    /**
     * Gets the value of the mediumFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediumFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMediumFormat() {
        if (mediumFormat == null) {
            mediumFormat = new ArrayList<String>();
        }
        return this.mediumFormat;
    }

    /**
     * Gets the value of the mediumNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumNote() {
        return mediumNote;
    }

    /**
     * Sets the value of the mediumNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumNote(String value) {
        this.mediumNote = value;
    }

}
