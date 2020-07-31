/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSerialization;

import Common.MessageManagement;
import javax.xml.bind.JAXBException;
import org.netbeans.xml.schema.updateschema.TMyPlace;
import org.netbeans.xml.schema.updateschema.TPlace;

/**
 *
 * @author adroc
 */
public class TestSerialization {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException {
        TMyPlace myTestMyPlace = new TMyPlace();
        TPlace myTestTPlace = new TPlace();
        myTestTPlace.setEntity("Nome da Vaca");
        myTestTPlace.setCow(true);
        myTestMyPlace.getPlace().add(myTestTPlace);
        // Serialize
        String createPlaceStateContent = MessageManagement.createPlaceStateContent(myTestMyPlace);
        // Deserialize
        TMyPlace myTestMyPlaceAfterSerialization = MessageManagement.retrievePlaceStateObject(createPlaceStateContent);
        System.out.println("ID: " + myTestMyPlaceAfterSerialization.getPlace().get(0).getEntity() + " É vaca: " + myTestMyPlaceAfterSerialization.getPlace().get(0).isCow());
    }
    
}
