
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateDeliveryAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateDeliveryAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttentionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSAccessPointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ADLAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateDeliveryAddressType", propOrder = {
    "name",
    "attentionName",
    "upsAccessPointID",
    "address"
})
public class AlternateDeliveryAddressType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AttentionName")
    protected String attentionName;
    @XmlElement(name = "UPSAccessPointID")
    protected String upsAccessPointID;
    @XmlElement(name = "Address", required = true)
    protected ADLAddressType address;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attentionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * Sets the value of the attentionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionName(String value) {
        this.attentionName = value;
    }

    /**
     * Gets the value of the upsAccessPointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSAccessPointID() {
        return upsAccessPointID;
    }

    /**
     * Sets the value of the upsAccessPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSAccessPointID(String value) {
        this.upsAccessPointID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADLAddressType }
     *     
     */
    public ADLAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADLAddressType }
     *     
     */
    public void setAddress(ADLAddressType value) {
        this.address = value;
    }

}
