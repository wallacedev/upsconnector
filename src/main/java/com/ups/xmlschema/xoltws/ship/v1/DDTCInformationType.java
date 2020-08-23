
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DDTCInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DDTCInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITARExemptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USMLCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligiblePartyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasurement" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}UnitOfMeasurementType"/>
 *         &lt;element name="SignificantMilitaryEquipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACMNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDTCInformationType", propOrder = {
    "itarExemptionNumber",
    "usmlCategoryCode",
    "eligiblePartyIndicator",
    "registrationNumber",
    "quantity",
    "unitOfMeasurement",
    "significantMilitaryEquipmentIndicator",
    "acmNumber"
})
public class DDTCInformationType {

    @XmlElement(name = "ITARExemptionNumber")
    protected String itarExemptionNumber;
    @XmlElement(name = "USMLCategoryCode")
    protected String usmlCategoryCode;
    @XmlElement(name = "EligiblePartyIndicator")
    protected String eligiblePartyIndicator;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitOfMeasurement", required = true)
    protected UnitOfMeasurementType unitOfMeasurement;
    @XmlElement(name = "SignificantMilitaryEquipmentIndicator")
    protected String significantMilitaryEquipmentIndicator;
    @XmlElement(name = "ACMNumber")
    protected String acmNumber;

    /**
     * Gets the value of the itarExemptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITARExemptionNumber() {
        return itarExemptionNumber;
    }

    /**
     * Sets the value of the itarExemptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITARExemptionNumber(String value) {
        this.itarExemptionNumber = value;
    }

    /**
     * Gets the value of the usmlCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSMLCategoryCode() {
        return usmlCategoryCode;
    }

    /**
     * Sets the value of the usmlCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSMLCategoryCode(String value) {
        this.usmlCategoryCode = value;
    }

    /**
     * Gets the value of the eligiblePartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligiblePartyIndicator() {
        return eligiblePartyIndicator;
    }

    /**
     * Sets the value of the eligiblePartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligiblePartyIndicator(String value) {
        this.eligiblePartyIndicator = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurementType }
     *     
     */
    public UnitOfMeasurementType getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurementType }
     *     
     */
    public void setUnitOfMeasurement(UnitOfMeasurementType value) {
        this.unitOfMeasurement = value;
    }

    /**
     * Gets the value of the significantMilitaryEquipmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantMilitaryEquipmentIndicator() {
        return significantMilitaryEquipmentIndicator;
    }

    /**
     * Sets the value of the significantMilitaryEquipmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantMilitaryEquipmentIndicator(String value) {
        this.significantMilitaryEquipmentIndicator = value;
    }

    /**
     * Gets the value of the acmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACMNumber() {
        return acmNumber;
    }

    /**
     * Sets the value of the acmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACMNumber(String value) {
        this.acmNumber = value;
    }

}
