
package dog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dog package. 
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

    private final static QName _DogInput_QNAME = new QName("http://control_package/", "dog_input");
    private final static QName _JAXBException_QNAME = new QName("http://control_package/", "JAXBException");
    private final static QName _DogInputResponse_QNAME = new QName("http://control_package/", "dog_inputResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DogInput }
     * 
     */
    public DogInput createDogInput() {
        return new DogInput();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link DogInputResponse }
     * 
     */
    public DogInputResponse createDogInputResponse() {
        return new DogInputResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DogInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "dog_input")
    public JAXBElement<DogInput> createDogInput(DogInput value) {
        return new JAXBElement<DogInput>(_DogInput_QNAME, DogInput.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DogInputResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control_package/", name = "dog_inputResponse")
    public JAXBElement<DogInputResponse> createDogInputResponse(DogInputResponse value) {
        return new JAXBElement<DogInputResponse>(_DogInputResponse_QNAME, DogInputResponse.class, null, value);
    }

}
