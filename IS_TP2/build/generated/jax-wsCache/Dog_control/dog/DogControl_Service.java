
package dog;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Dog_control", targetNamespace = "http://control_package/", wsdlLocation = "http://localhost:8080/Movement_Service/Dog_control?wsdl")
public class DogControl_Service
    extends Service
{

    private final static URL DOGCONTROL_WSDL_LOCATION;
    private final static WebServiceException DOGCONTROL_EXCEPTION;
    private final static QName DOGCONTROL_QNAME = new QName("http://control_package/", "Dog_control");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Movement_Service/Dog_control?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOGCONTROL_WSDL_LOCATION = url;
        DOGCONTROL_EXCEPTION = e;
    }

    public DogControl_Service() {
        super(__getWsdlLocation(), DOGCONTROL_QNAME);
    }

    public DogControl_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOGCONTROL_QNAME, features);
    }

    public DogControl_Service(URL wsdlLocation) {
        super(wsdlLocation, DOGCONTROL_QNAME);
    }

    public DogControl_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOGCONTROL_QNAME, features);
    }

    public DogControl_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DogControl_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DogControl
     */
    @WebEndpoint(name = "Dog_controlPort")
    public DogControl getDogControlPort() {
        return super.getPort(new QName("http://control_package/", "Dog_controlPort"), DogControl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DogControl
     */
    @WebEndpoint(name = "Dog_controlPort")
    public DogControl getDogControlPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://control_package/", "Dog_controlPort"), DogControl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOGCONTROL_EXCEPTION!= null) {
            throw DOGCONTROL_EXCEPTION;
        }
        return DOGCONTROL_WSDL_LOCATION;
    }

}