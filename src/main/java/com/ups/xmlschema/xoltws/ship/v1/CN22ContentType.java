
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CN22ContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CN22ContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CN22ContentQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CN22ContentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CN22ContentWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ProductWeightType" minOccurs="0"/>
 *         &lt;element name="CN22ContentTotalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CN22ContentCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CN22ContentCountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CN22ContentTariffNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CN22ContentType", propOrder = {
    "cn22ContentQuantity",
    "cn22ContentDescription",
    "cn22ContentWeight",
    "cn22ContentTotalValue",
    "cn22ContentCurrencyCode",
    "cn22ContentCountryOfOrigin",
    "cn22ContentTariffNumber"
})
public class CN22ContentType {

    @XmlElement(name = "CN22ContentQuantity")
    protected String cn22ContentQuantity;
    @XmlElement(name = "CN22ContentDescription")
    protected String cn22ContentDescription;
    @XmlElement(name = "CN22ContentWeight")
    protected ProductWeightType cn22ContentWeight;
    @XmlElement(name = "CN22ContentTotalValue")
    protected String cn22ContentTotalValue;
    @XmlElement(name = "CN22ContentCurrencyCode")
    protected String cn22ContentCurrencyCode;
    @XmlElement(name = "CN22ContentCountryOfOrigin")
    protected String cn22ContentCountryOfOrigin;
    @XmlElement(name = "CN22ContentTariffNumber")
    protected String cn22ContentTariffNumber;

    /**
     * Gets the value of the cn22ContentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22ContentQuantity() {
        return cn22ContentQuantity;
    }

    /**
     * Sets the value of the cn22ContentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22ContentQuantity(String value) {
        this.cn22ContentQuantity = value;
    }

    /**
     * Gets the value of the cn22ContentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22ContentDescription() {
        return cn22ContentDescription;
    }

    /**
     * Sets the value of the cn22ContentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22ContentDescription(String value) {
        this.cn22ContentDescription = value;
    }

    /**
     * Gets the value of the cn22ContentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ProductWeightType }
     *     
     */
    public ProductWeightType getCN22ContentWeight() {
        return cn22ContentWeight;
    }

    /**
     * Sets the value of the cn22ContentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductWeightType }
     *     
     */
    public void setCN22ContentWeight(ProductWeightType value) {
        this.cn22ContentWeight = value;
    }

    /**
     * Gets the value of the cn22ContentTotalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22ContentTotalValue() {
        return cn22ContentTotalValue;
    }

    /**
     * Sets the value of the cn22ContentTotalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22ContentTotalValue(String value) {
        this.cn22ContentTotalValue = value;
    }

    /**
     * Gets the value of the cn22ContentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22ContentCurrencyCode() {
        return cn22ContentCurrencyCode;
    }

    /**
     * Sets the value of the cn22ContentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22ContentCurrencyCode(String value) {
        this.cn22ContentCurrencyCode = value;
    }

    /**
     * Gets the value of the cn22ContentCountryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22ContentCountryOfOrigin() {
        return cn22ContentCountryOfOrigin;
    }

    /**
     * Sets the value of the cn22ContentCountryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22ContentCountryOfOrigin(String value) {
        this.cn22ContentCountryOfOrigin = value;
    }

    /**
     * Gets the value of the cn22ContentTariffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22ContentTariffNumber() {
        return cn22ContentTariffNumber;
    }

    /**
     * Sets the value of the cn22ContentTariffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22ContentTariffNumber(String value) {
        this.cn22ContentTariffNumber = value;
    }

}
