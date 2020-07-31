/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_package;

import static control_package.MessageManagementWS.createPlaceStateContent;
import static control_package.MessageManagementWS.retrievePlaceStateObject;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBException;
import org.netbeans.xml.schema.updateschema.TMyPlace;
import org.netbeans.xml.schema.updateschema.TPlace;
import org.netbeans.xml.schema.updateschema.TPosition;

/**
 *
 * @author diogo
 */
@WebService(serviceName = "Wolf_control")
@Stateless()
public class Wolf_control {
    
    public double distance (TPosition a, TPosition b){
        // Distância entre quadrados da simulação (Norma euclediana)
        return java.lang.Math.sqrt(java.lang.Math.pow(abs(a.getXx() - b.getXx()), 2) + java.lang.Math.pow(abs(a.getYy() - b.getYy()), 2));
    }
    
    /**
     * Web service operation
     * @param input
     * @return 
     * @throws javax.xml.bind.JAXBException
     */
    @WebMethod(operationName = "wolf_input")
    public String wolf_input(String input) throws JAXBException {
        
        List<TPosition> positions_wCow = new ArrayList<>();
        List<TPosition> positions = new ArrayList<>();
        List<TPosition> Dpositions = new ArrayList<>();
        
        // String para objeto
        TMyPlace placesList = retrievePlaceStateObject(input);
        
        // Preencher posições das listas
        for (int i = 1; i < 9; i++) {
            TPlace place = (TPlace) placesList.getPlace().get(i);
            if (place.isCow())
                positions_wCow.add(place.getPosition());
            else if(place.isDog())
                    Dpositions.add(place.getPosition());
            else if(!place.isObstacle() && !place.isWolf() && (place.getPosition() != null) && (place.getPosition().getXx() 
                    != placesList.getPlace().get(0).getPosition().getXx()) && (place.getPosition().getYy()
                    != placesList.getPlace().get(0).getPosition().getYy()))
                positions.add(place.getPosition());
        }
        
        // Mover para posição com vaca
        if (positions_wCow.size() > 0) {
            Random rand = new Random();
            placesList.getPlace().get(0).setPosition(positions_wCow.get(rand.nextInt(positions_wCow.size())));
        }
        
        // Fugir do cão, caso haja
        else if((Dpositions.size() > 0) && (positions.size() > 0)) {
            double max = 0;
            double total = 0;
            TPosition bestDistance = null;
            for (TPosition w : positions) {
                total = 0;
                for (TPosition d : Dpositions) {
                    total += distance(w, d);
                }
                if (total > max) {
                    bestDistance = w;
                    max = total;
                }
            }
            placesList.getPlace().get(0).setPosition(bestDistance);
        }
        // Mover para posição válida aleatória 
        else if (positions.size() > 0) {
            Random rand = new Random();
            placesList.getPlace().get(0).setPosition(positions.get(rand.nextInt(positions.size())));
        }

        // De objeto para string
        String result = createPlaceStateContent(placesList);
        return result;   
    }
}
