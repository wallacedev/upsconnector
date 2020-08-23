
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPSPremiumCareFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPSPremiumCareFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrintType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumOfCopies" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LanguageForUPSPremiumCare" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}LanguageForUPSPremiumCareType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPSPremiumCareFormType", propOrder = {
    "shipmentDate",
    "pageSize",
    "printType",
    "numOfCopies",
    "languageForUPSPremiumCare"
})
public class UPSPremiumCareFormType {

    @XmlElement(name = "ShipmentDate", required = true)
    protected String shipmentDate;
    @XmlElement(name = "PageSize", required = true)
    protected String pageSize;
    @XmlElement(name = "PrintType", required = true)
    protected String printType;
    @XmlElement(name = "NumOfCopies", required = true)
    protected String numOfCopies;
    @XmlElement(name = "LanguageForUPSPremiumCare", required = true)
    protected LanguageForUPSPremiumCareType languageForUPSPremiumCare;

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDate(String value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the printType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the value of the printType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintType(String value) {
        this.printType = value;
    }

    /**
     * Gets the value of the numOfCopies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfCopies() {
        return numOfCopies;
    }

    /**
     * Sets the value of the numOfCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfCopies(String value) {
        this.numOfCopies = value;
    }

    /**
     * Gets the value of the languageForUPSPremiumCare property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageForUPSPremiumCareType }
     *     
     */
    public LanguageForUPSPremiumCareType getLanguageForUPSPremiumCare() {
        return languageForUPSPremiumCare;
    }

    /**
     * Sets the value of the languageForUPSPremiumCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageForUPSPremiumCareType }
     *     
     */
    public void setLanguageForUPSPremiumCare(LanguageForUPSPremiumCareType value) {
        this.languageForUPSPremiumCare = value;
    }

}
