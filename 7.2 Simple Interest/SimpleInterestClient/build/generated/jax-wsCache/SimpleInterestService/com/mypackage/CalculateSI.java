
package com.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateSI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prin" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="numb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rat" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSI", propOrder = {
    "prin",
    "numb",
    "rat"
})
public class CalculateSI {

    protected double prin;
    protected double numb;
    protected double rat;

    /**
     * Gets the value of the prin property.
     * 
     */
    public double getPrin() {
        return prin;
    }

    /**
     * Sets the value of the prin property.
     * 
     */
    public void setPrin(double value) {
        this.prin = value;
    }

    /**
     * Gets the value of the numb property.
     * 
     */
    public double getNumb() {
        return numb;
    }

    /**
     * Sets the value of the numb property.
     * 
     */
    public void setNumb(double value) {
        this.numb = value;
    }

    /**
     * Gets the value of the rat property.
     * 
     */
    public double getRat() {
        return rat;
    }

    /**
     * Sets the value of the rat property.
     * 
     */
    public void setRat(double value) {
        this.rat = value;
    }

}
