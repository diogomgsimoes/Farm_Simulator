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

@WebService(serviceName = "Cow_control")
@Stateless()
public class Cow_control { 
    
    public double distance (TPosition a, TPosition b){
        // Distância entre quadrados da simulação (Norma euclediana)
        return java.lang.Math.sqrt(java.lang.Math.pow(abs(a.getXx() - b.getXx()), 2) + java.lang.Math.pow(abs(a.getYy() - b.getYy()), 2));
    }
    
    /**
     * Web service operation
     * @param k
     * @return 
     * @throws javax.xml.bind.JAXBException
     */
    @WebMethod(operationName = "cow_input")
    public String cow_input(String k) throws JAXBException{
        
        List<TPosition> positions = new ArrayList<>();
        List<TPosition> Wpositions = new ArrayList<>();
        
        // String para objeto
        TMyPlace placesList = retrievePlaceStateObject(k);
        
        // Preencher posições das listas
        for (int i = 1; i < 9; i++) {
            TPlace place = (TPlace) placesList.getPlace().get(i);
            if (place.isWolf())
                Wpositions.add(place.getPosition());
            else if ((place.getGrass() > 0) && !place.isObstacle() && !place.isCow() && !place.isDog() && (place.getPosition() != null))
                positions.add(place.getPosition());
        }

        // Mover se acabar a relva ou lobo por perto
        if (((placesList.getPlace().get(0).getGrass() == 0) || (Wpositions.size() > 0)) && (positions.size() > 0)){
            if (Wpositions.size() > 0) {
                double max = 0;
                double total = 0;
                TPosition bestDistance = null;
                for (TPosition c : positions) {
                    total = 0;
                    for (TPosition w : Wpositions) {
                        total += distance(c, w);
                    }
                    if (total > max) {
                        bestDistance = c;
                        max = total;
                    }
                }
                placesList.getPlace().get(0).setPosition(bestDistance);
            }
            else {
                // Mover para posição válida (com relva) aleatória
                Random rand = new Random();
                placesList.getPlace().get(0).setPosition(positions.get(rand.nextInt(positions.size())));
            }
        }
        
        // De objeto para string
        String result = createPlaceStateContent(placesList);
        
        return result;
    }
}
