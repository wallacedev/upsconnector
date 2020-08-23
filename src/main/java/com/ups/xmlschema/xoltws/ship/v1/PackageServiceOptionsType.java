
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryConfirmation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}DeliveryConfirmationType" minOccurs="0"/>
 *         &lt;element name="DeclaredValue" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackageDeclaredValueType" minOccurs="0"/>
 *         &lt;element name="COD" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PSOCODType" minOccurs="0"/>
 *         &lt;element name="AccessPointCOD" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackageServiceOptionsAccessPointCODType" minOccurs="0"/>
 *         &lt;element name="VerbalConfirmation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}VerbalConfirmationType" minOccurs="0"/>
 *         &lt;element name="ShipperReleaseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notification" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PSONotificationType" minOccurs="0"/>
 *         &lt;element name="HazMat" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}HazMatType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="DryIce" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}DryIceType" minOccurs="0"/>
 *         &lt;element name="UPSPremiumCareIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProactiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClinicalTrialsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefrigerationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsType", propOrder = {
    "deliveryConfirmation",
    "declaredValue",
    "cod",
    "accessPointCOD",
    "verbalConfirmation",
    "shipperReleaseIndicator",
    "notification",
    "hazMat",
    "dryIce",
    "upsPremiumCareIndicator",
    "proactiveIndicator",
    "packageIdentifier",
    "clinicalTrialsID",
    "refrigerationIndicator"
})
public class PackageServiceOptionsType {

    @XmlElement(name = "DeliveryConfirmation")
    protected DeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "DeclaredValue")
    protected PackageDeclaredValueType declaredValue;
    @XmlElement(name = "COD")
    protected PSOCODType cod;
    @XmlElement(name = "AccessPointCOD")
    protected PackageServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "VerbalConfirmation")
    protected VerbalConfirmationType verbalConfirmation;
    @XmlElement(name = "ShipperReleaseIndicator")
    protected String shipperReleaseIndicator;
    @XmlElement(name = "Notification")
    protected PSONotificationType notification;
    @XmlElement(name = "HazMat")
    protected List<HazMatType> hazMat;
    @XmlElement(name = "DryIce")
    protected DryIceType dryIce;
    @XmlElement(name = "UPSPremiumCareIndicator")
    protected String upsPremiumCareIndicator;
    @XmlElement(name = "ProactiveIndicator")
    protected String proactiveIndicator;
    @XmlElement(name = "PackageIdentifier")
    protected String packageIdentifier;
    @XmlElement(name = "ClinicalTrialsID")
    protected String clinicalTrialsID;
    @XmlElement(name = "RefrigerationIndicator")
    protected String refrigerationIndicator;

    /**
     * Gets the value of the deliveryConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationType }
     *     
     */
    public DeliveryConfirmationType getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Sets the value of the deliveryConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationType }
     *     
     */
    public void setDeliveryConfirmation(DeliveryConfirmationType value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link PackageDeclaredValueType }
     *     
     */
    public PackageDeclaredValueType getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageDeclaredValueType }
     *     
     */
    public void setDeclaredValue(PackageDeclaredValueType value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     * @return
     *     possible object is
     *     {@link PSOCODType }
     *     
     */
    public PSOCODType getCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSOCODType }
     *     
     */
    public void setCOD(PSOCODType value) {
        this.cod = value;
    }

    /**
     * Gets the value of the accessPointCOD property.
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsAccessPointCODType }
     *     
     */
    public PackageServiceOptionsAccessPointCODType getAccessPointCOD() {
        return accessPointCOD;
    }

    /**
     * Sets the value of the accessPointCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsAccessPointCODType }
     *     
     */
    public void setAccessPointCOD(PackageServiceOptionsAccessPointCODType value) {
        this.accessPointCOD = value;
    }

    /**
     * Gets the value of the verbalConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link VerbalConfirmationType }
     *     
     */
    public VerbalConfirmationType getVerbalConfirmation() {
        return verbalConfirmation;
    }

    /**
     * Sets the value of the verbalConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerbalConfirmationType }
     *     
     */
    public void setVerbalConfirmation(VerbalConfirmationType value) {
        this.verbalConfirmation = value;
    }

    /**
     * Gets the value of the shipperReleaseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperReleaseIndicator() {
        return shipperReleaseIndicator;
    }

    /**
     * Sets the value of the shipperReleaseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperReleaseIndicator(String value) {
        this.shipperReleaseIndicator = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link PSONotificationType }
     *     
     */
    public PSONotificationType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSONotificationType }
     *     
     */
    public void setNotification(PSONotificationType value) {
        this.notification = value;
    }

    /**
     * Gets the value of the hazMat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazMat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazMat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazMatType }
     * 
     * 
     */
    public List<HazMatType> getHazMat() {
        if (hazMat == null) {
            hazMat = new ArrayList<HazMatType>();
        }
        return this.hazMat;
    }

    /**
     * Gets the value of the dryIce property.
     * 
     * @return
     *     possible object is
     *     {@link DryIceType }
     *     
     */
    public DryIceType getDryIce() {
        return dryIce;
    }

    /**
     * Sets the value of the dryIce property.
     * 
     * @param value
     *     allowed object is
     *     {@link DryIceType }
     *     
     */
    public void setDryIce(DryIceType value) {
        this.dryIce = value;
    }

    /**
     * Gets the value of the upsPremiumCareIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSPremiumCareIndicator() {
        return upsPremiumCareIndicator;
    }

    /**
     * Sets the value of the upsPremiumCareIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSPremiumCareIndicator(String value) {
        this.upsPremiumCareIndicator = value;
    }

    /**
     * Gets the value of the proactiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProactiveIndicator() {
        return proactiveIndicator;
    }

    /**
     * Sets the value of the proactiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProactiveIndicator(String value) {
        this.proactiveIndicator = value;
    }

    /**
     * Gets the value of the packageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * Sets the value of the packageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageIdentifier(String value) {
        this.packageIdentifier = value;
    }

    /**
     * Gets the value of the clinicalTrialsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalTrialsID() {
        return clinicalTrialsID;
    }

    /**
     * Sets the value of the clinicalTrialsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalTrialsID(String value) {
        this.clinicalTrialsID = value;
    }

    /**
     * Gets the value of the refrigerationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrigerationIndicator() {
        return refrigerationIndicator;
    }

    /**
     * Sets the value of the refrigerationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrigerationIndicator(String value) {
        this.refrigerationIndicator = value;
    }

}
