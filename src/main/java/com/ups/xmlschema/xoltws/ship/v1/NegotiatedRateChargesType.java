
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegotiatedRateChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegotiatedRateChargesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemizedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}TaxChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipChargeType" minOccurs="0"/>
 *         &lt;element name="TotalChargesWithTaxes" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegotiatedRateChargesType", propOrder = {
    "itemizedCharges",
    "taxCharges",
    "totalCharge",
    "totalChargesWithTaxes"
})
public class NegotiatedRateChargesType {

    @XmlElement(name = "ItemizedCharges")
    protected List<ShipChargeType> itemizedCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "TotalCharge")
    protected ShipChargeType totalCharge;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected ShipChargeType totalChargesWithTaxes;

    /**
     * Gets the value of the itemizedCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipChargeType }
     * 
     * 
     */
    public List<ShipChargeType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<ShipChargeType>();
        }
        return this.itemizedCharges;
    }

    /**
     * Gets the value of the taxCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxChargeType }
     * 
     * 
     */
    public List<TaxChargeType> getTaxCharges() {
        if (taxCharges == null) {
            taxCharges = new ArrayList<TaxChargeType>();
        }
        return this.taxCharges;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ShipChargeType }
     *     
     */
    public ShipChargeType getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipChargeType }
     *     
     */
    public void setTotalCharge(ShipChargeType value) {
        this.totalCharge = value;
    }

    /**
     * Gets the value of the totalChargesWithTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ShipChargeType }
     *     
     */
    public ShipChargeType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * Sets the value of the totalChargesWithTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipChargeType }
     *     
     */
    public void setTotalChargesWithTaxes(ShipChargeType value) {
        this.totalChargesWithTaxes = value;
    }

}
