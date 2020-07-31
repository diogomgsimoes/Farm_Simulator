//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.28 at 01:31:45 PM BST 
//


package org.netbeans.xml.schema.updateschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPlace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPlace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Grass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wolf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Dog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Obstacle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Entity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Position" type="{http://xml.netbeans.org/schema/updateSchema}tPosition"/>
 *         &lt;element name="Stamina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPlace", propOrder = {
    "grass",
    "wolf",
    "cow",
    "dog",
    "obstacle",
    "entity",
    "position",
    "stamina",
    "sex"
})
public class TPlace {

    @XmlElement(name = "Grass")
    protected int grass;
    @XmlElement(name = "Wolf")
    protected boolean wolf;
    @XmlElement(name = "Cow")
    protected boolean cow;
    @XmlElement(name = "Dog")
    protected boolean dog;
    @XmlElement(name = "Obstacle")
    protected boolean obstacle;
    @XmlElement(name = "Entity", required = true)
    protected String entity;
    @XmlElement(name = "Position", required = true)
    protected TPosition position;
    @XmlElement(name = "Stamina")
    protected int stamina;
    @XmlElement(name = "Sex")
    protected int sex;

    /**
     * Gets the value of the grass property.
     * 
     */
    public int getGrass() {
        return grass;
    }

    /**
     * Sets the value of the grass property.
     * 
     */
    public void setGrass(int value) {
        this.grass = value;
    }

    /**
     * Gets the value of the wolf property.
     * 
     */
    public boolean isWolf() {
        return wolf;
    }

    /**
     * Sets the value of the wolf property.
     * 
     */
    public void setWolf(boolean value) {
        this.wolf = value;
    }

    /**
     * Gets the value of the cow property.
     * 
     */
    public boolean isCow() {
        return cow;
    }

    /**
     * Sets the value of the cow property.
     * 
     */
    public void setCow(boolean value) {
        this.cow = value;
    }

    /**
     * Gets the value of the dog property.
     * 
     */
    public boolean isDog() {
        return dog;
    }

    /**
     * Sets the value of the dog property.
     * 
     */
    public void setDog(boolean value) {
        this.dog = value;
    }

    /**
     * Gets the value of the obstacle property.
     * 
     */
    public boolean isObstacle() {
        return obstacle;
    }

    /**
     * Sets the value of the obstacle property.
     * 
     */
    public void setObstacle(boolean value) {
        this.obstacle = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link TPosition }
     *     
     */
    public TPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPosition }
     *     
     */
    public void setPosition(TPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the stamina property.
     * 
     */
    public int getStamina() {
        return stamina;
    }

    /**
     * Sets the value of the stamina property.
     * 
     */
    public void setStamina(int value) {
        this.stamina = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     */
    public int getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

}
