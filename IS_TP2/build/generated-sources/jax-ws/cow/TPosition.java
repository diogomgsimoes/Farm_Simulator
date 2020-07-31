
package cow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPosition", namespace = "http://xml.netbeans.org/schema/updateSchema", propOrder = {
    "xx",
    "yy"
})
public class TPosition {

    @XmlElement(namespace = "http://xml.netbeans.org/schema/updateSchema")
    protected int xx;
    @XmlElement(namespace = "http://xml.netbeans.org/schema/updateSchema")
    protected int yy;

    /**
     * Gets the value of the xx property.
     * 
     */
    public int getXx() {
        return xx;
    }

    /**
     * Sets the value of the xx property.
     * 
     */
    public void setXx(int value) {
        this.xx = value;
    }

    /**
     * Gets the value of the yy property.
     * 
     */
    public int getYy() {
        return yy;
    }

    /**
     * Sets the value of the yy property.
     * 
     */
    public void setYy(int value) {
        this.yy = value;
    }

}
