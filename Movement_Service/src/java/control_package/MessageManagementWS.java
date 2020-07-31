/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_package;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import org.netbeans.xml.schema.updateschema.TMyPlace;

/**
 *
 * @author
 * André & Ricardo
 */

public class MessageManagementWS {

    public static String createPlaceStateContent(TMyPlace myPlace) throws JAXBException {
        
        // Create TMyPlace context and marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(TMyPlace.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        
        // To format XML
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        //If we DO NOT have JAXB annotated class
        JAXBElement<TMyPlace> jaxbElement = new JAXBElement<>(new QName("", "Place"), TMyPlace.class, myPlace);
        
        // Marshalling and converting to string
        StringWriter sw = new StringWriter();
        marshaller.marshal(jaxbElement, sw);
        String result = sw.toString();
        
        return result;
    }

    public static TMyPlace retrievePlaceStateObject(String content) throws JAXBException {  
        
        // Create TMyPlace context and marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(TMyPlace.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        
        // Create inputstream from the input string and unmarshall
        InputStream is = new ByteArrayInputStream(content.getBytes());
        JAXBElement<TMyPlace> jaxbElement = (JAXBElement<TMyPlace>) unmarshaller.unmarshal(new StreamSource(is), TMyPlace.class);
        
        // Fetch object
        TMyPlace myPlace = jaxbElement.getValue();
        
        return myPlace;
    }
}
