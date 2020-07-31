
package Services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Services package. 
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

    private final static QName _DistanceResponse_QNAME = new QName("http://control_package/", "distanceResponse");
    private final static QName _Distance_QNAME = new QName("http://control_package/", "distance");
    private final static QName _JAXBException_QNAME = new QName("http://control_package/", "JAXBException");
    private final static QName _WolfInput_QNAME = new QName("http://control_package/", "wolf_input");
    private final static QName _WolfInputResponse_QNAME = new QName("http://control_package/", "wolf_inputResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistanceResponse }
     * 
     */
    public DistanceResponse createDistanceResponse() {
        return new DistanceResponse();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link WolfInput }
     * 
     */
    public WolfInput createWolfInput() {
        return new WolfInput();
    }

    /**
     * Create an instance of {@link WolfInputResponse }
     * 
     */
    public WolfInputResponse createWolfInputResponse() {
        return new WolfInputResponse();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link TPosition }
     * 
     */
    public TPosition createTPosition() {
        return new TPosition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "distanceResponse")
    public JAXBElement<DistanceResponse> createDistanceResponse(DistanceResponse value) {
        return new JAXBElement<DistanceResponse>(_DistanceResponse_QNAME, DistanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "distance")
    public JAXBElement<Distance> createDistance(Distance value) {
        return new JAXBElement<Distance>(_Distance_QNAME, Distance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WolfInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "wolf_input")
    public JAXBElement<WolfInput> createWolfInput(WolfInput value) {
        return new JAXBElement<WolfInput>(_WolfInput_QNAME, WolfInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WolfInputResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "wolf_inputResponse")
    public JAXBElement<WolfInputResponse> createWolfInputResponse(WolfInputResponse value) {
        return new JAXBElement<WolfInputResponse>(_WolfInputResponse_QNAME, WolfInputResponse.class, null, value);
    }

}
