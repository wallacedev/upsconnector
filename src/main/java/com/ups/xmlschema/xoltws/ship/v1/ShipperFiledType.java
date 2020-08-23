
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipperFiledType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipperFiledType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreDepartureITNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptionLegend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EEIShipmentReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipperFiledType", propOrder = {
    "code",
    "description",
    "preDepartureITNNumber",
    "exemptionLegend",
    "eeiShipmentReferenceNumber"
})
public class ShipperFiledType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PreDepartureITNNumber")
    protected String preDepartureITNNumber;
    @XmlElement(name = "ExemptionLegend")
    protected String exemptionLegend;
    @XmlElement(name = "EEIShipmentReferenceNumber")
    protected String eeiShipmentReferenceNumber;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the preDepartureITNNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDepartureITNNumber() {
        return preDepartureITNNumber;
    }

    /**
     * Sets the value of the preDepartureITNNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDepartureITNNumber(String value) {
        this.preDepartureITNNumber = value;
    }

    /**
     * Gets the value of the exemptionLegend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionLegend() {
        return exemptionLegend;
    }

    /**
     * Sets the value of the exemptionLegend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionLegend(String value) {
        this.exemptionLegend = value;
    }

    /**
     * Gets the value of the eeiShipmentReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEEIShipmentReferenceNumber() {
        return eeiShipmentReferenceNumber;
    }

    /**
     * Sets the value of the eeiShipmentReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEEIShipmentReferenceNumber(String value) {
        this.eeiShipmentReferenceNumber = value;
    }

}
