
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
 *         &lt;element name="WolfMovementResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wolfMovementResult"
})
@XmlRootElement(name = "WolfMovementResponse")
public class WolfMovementResponse {

    @XmlElement(name = "WolfMovementResult")
    protected String wolfMovementResult;

    /**
     * Gets the value of the wolfMovementResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWolfMovementResult() {
        return wolfMovementResult;
    }

    /**
     * Sets the value of the wolfMovementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWolfMovementResult(String value) {
        this.wolfMovementResult = value;
    }

}
