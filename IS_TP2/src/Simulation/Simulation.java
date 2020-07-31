/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulation;

import Common.MessageManagement;
import Services.JAXBException_Exception;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import org.netbeans.xml.schema.updateschema.TMyPlace;
import org.netbeans.xml.schema.updateschema.TPlace;
import org.netbeans.xml.schema.updateschema.TPosition;

/**
 *
 * @author adroc
 */
public class Simulation extends Thread {

    private TPlace[][] myEnvironment;
    private EnvironmentGUI myGUI;
    private HashMap<String, TPosition> wolfList = new HashMap<>();
    private HashMap<String, TPosition> cowList = new HashMap<>();
    private HashMap<String, TPosition> dogList = new HashMap<>();
    private int simulationSpeed;
    private String log = "";

    public Simulation(int Cows, int Wolfs, int Dogs, int Obstacles, int speed) {
        myEnvironment = new TPlace[15][15];
        int obstacles = Obstacles;
        int wolfs = Wolfs;
        int cows = Cows;
        int dogs = Dogs;
        simulationSpeed = speed;
        generateEnvironment(obstacles, wolfs, cows, dogs);
        /*
             * Start GUI
         */
        myGUI = new EnvironmentGUI();
        myGUI.updateGUI(myEnvironment, log);
        myGUI.setVisible(true);
    }

    private void generateEnvironment(int obstacles, int wolfs, int cows, int dogs) {
        startBase();
        putObstacles(obstacles);
        putWolfs(wolfs);
        putCows(cows);
        putDogs(dogs);
    }

    /*
     * Start all places with grass and position
     */
    private void startBase() {
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 15; y++) {
                myEnvironment[x][y] = new TPlace();
                Random rand = new Random();
                myEnvironment[x][y].setGrass(rand.nextInt((3 - 1) + 1) + 1);
                TPosition pos = new TPosition();
                pos.setXx(x);
                pos.setYy(y);
                myEnvironment[x][y].setPosition(pos);
            }
        }
    }

    /*
     * Put obstacles
     */
    private void putObstacles(int obstacles) {
        for (int i = 0; i < obstacles; i++) {
            int posX;
            int posY;
            do {
                Random randX = new Random();
                Random randY = new Random();
                posX = randX.nextInt((14 - 0) + 1) + 0;
                posY = randY.nextInt((14 - 0) + 1) + 0;
            } while (myEnvironment[posX][posY].isObstacle() || myEnvironment[posX][posY].isCow() || myEnvironment[posX][posY].isWolf() || myEnvironment[posX][posY].isDog());
            myEnvironment[posX][posY].setObstacle(true);
        }
    }

    /*
     * Put wolfs in the environment
     */
    private void putWolfs(int wolfs) {
        for (int i = 0; i < wolfs; i++) {
            int posX;
            int posY;
            do {
                Random randX = new Random();
                Random randY = new Random();
                posX = randX.nextInt((14 - 0) + 1) + 0;
                posY = randY.nextInt((14 - 0) + 1) + 0;
            } while (myEnvironment[posX][posY].isObstacle() || myEnvironment[posX][posY].isCow() || myEnvironment[posX][posY].isWolf() || myEnvironment[posX][posY].isDog());
            myEnvironment[posX][posY].setWolf(true);

            myEnvironment[posX][posY].setEntity("Wolf_" + i);
            TPosition tPosition = new TPosition();
            tPosition.setXx(posX);
            tPosition.setYy(posY);
            this.wolfList.put("Wolf_" + i, tPosition);
        }
    }
    
    /*
     * Put dogs in the environment
     */
    private void putDogs(int dogs) { 
        for (int i = 0; i < dogs; i++) {
            int posX;
            int posY;
            do {
                Random randX = new Random();
                Random randY = new Random();
                posX = randX.nextInt((14 - 0) + 1) + 0;
                posY = randY.nextInt((14 - 0) + 1) + 0;
            } while (myEnvironment[posX][posY].isObstacle() || myEnvironment[posX][posY].isCow() || myEnvironment[posX][posY].isWolf() || myEnvironment[posX][posY].isDog());
            myEnvironment[posX][posY].setDog(true);

            myEnvironment[posX][posY].setEntity("Dog_" + i);
            TPosition tPosition = new TPosition();
            tPosition.setXx(posX);
            tPosition.setYy(posY);
            this.dogList.put("Dog_" + i, tPosition);
        }
    }

    /*
     * Put cows in the environment
     */
    private void putCows(int cows) {
        int sex = 0;
        int CowID = 0;
        for (int i = 0; i < cows; i++) {
            int posX;
            int posY;
            do {
                Random randX = new Random();
                Random randY = new Random();
                posX = randX.nextInt((14 - 0) + 1) + 0;
                posY = randY.nextInt((14 - 0) + 1) + 0;
            } while (myEnvironment[posX][posY].isObstacle() || myEnvironment[posX][posY].isCow() || myEnvironment[posX][posY].isWolf() || myEnvironment[posX][posY].isDog());
            myEnvironment[posX][posY].setCow(true);
            myEnvironment[posX][posY].setEntity("Cow_" + CowID);
            TPosition tPosition = new TPosition();
            tPosition.setXx(posX);
            tPosition.setYy(posY);

            this.cowList.put("Cow_" + CowID, tPosition);
            CowID++;
        }
    }

    /*
     * Update Grass
     */
    protected void updateGrass() {
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 15; y++) {
                if (this.myEnvironment[x][y].isCow()) {
                    this.myEnvironment[x][y].setGrass(this.myEnvironment[x][y].getGrass() - 1);
                } else if (!myEnvironment[x][y].isWolf() && !this.myEnvironment[x][y].isObstacle() && !myEnvironment[x][y].isDog() && this.myEnvironment[x][y].getGrass() < 3) {
                    this.myEnvironment[x][y].setGrass(this.myEnvironment[x][y].getGrass() + 1);
                }
            }
        }
    }

    /*
         * Create MyPlace for each entity (Wolf/Cow/Dog)
     */
    private TMyPlace createMyPlace(int posX, int posY) {
        TMyPlace myPlace = new TMyPlace();
        myPlace.getPlace().add(this.myEnvironment[posX][posY]);
        if (posY == 14 && posX == 0) {
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY - 1]);
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
        } else if (posY == 14 && posX == 14) {
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY]);
        } else if (posY == 0 && posX == 14) {
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY + 1]);
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY]);
        } else if (posY == 0 && posX == 0) {
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY]);
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
        } else if (posY == 14) {
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY]);
        } else if (posX == 14) {
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY + 1]);
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY]);
        } else if (posY == 0) {
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY]);
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY]);
        } else if (posX == 0) {
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(this.myEnvironment[posX][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY - 1]);
            myPlace.getPlace().add(new TPlace());
            myPlace.getPlace().add(new TPlace());
        } else {
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY + 1]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY]);
            myPlace.getPlace().add(this.myEnvironment[posX + 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY - 1]);
            myPlace.getPlace().add(this.myEnvironment[posX - 1][posY]);
        }
        return myPlace;
    }

    // Iteração da simulação
    int turn = 1;
    // Tempo da iteração
    LocalDateTime now = LocalDateTime.now();
    
    @Override
    public void run() {
        while (true) {
            try {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                
                // String de registo da iteração
                this.log = "Turn " + turn + " - " + "(" + hour + ":" + minute + ":" + second + ")\n";
                
                ArrayList<String> cowsToKill = new ArrayList<>();
                for (String cowName : this.cowList.keySet()) {
                    //call service to update Cow position
                    TMyPlace myNewPosition = updateCowPosition(createMyPlace(this.cowList.get(cowName).getXx(), this.cowList.get(cowName).getYy()));
                    TPlace myPlace = myNewPosition.getPlace().get(0); //New position
                    //updateCowPosition
                    int lastX = this.cowList.get(cowName).getXx(); //Last position Xx
                    int lastY = this.cowList.get(cowName).getYy(); //Last position Yy
                    if (!(this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isWolf()              // New position without Wolf
                            && this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].getGrass() == 0) // With grass
                            && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isObstacle()    // Without obstacle
                            && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isCow()         // Without cow
                            && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isDog()) {      // Without dog
                        this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last postion
                        this.myEnvironment[lastX][lastY].setCow(false); //Remove from last position
                        this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setEntity(cowName); //Put in new position
                        this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setCow(true); //Put in new position
                        this.cowList.get(cowName).setXx(myPlace.getPosition().getXx()); //Put in new position
                        this.cowList.get(cowName).setYy(myPlace.getPosition().getYy()); //Put in new position
                    } else {
                        if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isWolf()) { //Wolf than eats a Cow
                            this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last position
                            this.myEnvironment[lastX][lastY].setCow(false); //Remove from last position
                            cowsToKill.add(cowName); //Add to the list to remove later
                        }
                        if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].getGrass() == 0) { //Without grass in position
                            this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last position
                            this.myEnvironment[lastX][lastY].setCow(false); //Remove from last position
                            cowsToKill.add(cowName);//Add to the list to remove later
                        }
                        if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isObstacle()) { //With obstacle
                            if (this.myEnvironment[lastX][lastY].getGrass() == 0) { //No grass in last position
                                this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last position
                                this.myEnvironment[lastX][lastY].setCow(false);   //Remove from last position
                                cowsToKill.add(cowName);//Add to the list to remove later
                            }                                                                                      //else keep cow in the some position
                        }
                        if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isDog()) { //With dog
                            if (this.myEnvironment[lastX][lastY].getGrass() == 0) { //No grass in last position
                                this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last position
                                this.myEnvironment[lastX][lastY].setCow(false);   //Remove from last position
                                cowsToKill.add(cowName);//Add to the list to remove later
                            }                                                                                      //else keep cow in the some position
                        }
                        if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isCow()) { //Another cow
                            if (this.myEnvironment[lastX][lastY].getGrass() == 0) {
                                this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last position
                                this.myEnvironment[lastX][lastY].setCow(false);   //Remove from last position
                                cowsToKill.add(cowName);        //Add to the list to remove later
                            }                                                                                      //else keep cow in the some position
                        }
                    }
                }

                //Remove Cow from HashMap
                for (String cowID : cowsToKill) {
                    this.cowList.remove(cowID);
                }

                //send update for all wolfs
                ArrayList<String> wolfsToKill = new ArrayList<>();
                for (String wolfName : this.wolfList.keySet()) {
                    TMyPlace myNewPosition = updateWolfPosition(createMyPlace(this.wolfList.get(wolfName).getXx(), this.wolfList.get(wolfName).getYy()));
                    TPlace myPlace = myNewPosition.getPlace().get(0); //New position
                    //updateWolfPosition
                    if (this.wolfList.containsKey(wolfName)) { //Search for the name in the hashmap (Wolf)        

                        int lastX = this.wolfList.get(wolfName).getXx();   //Last position Xx
                        int lastY = this.wolfList.get(wolfName).getYy();   //Last position Yy
                   
                            if (!(this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isWolf()) //Movement to an empty position 
                                && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isObstacle()
                                && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isDog()
                                && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isCow()) {
                            this.myEnvironment[lastX][lastY].setEntity(null);
                            this.myEnvironment[lastX][lastY].setWolf(false);
                            this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setEntity(wolfName);
                            this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setWolf(true);
                            this.wolfList.get(wolfName).setXx(myPlace.getPosition().getXx());
                            this.wolfList.get(wolfName).setYy(myPlace.getPosition().getYy());

                        } else {
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isDog()) { //Dog than eats a Wolf
                                this.myEnvironment[lastX][lastY].setEntity(null); //Remove from last position
                                this.myEnvironment[lastX][lastY].setWolf(false); //Remove from last position
                                wolfsToKill.add(wolfName);//Add to the list to remove later
                            }
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isWolf()) {
                                //Wolf in the same position
                            }
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isObstacle()) {
                                //Moving to obstacle
                            }
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isCow()) {
                                String lastEntity = this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].getEntity(); //Entity of Cow in the new positin

                                //UpdateTable
                                this.myEnvironment[lastX][lastY].setEntity(null); //Remove wolf from last position
                                this.myEnvironment[lastX][lastY].setWolf(false);  //Remove wolf from last position
                                this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setEntity(wolfName);
                                this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setWolf(true);

                                this.wolfList.get(wolfName).setXx(myPlace.getPosition().getXx());
                                this.wolfList.get(wolfName).setYy(myPlace.getPosition().getYy());
                                this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setCow(false);
                                this.cowList.remove(lastEntity);
                                this.log = this.log + wolfName + " killed " + lastEntity + ".\n";
                            }
                        }
                    }
                }
                
                //Remove Wolfs from HashMap
                for (String wolfID : wolfsToKill) {
                    this.wolfList.remove(wolfID);
                }       
                    
                // send update for all dogs 
                for (String dogName : this.dogList.keySet()) {
                    TMyPlace myNewPosition = updateDogPosition(createMyPlace(this.dogList.get(dogName).getXx(), this.dogList.get(dogName).getYy()));
                    TPlace myPlace = myNewPosition.getPlace().get(0); //New position
                    //updateDogPosition
                    if (this.dogList.containsKey(dogName)) { //Search for the name in the hashmap (Dog)        

                        int lastX = this.dogList.get(dogName).getXx();   //Last position Xx
                        int lastY = this.dogList.get(dogName).getYy();   //Last position Yy

                        if (!(this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isDog()) //Movement to an empty position 
                                && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isObstacle()
                                && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isWolf()
                                && !this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isCow()) {
                            this.myEnvironment[lastX][lastY].setEntity(null);
                            this.myEnvironment[lastX][lastY].setDog(false);

                            this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setEntity(dogName);
                            this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setDog(true);
                            this.dogList.get(dogName).setXx(myPlace.getPosition().getXx());
                            this.dogList.get(dogName).setYy(myPlace.getPosition().getYy());

                        } else {
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isDog()) {
                                //Dog in the same position
                            }
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isObstacle()) {
                                //Moving to obstacle
                            }
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isCow()) {
                                //Moving to cow
                            }
                            if (this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].isWolf()) {
                                String lastEntity = this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].getEntity(); //Entity of Wolf in the new position   

                                //UpdateTable
                                this.myEnvironment[lastX][lastY].setEntity(null); //Remove dog from last position
                                this.myEnvironment[lastX][lastY].setDog(false);  //Remove dog from last position
                                this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setEntity(dogName);
                                this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setDog(true);

                                this.dogList.get(dogName).setXx(myPlace.getPosition().getXx());
                                this.dogList.get(dogName).setYy(myPlace.getPosition().getYy());
                                this.myEnvironment[myPlace.getPosition().getXx()][myPlace.getPosition().getYy()].setWolf(false);
                                this.wolfList.remove(lastEntity);
                                this.log = this.log + dogName + " killed " + lastEntity + ".\n";
                            }
                        }
                    }
                }

                // Atualização da GUI com o tabuleiro e o registo de mortes
                this.myGUI.updateGUI(this.myEnvironment, this.log);
                this.updateGrass();
                turn++;

                Thread.sleep(simulationSpeed);
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (cow.JAXBException_Exception ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (dog.JAXBException_Exception ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException_Exception ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private TMyPlace updateCowPosition(TMyPlace currentMyPlace) throws JAXBException, cow.JAXBException_Exception{   
        //Serialize TMyPlace object to string
        String serializedCowString = MessageManagement.createPlaceStateContent(currentMyPlace);
        //call service to update cow position
        // IN JAVA:
        //String updatedCow = cowInput(serializedCowString);
        // IN C#:
        String updatedCow = cowMovement(serializedCowString);
        //Deserialize result string to TMyPlace
        TMyPlace updatedCow_obj = MessageManagement.retrievePlaceStateObject(updatedCow);
        return updatedCow_obj; 
    }

    private TMyPlace updateWolfPosition(TMyPlace currentMyPlace) throws JAXBException, JAXBException_Exception{
        //Serialize TMyPlace object to string
        String serializedWolfString = MessageManagement.createPlaceStateContent(currentMyPlace);
        //call service to update cow position
        // IN JAVA:
        //String updatedWolf = wolfInput(serializedWolfString);
        // IN C#:
        String updatedWolf = wolfMovement(serializedWolfString);
        //Deserilize result string to TMyPlace
        TMyPlace updatedWolf_obj = MessageManagement.retrievePlaceStateObject(updatedWolf);
        return updatedWolf_obj;
    }
    
    private TMyPlace updateDogPosition(TMyPlace currentMyPlace) throws JAXBException, dog.JAXBException_Exception{
        //Serialize TMyPlace object to string
        String serializedDogString = MessageManagement.createPlaceStateContent(currentMyPlace);
        //call service to update cow position
        // IN JAVA:
        //String updatedDog = dogInput(serializedDogString);
        // IN C#:
        String updatedDog = dogMovement(serializedDogString);
        //Deserilize result string to TMyPlace
        TMyPlace updatedDog_obj = MessageManagement.retrievePlaceStateObject(updatedDog);
        return updatedDog_obj;
    }

    private static String cowMovement(java.lang.String input) {
        c_sharp.MovementWebService service = new c_sharp.MovementWebService();
        c_sharp.MovementWebServiceSoap port = service.getMovementWebServiceSoap();
        return port.cowMovement(input);
    }

    private static String dogMovement(java.lang.String input) {
        c_sharp.MovementWebService service = new c_sharp.MovementWebService();
        c_sharp.MovementWebServiceSoap port = service.getMovementWebServiceSoap();
        return port.dogMovement(input);
    }

    private static String wolfMovement(java.lang.String input) {
        c_sharp.MovementWebService service = new c_sharp.MovementWebService();
        c_sharp.MovementWebServiceSoap port = service.getMovementWebServiceSoap();
        return port.wolfMovement(input);
    }

    private static String wolfInput(java.lang.String arg0) throws JAXBException_Exception {
        Services.WolfControl_Service service = new Services.WolfControl_Service();
        Services.WolfControl port = service.getWolfControlPort();
        return port.wolfInput(arg0);
    }

    private static String cowInput(java.lang.String arg0) throws cow.JAXBException_Exception {
        cow.CowControl_Service service = new cow.CowControl_Service();
        cow.CowControl port = service.getCowControlPort();
        return port.cowInput(arg0);
    }

    private static String dogInput(java.lang.String arg0) throws dog.JAXBException_Exception {
        dog.DogControl_Service service = new dog.DogControl_Service();
        dog.DogControl port = service.getDogControlPort();
        return port.dogInput(arg0);
    }
}
