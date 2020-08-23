
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseServiceCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipChargeType" minOccurs="0"/>
 *         &lt;element name="ServiceOptionsCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipChargeType" minOccurs="0"/>
 *         &lt;element name="ShippingLabel" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}LabelType" minOccurs="0"/>
 *         &lt;element name="ShippingReceipt" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ReceiptType" minOccurs="0"/>
 *         &lt;element name="USPSPICNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CN22Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accessorial" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}AccessorialType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Form" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}FormType" minOccurs="0"/>
 *         &lt;element name="ItemizedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NegotiatedCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}NegotiatedChargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageResultsType", propOrder = {
    "trackingNumber",
    "baseServiceCharge",
    "serviceOptionsCharges",
    "shippingLabel",
    "shippingReceipt",
    "uspspicNumber",
    "cn22Number",
    "accessorial",
    "form",
    "itemizedCharges",
    "negotiatedCharges"
})
public class PackageResultsType {

    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "BaseServiceCharge")
    protected ShipChargeType baseServiceCharge;
    @XmlElement(name = "ServiceOptionsCharges")
    protected ShipChargeType serviceOptionsCharges;
    @XmlElement(name = "ShippingLabel")
    protected LabelType shippingLabel;
    @XmlElement(name = "ShippingReceipt")
    protected ReceiptType shippingReceipt;
    @XmlElement(name = "USPSPICNumber")
    protected String uspspicNumber;
    @XmlElement(name = "CN22Number")
    protected String cn22Number;
    @XmlElement(name = "Accessorial")
    protected List<AccessorialType> accessorial;
    @XmlElement(name = "Form")
    protected FormType form;
    @XmlElement(name = "ItemizedCharges")
    protected List<ShipChargeType> itemizedCharges;
    @XmlElement(name = "NegotiatedCharges")
    protected NegotiatedChargesType negotiatedCharges;

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the baseServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ShipChargeType }
     *     
     */
    public ShipChargeType getBaseServiceCharge() {
        return baseServiceCharge;
    }

    /**
     * Sets the value of the baseServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipChargeType }
     *     
     */
    public void setBaseServiceCharge(ShipChargeType value) {
        this.baseServiceCharge = value;
    }

    /**
     * Gets the value of the serviceOptionsCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ShipChargeType }
     *     
     */
    public ShipChargeType getServiceOptionsCharges() {
        return serviceOptionsCharges;
    }

    /**
     * Sets the value of the serviceOptionsCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipChargeType }
     *     
     */
    public void setServiceOptionsCharges(ShipChargeType value) {
        this.serviceOptionsCharges = value;
    }

    /**
     * Gets the value of the shippingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link LabelType }
     *     
     */
    public LabelType getShippingLabel() {
        return shippingLabel;
    }

    /**
     * Sets the value of the shippingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType }
     *     
     */
    public void setShippingLabel(LabelType value) {
        this.shippingLabel = value;
    }

    /**
     * Gets the value of the shippingReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptType }
     *     
     */
    public ReceiptType getShippingReceipt() {
        return shippingReceipt;
    }

    /**
     * Sets the value of the shippingReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptType }
     *     
     */
    public void setShippingReceipt(ReceiptType value) {
        this.shippingReceipt = value;
    }

    /**
     * Gets the value of the uspspicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSPICNumber() {
        return uspspicNumber;
    }

    /**
     * Sets the value of the uspspicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSPICNumber(String value) {
        this.uspspicNumber = value;
    }

    /**
     * Gets the value of the cn22Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22Number() {
        return cn22Number;
    }

    /**
     * Sets the value of the cn22Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22Number(String value) {
        this.cn22Number = value;
    }

    /**
     * Gets the value of the accessorial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessorial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessorialType }
     * 
     * 
     */
    public List<AccessorialType> getAccessorial() {
        if (accessorial == null) {
            accessorial = new ArrayList<AccessorialType>();
        }
        return this.accessorial;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setForm(FormType value) {
        this.form = value;
    }

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
     * Gets the value of the negotiatedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedChargesType }
     *     
     */
    public NegotiatedChargesType getNegotiatedCharges() {
        return negotiatedCharges;
    }

    /**
     * Sets the value of the negotiatedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedChargesType }
     *     
     */
    public void setNegotiatedCharges(NegotiatedChargesType value) {
        this.negotiatedCharges = value;
    }

}
