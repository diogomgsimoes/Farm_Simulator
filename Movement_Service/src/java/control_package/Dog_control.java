/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_package;

import static control_package.MessageManagementWS.createPlaceStateContent;
import static control_package.MessageManagementWS.retrievePlaceStateObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.xml.bind.JAXBException;
import org.netbeans.xml.schema.updateschema.TMyPlace;
import org.netbeans.xml.schema.updateschema.TPlace;
import org.netbeans.xml.schema.updateschema.TPosition;

/**
 *
 * @author diogo
 */
@WebService(serviceName = "Dog_control")
public class Dog_control {

    /**
     * Web service operation
     * @param input
     * @return 
     * @throws javax.xml.bind.JAXBException
     */
    @WebMethod(operationName = "dog_input")
    public String dog_input(String input) throws JAXBException {
        
        List<TPosition> positions_wWolf = new ArrayList<>();
        List<TPosition> positions = new ArrayList<>();
        
        // String para objeto
        TMyPlace placesList = retrievePlaceStateObject(input);
        
        // Preencher posições das listas
        for (int i = 1; i < 9; i++) {
            TPlace place = (TPlace) placesList.getPlace().get(i);
            if (place.isWolf())
                positions_wWolf.add(place.getPosition());
            else if(!place.isObstacle() && !place.isCow() && !place.isDog()&& (place.getPosition() != null) && (place.getPosition().getXx() 
                    != placesList.getPlace().get(0).getPosition().getXx()) && (place.getPosition().getYy()
                    != placesList.getPlace().get(0).getPosition().getYy()))
                positions.add(place.getPosition());
        }
        
        Random rand = new Random();
        // Mover para posição com lobo
        if (positions_wWolf.size() > 0)
            placesList.getPlace().get(0).setPosition(positions_wWolf.get(rand.nextInt(positions_wWolf.size())));
        // Procurar lobo
        else if (positions.size() > 0)
            placesList.getPlace().get(0).setPosition(positions.get(rand.nextInt(positions.size())));

        // De objeto para string
        String result = createPlaceStateContent(placesList);
        return result;    
    }
}