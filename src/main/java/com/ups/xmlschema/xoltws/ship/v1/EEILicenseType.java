
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EEILicenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EEILicenseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseLineValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECCNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEILicenseType", propOrder = {
    "number",
    "code",
    "licenseLineValue",
    "eccnNumber"
})
public class EEILicenseType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "LicenseLineValue")
    protected String licenseLineValue;
    @XmlElement(name = "ECCNNumber")
    protected String eccnNumber;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

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
     * Gets the value of the licenseLineValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseLineValue() {
        return licenseLineValue;
    }

    /**
     * Sets the value of the licenseLineValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseLineValue(String value) {
        this.licenseLineValue = value;
    }

    /**
     * Gets the value of the eccnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECCNNumber() {
        return eccnNumber;
    }

    /**
     * Sets the value of the eccnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECCNNumber(String value) {
        this.eccnNumber = value;
    }

}
