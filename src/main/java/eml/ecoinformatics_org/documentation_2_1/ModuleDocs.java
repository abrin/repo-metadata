//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.documentation_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eml.ecoinformatics_org.text_2_1.TextType;


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
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="moduleDescription" type="{eml://ecoinformatics.org/text-2.1.1}TextType" form="qualified"/>
 *         &lt;element name="recommendedUsage" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="standAlone" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "moduleName",
    "moduleDescription",
    "recommendedUsage",
    "standAlone"
})
@XmlRootElement(name = "moduleDocs")
public class ModuleDocs {

    @XmlElement(required = true)
    protected String moduleName;
    @XmlElement(required = true)
    protected TextType moduleDescription;
    @XmlElement(required = true)
    protected String recommendedUsage;
    @XmlElement(required = true)
    protected String standAlone;

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the moduleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getModuleDescription() {
        return moduleDescription;
    }

    /**
     * Sets the value of the moduleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setModuleDescription(TextType value) {
        this.moduleDescription = value;
    }

    /**
     * Gets the value of the recommendedUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedUsage() {
        return recommendedUsage;
    }

    /**
     * Sets the value of the recommendedUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedUsage(String value) {
        this.recommendedUsage = value;
    }

    /**
     * Gets the value of the standAlone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandAlone() {
        return standAlone;
    }

    /**
     * Sets the value of the standAlone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandAlone(String value) {
        this.standAlone = value;
    }

}
