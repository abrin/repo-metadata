//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.entity_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eml.ecoinformatics_org.entity_2_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OtherEntity_QNAME = new QName("eml://ecoinformatics.org/entity-2.1.1", "otherEntity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eml.ecoinformatics_org.entity_2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OtherEntityType }
     * 
     */
    public OtherEntityType createOtherEntityType() {
        return new OtherEntityType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "eml://ecoinformatics.org/entity-2.1.1", name = "otherEntity")
    public JAXBElement<OtherEntityType> createOtherEntity(OtherEntityType value) {
        return new JAXBElement<OtherEntityType>(_OtherEntity_QNAME, OtherEntityType.class, null, value);
    }

}
