
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMail" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}EmailDetailsType"/>
 *         &lt;element name="VoiceMessage" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipmentServiceOptionsNotificationVoiceMessageType" minOccurs="0"/>
 *         &lt;element name="TextMessage" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipmentServiceOptionsNotificationTextMessageType" minOccurs="0"/>
 *         &lt;element name="Locale" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}LocaleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "notificationCode",
    "eMail",
    "voiceMessage",
    "textMessage",
    "locale"
})
public class NotificationType {

    @XmlElement(name = "NotificationCode", required = true)
    protected String notificationCode;
    @XmlElement(name = "EMail", required = true)
    protected EmailDetailsType eMail;
    @XmlElement(name = "VoiceMessage")
    protected ShipmentServiceOptionsNotificationVoiceMessageType voiceMessage;
    @XmlElement(name = "TextMessage")
    protected ShipmentServiceOptionsNotificationTextMessageType textMessage;
    @XmlElement(name = "Locale")
    protected LocaleType locale;

    /**
     * Gets the value of the notificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCode() {
        return notificationCode;
    }

    /**
     * Sets the value of the notificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCode(String value) {
        this.notificationCode = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDetailsType }
     *     
     */
    public EmailDetailsType getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailDetailsType }
     *     
     */
    public void setEMail(EmailDetailsType value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the voiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsNotificationVoiceMessageType }
     *     
     */
    public ShipmentServiceOptionsNotificationVoiceMessageType getVoiceMessage() {
        return voiceMessage;
    }

    /**
     * Sets the value of the voiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsNotificationVoiceMessageType }
     *     
     */
    public void setVoiceMessage(ShipmentServiceOptionsNotificationVoiceMessageType value) {
        this.voiceMessage = value;
    }

    /**
     * Gets the value of the textMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsNotificationTextMessageType }
     *     
     */
    public ShipmentServiceOptionsNotificationTextMessageType getTextMessage() {
        return textMessage;
    }

    /**
     * Sets the value of the textMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsNotificationTextMessageType }
     *     
     */
    public void setTextMessage(ShipmentServiceOptionsNotificationTextMessageType value) {
        this.textMessage = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleType }
     *     
     */
    public LocaleType getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleType }
     *     
     */
    public void setLocale(LocaleType value) {
        this.locale = value;
    }

}
