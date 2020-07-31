
package c_sharp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DogMovementResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dogMovementResult"
})
@XmlRootElement(name = "DogMovementResponse")
public class DogMovementResponse {

    @XmlElement(name = "DogMovementResult")
    protected String dogMovementResult;

    /**
     * Gets the value of the dogMovementResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogMovementResult() {
        return dogMovementResult;
    }

    /**
     * Sets the value of the dogMovementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogMovementResult(String value) {
        this.dogMovementResult = value;
    }

}
