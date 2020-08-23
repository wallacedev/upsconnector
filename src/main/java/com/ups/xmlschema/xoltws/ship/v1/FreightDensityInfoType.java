
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightDensityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightDensityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedHeightIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedHeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}AdjustedHeightType" minOccurs="0"/>
 *         &lt;element name="HandlingUnits" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}HandlingUnitsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightDensityInfoType", propOrder = {
    "adjustedHeightIndicator",
    "adjustedHeight",
    "handlingUnits"
})
public class FreightDensityInfoType {

    @XmlElement(name = "AdjustedHeightIndicator")
    protected String adjustedHeightIndicator;
    @XmlElement(name = "AdjustedHeight")
    protected AdjustedHeightType adjustedHeight;
    @XmlElement(name = "HandlingUnits")
    protected List<HandlingUnitsType> handlingUnits;

    /**
     * Gets the value of the adjustedHeightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedHeightIndicator() {
        return adjustedHeightIndicator;
    }

    /**
     * Sets the value of the adjustedHeightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedHeightIndicator(String value) {
        this.adjustedHeightIndicator = value;
    }

    /**
     * Gets the value of the adjustedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedHeightType }
     *     
     */
    public AdjustedHeightType getAdjustedHeight() {
        return adjustedHeight;
    }

    /**
     * Sets the value of the adjustedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedHeightType }
     *     
     */
    public void setAdjustedHeight(AdjustedHeightType value) {
        this.adjustedHeight = value;
    }

    /**
     * Gets the value of the handlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingUnitsType }
     * 
     * 
     */
    public List<HandlingUnitsType> getHandlingUnits() {
        if (handlingUnits == null) {
            handlingUnits = new ArrayList<HandlingUnitsType>();
        }
        return this.handlingUnits;
    }

}
