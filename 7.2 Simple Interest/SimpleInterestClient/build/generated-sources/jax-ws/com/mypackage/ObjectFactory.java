
package com.mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mypackage package. 
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

    private final static QName _CalculateSI_QNAME = new QName("http://MyPackage.com/", "calculateSI");
    private final static QName _CalculateSIResponse_QNAME = new QName("http://MyPackage.com/", "calculateSIResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateSI }
     * 
     */
    public CalculateSI createCalculateSI() {
        return new CalculateSI();
    }

    /**
     * Create an instance of {@link CalculateSIResponse }
     * 
     */
    public CalculateSIResponse createCalculateSIResponse() {
        return new CalculateSIResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPackage.com/", name = "calculateSI")
    public JAXBElement<CalculateSI> createCalculateSI(CalculateSI value) {
        return new JAXBElement<CalculateSI>(_CalculateSI_QNAME, CalculateSI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPackage.com/", name = "calculateSIResponse")
    public JAXBElement<CalculateSIResponse> createCalculateSIResponse(CalculateSIResponse value) {
        return new JAXBElement<CalculateSIResponse>(_CalculateSIResponse_QNAME, CalculateSIResponse.class, null, value);
    }

}
