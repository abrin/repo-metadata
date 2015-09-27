//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.view_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import eml.ecoinformatics_org.attribute_2_1.AttributeListType;
import eml.ecoinformatics_org.constraint_2_1.ConstraintType;
import eml.ecoinformatics_org.coverage_2_1.Coverage;
import eml.ecoinformatics_org.methods_2_1.MethodsType;
import eml.ecoinformatics_org.physical_2_1.PhysicalType;
import eml.ecoinformatics_org.resource_2_1.ScopeType;
import eml.ecoinformatics_org.text_2_1.TextType;


/**
 * <p>Java class for ViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;group ref="{eml://ecoinformatics.org/entity-2.1.1}EntityGroup"/>
 *           &lt;element name="attributeList" type="{eml://ecoinformatics.org/attribute-2.1.1}AttributeListType"/>
 *           &lt;element name="constraint" type="{eml://ecoinformatics.org/constraint-2.1.1}ConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="queryStatement" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *         &lt;/sequence>
 *         &lt;group ref="{eml://ecoinformatics.org/resource-2.1.1}ReferencesGroup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{eml://ecoinformatics.org/resource-2.1.1}IDType" />
 *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
 *       &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewType", propOrder = {
    "alternateIdentifier",
    "entityName",
    "entityDescription",
    "physical",
    "coverage",
    "methods",
    "additionalInfo",
    "attributeList",
    "constraint",
    "queryStatement",
    "references"
})
public class ViewType {

    protected List<ViewType.AlternateIdentifier> alternateIdentifier;
    protected String entityName;
    protected String entityDescription;
    protected List<PhysicalType> physical;
    protected Coverage coverage;
    protected MethodsType methods;
    protected List<TextType> additionalInfo;
    protected AttributeListType attributeList;
    protected List<ConstraintType> constraint;
    protected String queryStatement;
    protected ViewType.References references;
    @XmlAttribute(name = "id")
    protected List<String> id;
    @XmlAttribute(name = "system")
    protected List<String> system;
    @XmlAttribute(name = "scope")
    protected ScopeType scope;

    /**
     * Gets the value of the alternateIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewType.AlternateIdentifier }
     * 
     * 
     */
    public List<ViewType.AlternateIdentifier> getAlternateIdentifier() {
        if (alternateIdentifier == null) {
            alternateIdentifier = new ArrayList<ViewType.AlternateIdentifier>();
        }
        return this.alternateIdentifier;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityDescription() {
        return entityDescription;
    }

    /**
     * Sets the value of the entityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityDescription(String value) {
        this.entityDescription = value;
    }

    /**
     * Gets the value of the physical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysical().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalType }
     * 
     * 
     */
    public List<PhysicalType> getPhysical() {
        if (physical == null) {
            physical = new ArrayList<PhysicalType>();
        }
        return this.physical;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link Coverage }
     *     
     */
    public Coverage getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coverage }
     *     
     */
    public void setCoverage(Coverage value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the methods property.
     * 
     * @return
     *     possible object is
     *     {@link MethodsType }
     *     
     */
    public MethodsType getMethods() {
        return methods;
    }

    /**
     * Sets the value of the methods property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodsType }
     *     
     */
    public void setMethods(MethodsType value) {
        this.methods = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<TextType>();
        }
        return this.additionalInfo;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeListType }
     *     
     */
    public AttributeListType getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeListType }
     *     
     */
    public void setAttributeList(AttributeListType value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintType }
     * 
     * 
     */
    public List<ConstraintType> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ConstraintType>();
        }
        return this.constraint;
    }

    /**
     * Gets the value of the queryStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryStatement() {
        return queryStatement;
    }

    /**
     * Sets the value of the queryStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryStatement(String value) {
        this.queryStatement = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ViewType.References }
     *     
     */
    public ViewType.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewType.References }
     *     
     */
    public void setReferences(ViewType.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getId() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystem() {
        if (system == null) {
            system = new ArrayList<String>();
        }
        return this.system;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeType }
     *     
     */
    public ScopeType getScope() {
        if (scope == null) {
            return ScopeType.DOCUMENT;
        } else {
            return scope;
        }
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeType }
     *     
     */
    public void setScope(ScopeType value) {
        this.scope = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AlternateIdentifier {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "system")
        protected List<String> system;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
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
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the system property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the system property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSystem() {
            if (system == null) {
                system = new ArrayList<String>();
            }
            return this.system;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" default="document" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class References {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "system")
        protected List<String> system;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
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
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the system property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the system property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSystem() {
            if (system == null) {
                system = new ArrayList<String>();
            }
            return this.system;
        }

    }

}
