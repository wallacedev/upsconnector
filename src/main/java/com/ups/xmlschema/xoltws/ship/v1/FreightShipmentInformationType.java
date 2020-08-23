
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightShipmentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreightDensityInfo" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}FreightDensityInfoType" minOccurs="0"/>
 *         &lt;element name="DensityEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightShipmentInformationType", propOrder = {
    "freightDensityInfo",
    "densityEligibleIndicator"
})
public class FreightShipmentInformationType {

    @XmlElement(name = "FreightDensityInfo")
    protected FreightDensityInfoType freightDensityInfo;
    @XmlElement(name = "DensityEligibleIndicator")
    protected String densityEligibleIndicator;

    /**
     * Gets the value of the freightDensityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FreightDensityInfoType }
     *     
     */
    public FreightDensityInfoType getFreightDensityInfo() {
        return freightDensityInfo;
    }

    /**
     * Sets the value of the freightDensityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightDensityInfoType }
     *     
     */
    public void setFreightDensityInfo(FreightDensityInfoType value) {
        this.freightDensityInfo = value;
    }

    /**
     * Gets the value of the densityEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensityEligibleIndicator() {
        return densityEligibleIndicator;
    }

    /**
     * Sets the value of the densityEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensityEligibleIndicator(String value) {
        this.densityEligibleIndicator = value;
    }

}
