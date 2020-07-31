
package c_sharp;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the c_sharp package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: c_sharp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CowMovement }
     * 
     */
    public CowMovement createCowMovement() {
        return new CowMovement();
    }

    /**
     * Create an instance of {@link WolfMovement }
     * 
     */
    public WolfMovement createWolfMovement() {
        return new WolfMovement();
    }

    /**
     * Create an instance of {@link CowMovementResponse }
     * 
     */
    public CowMovementResponse createCowMovementResponse() {
        return new CowMovementResponse();
    }

    /**
     * Create an instance of {@link DogMovementResponse }
     * 
     */
    public DogMovementResponse createDogMovementResponse() {
        return new DogMovementResponse();
    }

    /**
     * Create an instance of {@link DogMovement }
     * 
     */
    public DogMovement createDogMovement() {
        return new DogMovement();
    }

    /**
     * Create an instance of {@link WolfMovementResponse }
     * 
     */
    public WolfMovementResponse createWolfMovementResponse() {
        return new WolfMovementResponse();
    }

}
