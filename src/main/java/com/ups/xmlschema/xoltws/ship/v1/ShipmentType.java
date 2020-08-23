
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnService" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ReturnServiceType" minOccurs="0"/>
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipper" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipperType"/>
 *         &lt;element name="ShipTo" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipToType"/>
 *         &lt;element name="AlternateDeliveryAddress" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}AlternateDeliveryAddressType" minOccurs="0"/>
 *         &lt;element name="ShipFrom" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipFromType" minOccurs="0"/>
 *         &lt;element name="PaymentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PaymentInfoType" minOccurs="0"/>
 *         &lt;element name="FRSPaymentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}FRSPaymentInfoType" minOccurs="0"/>
 *         &lt;element name="FreightShipmentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}FreightShipmentInformationType" minOccurs="0"/>
 *         &lt;element name="GoodsNotInFreeCirculationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentRatingOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}RateInfoType" minOccurs="0"/>
 *         &lt;element name="MovementReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ReferenceNumberType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ServiceType"/>
 *         &lt;element name="InvoiceLineTotal" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}CurrencyMonetaryType" minOccurs="0"/>
 *         &lt;element name="NumOfPiecesInShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USPSEndorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MILabelCN22Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostCenterBarcodeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageIDBarcodeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IrregularIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentIndicationType" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}IndicationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MIDualReturnShipmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIDualReturnShipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingMethodRequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalDiscountInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PromotionalDiscountInformationType" minOccurs="0"/>
 *         &lt;element name="DGSignatoryInfo" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}DGSignatoryInfoType" minOccurs="0"/>
 *         &lt;element name="MasterCartonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterCartonIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentServiceOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipmentServiceOptionsType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Package" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}PackageType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "description",
    "returnService",
    "documentsOnlyIndicator",
    "shipper",
    "shipTo",
    "alternateDeliveryAddress",
    "shipFrom",
    "paymentInformation",
    "frsPaymentInformation",
    "freightShipmentInformation",
    "goodsNotInFreeCirculationIndicator",
    "shipmentRatingOptions",
    "movementReferenceNumber",
    "referenceNumber",
    "service",
    "invoiceLineTotal",
    "numOfPiecesInShipment",
    "uspsEndorsement",
    "miLabelCN22Indicator",
    "subClassification",
    "costCenter",
    "costCenterBarcodeIndicator",
    "packageID",
    "packageIDBarcodeIndicator",
    "irregularIndicator",
    "shipmentIndicationType",
    "miDualReturnShipmentKey",
    "miDualReturnShipmentIndicator",
    "ratingMethodRequestedIndicator",
    "taxInformationIndicator",
    "promotionalDiscountInformation",
    "dgSignatoryInfo",
    "masterCartonID",
    "masterCartonIndicator",
    "shipmentServiceOptions",
    "_package"
})
public class ShipmentType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ReturnService")
    protected ReturnServiceType returnService;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "Shipper", required = true)
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo", required = true)
    protected ShipToType shipTo;
    @XmlElement(name = "AlternateDeliveryAddress")
    protected AlternateDeliveryAddressType alternateDeliveryAddress;
    @XmlElement(name = "ShipFrom")
    protected ShipFromType shipFrom;
    @XmlElement(name = "PaymentInformation")
    protected PaymentInfoType paymentInformation;
    @XmlElement(name = "FRSPaymentInformation")
    protected FRSPaymentInfoType frsPaymentInformation;
    @XmlElement(name = "FreightShipmentInformation")
    protected FreightShipmentInformationType freightShipmentInformation;
    @XmlElement(name = "GoodsNotInFreeCirculationIndicator")
    protected String goodsNotInFreeCirculationIndicator;
    @XmlElement(name = "ShipmentRatingOptions")
    protected RateInfoType shipmentRatingOptions;
    @XmlElement(name = "MovementReferenceNumber")
    protected String movementReferenceNumber;
    @XmlElement(name = "ReferenceNumber")
    protected List<ReferenceNumberType> referenceNumber;
    @XmlElement(name = "Service", required = true)
    protected ServiceType service;
    @XmlElement(name = "InvoiceLineTotal")
    protected CurrencyMonetaryType invoiceLineTotal;
    @XmlElement(name = "NumOfPiecesInShipment")
    protected String numOfPiecesInShipment;
    @XmlElement(name = "USPSEndorsement")
    protected String uspsEndorsement;
    @XmlElement(name = "MILabelCN22Indicator")
    protected String miLabelCN22Indicator;
    @XmlElement(name = "SubClassification")
    protected String subClassification;
    @XmlElement(name = "CostCenter")
    protected String costCenter;
    @XmlElement(name = "CostCenterBarcodeIndicator")
    protected String costCenterBarcodeIndicator;
    @XmlElement(name = "PackageID")
    protected String packageID;
    @XmlElement(name = "PackageIDBarcodeIndicator")
    protected String packageIDBarcodeIndicator;
    @XmlElement(name = "IrregularIndicator")
    protected String irregularIndicator;
    @XmlElement(name = "ShipmentIndicationType")
    protected List<IndicationType> shipmentIndicationType;
    @XmlElement(name = "MIDualReturnShipmentKey")
    protected String miDualReturnShipmentKey;
    @XmlElement(name = "MIDualReturnShipmentIndicator")
    protected String miDualReturnShipmentIndicator;
    @XmlElement(name = "RatingMethodRequestedIndicator")
    protected String ratingMethodRequestedIndicator;
    @XmlElement(name = "TaxInformationIndicator")
    protected String taxInformationIndicator;
    @XmlElement(name = "PromotionalDiscountInformation")
    protected PromotionalDiscountInformationType promotionalDiscountInformation;
    @XmlElement(name = "DGSignatoryInfo")
    protected DGSignatoryInfoType dgSignatoryInfo;
    @XmlElement(name = "MasterCartonID")
    protected String masterCartonID;
    @XmlElement(name = "MasterCartonIndicator")
    protected String masterCartonIndicator;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentType.ShipmentServiceOptions shipmentServiceOptions;
    @XmlElement(name = "Package", required = true)
    protected List<PackageType> _package;

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
     * Gets the value of the returnService property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnServiceType }
     *     
     */
    public ReturnServiceType getReturnService() {
        return returnService;
    }

    /**
     * Sets the value of the returnService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnServiceType }
     *     
     */
    public void setReturnService(ReturnServiceType value) {
        this.returnService = value;
    }

    /**
     * Gets the value of the documentsOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * Sets the value of the documentsOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperType }
     *     
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *     
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the alternateDeliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateDeliveryAddressType }
     *     
     */
    public AlternateDeliveryAddressType getAlternateDeliveryAddress() {
        return alternateDeliveryAddress;
    }

    /**
     * Sets the value of the alternateDeliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateDeliveryAddressType }
     *     
     */
    public void setAlternateDeliveryAddress(AlternateDeliveryAddressType value) {
        this.alternateDeliveryAddress = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFromType }
     *     
     */
    public ShipFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFromType }
     *     
     */
    public void setShipFrom(ShipFromType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPaymentInformation(PaymentInfoType value) {
        this.paymentInformation = value;
    }

    /**
     * Gets the value of the frsPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FRSPaymentInfoType }
     *     
     */
    public FRSPaymentInfoType getFRSPaymentInformation() {
        return frsPaymentInformation;
    }

    /**
     * Sets the value of the frsPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRSPaymentInfoType }
     *     
     */
    public void setFRSPaymentInformation(FRSPaymentInfoType value) {
        this.frsPaymentInformation = value;
    }

    /**
     * Gets the value of the freightShipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightShipmentInformationType }
     *     
     */
    public FreightShipmentInformationType getFreightShipmentInformation() {
        return freightShipmentInformation;
    }

    /**
     * Sets the value of the freightShipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipmentInformationType }
     *     
     */
    public void setFreightShipmentInformation(FreightShipmentInformationType value) {
        this.freightShipmentInformation = value;
    }

    /**
     * Gets the value of the goodsNotInFreeCirculationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsNotInFreeCirculationIndicator() {
        return goodsNotInFreeCirculationIndicator;
    }

    /**
     * Sets the value of the goodsNotInFreeCirculationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsNotInFreeCirculationIndicator(String value) {
        this.goodsNotInFreeCirculationIndicator = value;
    }

    /**
     * Gets the value of the shipmentRatingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RateInfoType }
     *     
     */
    public RateInfoType getShipmentRatingOptions() {
        return shipmentRatingOptions;
    }

    /**
     * Sets the value of the shipmentRatingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfoType }
     *     
     */
    public void setShipmentRatingOptions(RateInfoType value) {
        this.shipmentRatingOptions = value;
    }

    /**
     * Gets the value of the movementReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementReferenceNumber() {
        return movementReferenceNumber;
    }

    /**
     * Sets the value of the movementReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementReferenceNumber(String value) {
        this.movementReferenceNumber = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceNumberType }
     * 
     * 
     */
    public List<ReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the invoiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyMonetaryType }
     *     
     */
    public CurrencyMonetaryType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * Sets the value of the invoiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyMonetaryType }
     *     
     */
    public void setInvoiceLineTotal(CurrencyMonetaryType value) {
        this.invoiceLineTotal = value;
    }

    /**
     * Gets the value of the numOfPiecesInShipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfPiecesInShipment() {
        return numOfPiecesInShipment;
    }

    /**
     * Sets the value of the numOfPiecesInShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfPiecesInShipment(String value) {
        this.numOfPiecesInShipment = value;
    }

    /**
     * Gets the value of the uspsEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSEndorsement() {
        return uspsEndorsement;
    }

    /**
     * Sets the value of the uspsEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSEndorsement(String value) {
        this.uspsEndorsement = value;
    }

    /**
     * Gets the value of the miLabelCN22Indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMILabelCN22Indicator() {
        return miLabelCN22Indicator;
    }

    /**
     * Sets the value of the miLabelCN22Indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMILabelCN22Indicator(String value) {
        this.miLabelCN22Indicator = value;
    }

    /**
     * Gets the value of the subClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassification() {
        return subClassification;
    }

    /**
     * Sets the value of the subClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassification(String value) {
        this.subClassification = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the costCenterBarcodeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterBarcodeIndicator() {
        return costCenterBarcodeIndicator;
    }

    /**
     * Sets the value of the costCenterBarcodeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterBarcodeIndicator(String value) {
        this.costCenterBarcodeIndicator = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageID(String value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the packageIDBarcodeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageIDBarcodeIndicator() {
        return packageIDBarcodeIndicator;
    }

    /**
     * Sets the value of the packageIDBarcodeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageIDBarcodeIndicator(String value) {
        this.packageIDBarcodeIndicator = value;
    }

    /**
     * Gets the value of the irregularIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrregularIndicator() {
        return irregularIndicator;
    }

    /**
     * Sets the value of the irregularIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrregularIndicator(String value) {
        this.irregularIndicator = value;
    }

    /**
     * Gets the value of the shipmentIndicationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentIndicationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentIndicationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationType }
     * 
     * 
     */
    public List<IndicationType> getShipmentIndicationType() {
        if (shipmentIndicationType == null) {
            shipmentIndicationType = new ArrayList<IndicationType>();
        }
        return this.shipmentIndicationType;
    }

    /**
     * Gets the value of the miDualReturnShipmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDualReturnShipmentKey() {
        return miDualReturnShipmentKey;
    }

    /**
     * Sets the value of the miDualReturnShipmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDualReturnShipmentKey(String value) {
        this.miDualReturnShipmentKey = value;
    }

    /**
     * Gets the value of the miDualReturnShipmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDualReturnShipmentIndicator() {
        return miDualReturnShipmentIndicator;
    }

    /**
     * Sets the value of the miDualReturnShipmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDualReturnShipmentIndicator(String value) {
        this.miDualReturnShipmentIndicator = value;
    }

    /**
     * Gets the value of the ratingMethodRequestedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingMethodRequestedIndicator() {
        return ratingMethodRequestedIndicator;
    }

    /**
     * Sets the value of the ratingMethodRequestedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingMethodRequestedIndicator(String value) {
        this.ratingMethodRequestedIndicator = value;
    }

    /**
     * Gets the value of the taxInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInformationIndicator() {
        return taxInformationIndicator;
    }

    /**
     * Sets the value of the taxInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInformationIndicator(String value) {
        this.taxInformationIndicator = value;
    }

    /**
     * Gets the value of the promotionalDiscountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalDiscountInformationType }
     *     
     */
    public PromotionalDiscountInformationType getPromotionalDiscountInformation() {
        return promotionalDiscountInformation;
    }

    /**
     * Sets the value of the promotionalDiscountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalDiscountInformationType }
     *     
     */
    public void setPromotionalDiscountInformation(PromotionalDiscountInformationType value) {
        this.promotionalDiscountInformation = value;
    }

    /**
     * Gets the value of the dgSignatoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DGSignatoryInfoType }
     *     
     */
    public DGSignatoryInfoType getDGSignatoryInfo() {
        return dgSignatoryInfo;
    }

    /**
     * Sets the value of the dgSignatoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DGSignatoryInfoType }
     *     
     */
    public void setDGSignatoryInfo(DGSignatoryInfoType value) {
        this.dgSignatoryInfo = value;
    }

    /**
     * Gets the value of the masterCartonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCartonID() {
        return masterCartonID;
    }

    /**
     * Sets the value of the masterCartonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCartonID(String value) {
        this.masterCartonID = value;
    }

    /**
     * Gets the value of the masterCartonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCartonIndicator() {
        return masterCartonIndicator;
    }

    /**
     * Sets the value of the masterCartonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCartonIndicator(String value) {
        this.masterCartonIndicator = value;
    }

    /**
     * Gets the value of the shipmentServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType.ShipmentServiceOptions }
     *     
     */
    public ShipmentType.ShipmentServiceOptions getShipmentServiceOptions() {
        return shipmentServiceOptions;
    }

    /**
     * Sets the value of the shipmentServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType.ShipmentServiceOptions }
     *     
     */
    public void setShipmentServiceOptions(ShipmentType.ShipmentServiceOptions value) {
        this.shipmentServiceOptions = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipmentServiceOptionsType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShipmentServiceOptions
        extends ShipmentServiceOptionsType
    {


    }

}
