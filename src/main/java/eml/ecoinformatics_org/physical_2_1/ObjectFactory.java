//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.physical_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eml.ecoinformatics_org.physical_2_1 package. 
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

    private final static QName _Physical_QNAME = new QName("eml://ecoinformatics.org/physical-2.1.1", "physical");
    private final static QName _PhysicalTypeCompressionMethod_QNAME = new QName("", "compressionMethod");
    private final static QName _PhysicalTypeEncodingMethod_QNAME = new QName("", "encodingMethod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eml.ecoinformatics_org.physical_2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PhysicalType }
     * 
     */
    public PhysicalType createPhysicalType() {
        return new PhysicalType();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat }
     * 
     */
    public PhysicalType.DataFormat createPhysicalTypeDataFormat() {
        return new PhysicalType.DataFormat();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.BinaryRasterFormat }
     * 
     */
    public PhysicalType.DataFormat.BinaryRasterFormat createPhysicalTypeDataFormatBinaryRasterFormat() {
        return new PhysicalType.DataFormat.BinaryRasterFormat();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.TextFormat }
     * 
     */
    public PhysicalType.DataFormat.TextFormat createPhysicalTypeDataFormatTextFormat() {
        return new PhysicalType.DataFormat.TextFormat();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.TextFormat.Complex }
     * 
     */
    public PhysicalType.DataFormat.TextFormat.Complex createPhysicalTypeDataFormatTextFormatComplex() {
        return new PhysicalType.DataFormat.TextFormat.Complex();
    }

    /**
     * Create an instance of {@link PhysicalOnlineType }
     * 
     */
    public PhysicalOnlineType createPhysicalOnlineType() {
        return new PhysicalOnlineType();
    }

    /**
     * Create an instance of {@link PhysicalDistributionType }
     * 
     */
    public PhysicalDistributionType createPhysicalDistributionType() {
        return new PhysicalDistributionType();
    }

    /**
     * Create an instance of {@link PhysicalType.Size }
     * 
     */
    public PhysicalType.Size createPhysicalTypeSize() {
        return new PhysicalType.Size();
    }

    /**
     * Create an instance of {@link PhysicalType.Authentication }
     * 
     */
    public PhysicalType.Authentication createPhysicalTypeAuthentication() {
        return new PhysicalType.Authentication();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.ExternallyDefinedFormat }
     * 
     */
    public PhysicalType.DataFormat.ExternallyDefinedFormat createPhysicalTypeDataFormatExternallyDefinedFormat() {
        return new PhysicalType.DataFormat.ExternallyDefinedFormat();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.BinaryRasterFormat.MultiBand }
     * 
     */
    public PhysicalType.DataFormat.BinaryRasterFormat.MultiBand createPhysicalTypeDataFormatBinaryRasterFormatMultiBand() {
        return new PhysicalType.DataFormat.BinaryRasterFormat.MultiBand();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.TextFormat.SimpleDelimited }
     * 
     */
    public PhysicalType.DataFormat.TextFormat.SimpleDelimited createPhysicalTypeDataFormatTextFormatSimpleDelimited() {
        return new PhysicalType.DataFormat.TextFormat.SimpleDelimited();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.TextFormat.Complex.TextFixed }
     * 
     */
    public PhysicalType.DataFormat.TextFormat.Complex.TextFixed createPhysicalTypeDataFormatTextFormatComplexTextFixed() {
        return new PhysicalType.DataFormat.TextFormat.Complex.TextFixed();
    }

    /**
     * Create an instance of {@link PhysicalType.DataFormat.TextFormat.Complex.TextDelimited }
     * 
     */
    public PhysicalType.DataFormat.TextFormat.Complex.TextDelimited createPhysicalTypeDataFormatTextFormatComplexTextDelimited() {
        return new PhysicalType.DataFormat.TextFormat.Complex.TextDelimited();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "eml://ecoinformatics.org/physical-2.1.1", name = "physical")
    public JAXBElement<PhysicalType> createPhysical(PhysicalType value) {
        return new JAXBElement<PhysicalType>(_Physical_QNAME, PhysicalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "compressionMethod", scope = PhysicalType.class)
    public JAXBElement<String> createPhysicalTypeCompressionMethod(String value) {
        return new JAXBElement<String>(_PhysicalTypeCompressionMethod_QNAME, String.class, PhysicalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "encodingMethod", scope = PhysicalType.class)
    public JAXBElement<String> createPhysicalTypeEncodingMethod(String value) {
        return new JAXBElement<String>(_PhysicalTypeEncodingMethod_QNAME, String.class, PhysicalType.class, value);
    }

}
