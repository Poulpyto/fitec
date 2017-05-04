
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _ConversionED_QNAME = new QName("http://webservice/", "ConversionED");
    private final static QName _Getallcompte_QNAME = new QName("http://webservice/", "getallcompte");
    private final static QName _GetonecompteResponse_QNAME = new QName("http://webservice/", "getonecompteResponse");
    private final static QName _GetallcompteResponse_QNAME = new QName("http://webservice/", "getallcompteResponse");
    private final static QName _ConversionEDResponse_QNAME = new QName("http://webservice/", "ConversionEDResponse");
    private final static QName _Compte_QNAME = new QName("http://webservice/", "compte");
    private final static QName _Getonecompte_QNAME = new QName("http://webservice/", "getonecompte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionED }
     * 
     */
    public ConversionED createConversionED() {
        return new ConversionED();
    }

    /**
     * Create an instance of {@link Getallcompte }
     * 
     */
    public Getallcompte createGetallcompte() {
        return new Getallcompte();
    }

    /**
     * Create an instance of {@link GetonecompteResponse }
     * 
     */
    public GetonecompteResponse createGetonecompteResponse() {
        return new GetonecompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEDResponse }
     * 
     */
    public ConversionEDResponse createConversionEDResponse() {
        return new ConversionEDResponse();
    }

    /**
     * Create an instance of {@link GetallcompteResponse }
     * 
     */
    public GetallcompteResponse createGetallcompteResponse() {
        return new GetallcompteResponse();
    }

    /**
     * Create an instance of {@link Getonecompte }
     * 
     */
    public Getonecompte createGetonecompte() {
        return new Getonecompte();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionED }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ConversionED")
    public JAXBElement<ConversionED> createConversionED(ConversionED value) {
        return new JAXBElement<ConversionED>(_ConversionED_QNAME, ConversionED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getallcompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getallcompte")
    public JAXBElement<Getallcompte> createGetallcompte(Getallcompte value) {
        return new JAXBElement<Getallcompte>(_Getallcompte_QNAME, Getallcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetonecompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getonecompteResponse")
    public JAXBElement<GetonecompteResponse> createGetonecompteResponse(GetonecompteResponse value) {
        return new JAXBElement<GetonecompteResponse>(_GetonecompteResponse_QNAME, GetonecompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetallcompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getallcompteResponse")
    public JAXBElement<GetallcompteResponse> createGetallcompteResponse(GetallcompteResponse value) {
        return new JAXBElement<GetallcompteResponse>(_GetallcompteResponse_QNAME, GetallcompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ConversionEDResponse")
    public JAXBElement<ConversionEDResponse> createConversionEDResponse(ConversionEDResponse value) {
        return new JAXBElement<ConversionEDResponse>(_ConversionEDResponse_QNAME, ConversionEDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getonecompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getonecompte")
    public JAXBElement<Getonecompte> createGetonecompte(Getonecompte value) {
        return new JAXBElement<Getonecompte>(_Getonecompte_QNAME, Getonecompte.class, null, value);
    }

}
