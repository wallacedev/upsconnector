
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FRSShipmentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRSShipmentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportationCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}TransportationChargeType"/>
 *         &lt;element name="FreightDensityRate" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}FreightDensityRateType" minOccurs="0"/>
 *         &lt;element name="HandlingUnits" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}HandlingUnitsResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRSShipmentDataType", propOrder = {
    "transportationCharges",
    "freightDensityRate",
    "handlingUnits"
})
public class FRSShipmentDataType {

    @XmlElement(name = "TransportationCharges", required = true)
    protected TransportationChargeType transportationCharges;
    @XmlElement(name = "FreightDensityRate")
    protected FreightDensityRateType freightDensityRate;
    @XmlElement(name = "HandlingUnits")
    protected List<HandlingUnitsResponseType> handlingUnits;

    /**
     * Gets the value of the transportationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationChargeType }
     *     
     */
    public TransportationChargeType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * Sets the value of the transportationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationChargeType }
     *     
     */
    public void setTransportationCharges(TransportationChargeType value) {
        this.transportationCharges = value;
    }

    /**
     * Gets the value of the freightDensityRate property.
     * 
     * @return
     *     possible object is
     *     {@link FreightDensityRateType }
     *     
     */
    public FreightDensityRateType getFreightDensityRate() {
        return freightDensityRate;
    }

    /**
     * Sets the value of the freightDensityRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightDensityRateType }
     *     
     */
    public void setFreightDensityRate(FreightDensityRateType value) {
        this.freightDensityRate = value;
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
     * {@link HandlingUnitsResponseType }
     * 
     * 
     */
    public List<HandlingUnitsResponseType> getHandlingUnits() {
        if (handlingUnits == null) {
            handlingUnits = new ArrayList<HandlingUnitsResponseType>();
        }
        return this.handlingUnits;
    }

}
