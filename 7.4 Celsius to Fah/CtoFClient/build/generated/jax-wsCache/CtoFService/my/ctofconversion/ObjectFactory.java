
package my.ctofconversion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.ctofconversion package. 
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

    private final static QName _CeltoFah_QNAME = new QName("http://CtoFConversion.my/", "CeltoFah");
    private final static QName _CeltoFahResponse_QNAME = new QName("http://CtoFConversion.my/", "CeltoFahResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.ctofconversion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CeltoFah }
     * 
     */
    public CeltoFah createCeltoFah() {
        return new CeltoFah();
    }

    /**
     * Create an instance of {@link CeltoFahResponse }
     * 
     */
    public CeltoFahResponse createCeltoFahResponse() {
        return new CeltoFahResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CeltoFah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CtoFConversion.my/", name = "CeltoFah")
    public JAXBElement<CeltoFah> createCeltoFah(CeltoFah value) {
        return new JAXBElement<CeltoFah>(_CeltoFah_QNAME, CeltoFah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CeltoFahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CtoFConversion.my/", name = "CeltoFahResponse")
    public JAXBElement<CeltoFahResponse> createCeltoFahResponse(CeltoFahResponse value) {
        return new JAXBElement<CeltoFahResponse>(_CeltoFahResponse_QNAME, CeltoFahResponse.class, null, value);
    }

}
