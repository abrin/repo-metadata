//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.literature_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eml.ecoinformatics_org.literature_2_1 package. 
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

    private final static QName _Citation_QNAME = new QName("eml://ecoinformatics.org/literature-2.1.1", "citation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eml.ecoinformatics_org.literature_2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CitationType }
     * 
     */
    public CitationType createCitationType() {
        return new CitationType();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link ConferenceProceedings }
     * 
     */
    public ConferenceProceedings createConferenceProceedings() {
        return new ConferenceProceedings();
    }

    /**
     * Create an instance of {@link Manuscript }
     * 
     */
    public Manuscript createManuscript() {
        return new Manuscript();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link Thesis }
     * 
     */
    public Thesis createThesis() {
        return new Thesis();
    }

    /**
     * Create an instance of {@link Chapter }
     * 
     */
    public Chapter createChapter() {
        return new Chapter();
    }

    /**
     * Create an instance of {@link Presentation }
     * 
     */
    public Presentation createPresentation() {
        return new Presentation();
    }

    /**
     * Create an instance of {@link AudioVisual }
     * 
     */
    public AudioVisual createAudioVisual() {
        return new AudioVisual();
    }

    /**
     * Create an instance of {@link Generic }
     * 
     */
    public Generic createGeneric() {
        return new Generic();
    }

    /**
     * Create an instance of {@link PersonalCommunication }
     * 
     */
    public PersonalCommunication createPersonalCommunication() {
        return new PersonalCommunication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "eml://ecoinformatics.org/literature-2.1.1", name = "citation")
    public JAXBElement<CitationType> createCitation(CitationType value) {
        return new JAXBElement<CitationType>(_Citation_QNAME, CitationType.class, null, value);
    }

}
