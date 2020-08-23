
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="6"/>
 *         &lt;element name="UserCreatedForm" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}UserCreatedFormType" minOccurs="0"/>
 *         &lt;element name="CN22Form" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}CN22FormType" minOccurs="0"/>
 *         &lt;element name="UPSPremiumCareForm" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}UPSPremiumCareFormType" minOccurs="0"/>
 *         &lt;element name="AdditionalDocumentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormGroupIdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEDFilingOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EEIFilingOption" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}EEIFilingOptionType" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ContactType" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ProductType" maxOccurs="50"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsOfShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonForExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeclarationStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}IFChargesType" minOccurs="0"/>
 *         &lt;element name="FreightCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}IFChargesType" minOccurs="0"/>
 *         &lt;element name="InsuranceCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}IFChargesType" minOccurs="0"/>
 *         &lt;element name="OtherCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}OtherChargesType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BlanketPeriod" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}BlanketPeriodType" minOccurs="0"/>
 *         &lt;element name="ExportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointOfOriginType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeOfTransport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortOfExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortOfUnloading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoadingPier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartiesToTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutedExportTransactionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContainerizedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="License" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}LicenseType" minOccurs="0"/>
 *         &lt;element name="ECCNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverridePaperlessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipperMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MultiCurrencyInvoiceLineTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalFormType", propOrder = {
    "formType",
    "userCreatedForm",
    "cn22Form",
    "upsPremiumCareForm",
    "additionalDocumentIndicator",
    "formGroupIdName",
    "sedFilingOption",
    "eeiFilingOption",
    "contacts",
    "product",
    "invoiceNumber",
    "invoiceDate",
    "purchaseOrderNumber",
    "termsOfShipment",
    "reasonForExport",
    "comments",
    "declarationStatement",
    "discount",
    "freightCharges",
    "insuranceCharges",
    "otherCharges",
    "currencyCode",
    "blanketPeriod",
    "exportDate",
    "exportingCarrier",
    "carrierID",
    "inBondCode",
    "entryNumber",
    "pointOfOrigin",
    "pointOfOriginType",
    "modeOfTransport",
    "portOfExport",
    "portOfUnloading",
    "loadingPier",
    "partiesToTransaction",
    "routedExportTransactionIndicator",
    "containerizedIndicator",
    "license",
    "eccnNumber",
    "overridePaperlessIndicator",
    "shipperMemo",
    "multiCurrencyInvoiceLineTotal",
    "hazardousMaterialsIndicator"
})
public class InternationalFormType {

    @XmlElement(name = "FormType", required = true)
    protected List<String> formType;
    @XmlElement(name = "UserCreatedForm")
    protected UserCreatedFormType userCreatedForm;
    @XmlElement(name = "CN22Form")
    protected CN22FormType cn22Form;
    @XmlElement(name = "UPSPremiumCareForm")
    protected UPSPremiumCareFormType upsPremiumCareForm;
    @XmlElement(name = "AdditionalDocumentIndicator")
    protected String additionalDocumentIndicator;
    @XmlElement(name = "FormGroupIdName")
    protected String formGroupIdName;
    @XmlElement(name = "SEDFilingOption")
    protected String sedFilingOption;
    @XmlElement(name = "EEIFilingOption")
    protected EEIFilingOptionType eeiFilingOption;
    @XmlElement(name = "Contacts")
    protected ContactType contacts;
    @XmlElement(name = "Product", required = true)
    protected List<ProductType> product;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceDate")
    protected String invoiceDate;
    @XmlElement(name = "PurchaseOrderNumber")
    protected String purchaseOrderNumber;
    @XmlElement(name = "TermsOfShipment")
    protected String termsOfShipment;
    @XmlElement(name = "ReasonForExport")
    protected String reasonForExport;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DeclarationStatement")
    protected String declarationStatement;
    @XmlElement(name = "Discount")
    protected IFChargesType discount;
    @XmlElement(name = "FreightCharges")
    protected IFChargesType freightCharges;
    @XmlElement(name = "InsuranceCharges")
    protected IFChargesType insuranceCharges;
    @XmlElement(name = "OtherCharges")
    protected OtherChargesType otherCharges;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "BlanketPeriod")
    protected BlanketPeriodType blanketPeriod;
    @XmlElement(name = "ExportDate")
    protected String exportDate;
    @XmlElement(name = "ExportingCarrier")
    protected String exportingCarrier;
    @XmlElement(name = "CarrierID")
    protected String carrierID;
    @XmlElement(name = "InBondCode")
    protected String inBondCode;
    @XmlElement(name = "EntryNumber")
    protected String entryNumber;
    @XmlElement(name = "PointOfOrigin")
    protected String pointOfOrigin;
    @XmlElement(name = "PointOfOriginType")
    protected String pointOfOriginType;
    @XmlElement(name = "ModeOfTransport")
    protected String modeOfTransport;
    @XmlElement(name = "PortOfExport")
    protected String portOfExport;
    @XmlElement(name = "PortOfUnloading")
    protected String portOfUnloading;
    @XmlElement(name = "LoadingPier")
    protected String loadingPier;
    @XmlElement(name = "PartiesToTransaction")
    protected String partiesToTransaction;
    @XmlElement(name = "RoutedExportTransactionIndicator")
    protected String routedExportTransactionIndicator;
    @XmlElement(name = "ContainerizedIndicator")
    protected String containerizedIndicator;
    @XmlElement(name = "License")
    protected LicenseType license;
    @XmlElement(name = "ECCNNumber")
    protected String eccnNumber;
    @XmlElement(name = "OverridePaperlessIndicator")
    protected String overridePaperlessIndicator;
    @XmlElement(name = "ShipperMemo")
    protected String shipperMemo;
    @XmlElement(name = "MultiCurrencyInvoiceLineTotal")
    protected String multiCurrencyInvoiceLineTotal;
    @XmlElement(name = "HazardousMaterialsIndicator")
    protected String hazardousMaterialsIndicator;

    /**
     * Gets the value of the formType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormType() {
        if (formType == null) {
            formType = new ArrayList<String>();
        }
        return this.formType;
    }

    /**
     * Gets the value of the userCreatedForm property.
     * 
     * @return
     *     possible object is
     *     {@link UserCreatedFormType }
     *     
     */
    public UserCreatedFormType getUserCreatedForm() {
        return userCreatedForm;
    }

    /**
     * Sets the value of the userCreatedForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCreatedFormType }
     *     
     */
    public void setUserCreatedForm(UserCreatedFormType value) {
        this.userCreatedForm = value;
    }

    /**
     * Gets the value of the cn22Form property.
     * 
     * @return
     *     possible object is
     *     {@link CN22FormType }
     *     
     */
    public CN22FormType getCN22Form() {
        return cn22Form;
    }

    /**
     * Sets the value of the cn22Form property.
     * 
     * @param value
     *     allowed object is
     *     {@link CN22FormType }
     *     
     */
    public void setCN22Form(CN22FormType value) {
        this.cn22Form = value;
    }

    /**
     * Gets the value of the upsPremiumCareForm property.
     * 
     * @return
     *     possible object is
     *     {@link UPSPremiumCareFormType }
     *     
     */
    public UPSPremiumCareFormType getUPSPremiumCareForm() {
        return upsPremiumCareForm;
    }

    /**
     * Sets the value of the upsPremiumCareForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPSPremiumCareFormType }
     *     
     */
    public void setUPSPremiumCareForm(UPSPremiumCareFormType value) {
        this.upsPremiumCareForm = value;
    }

    /**
     * Gets the value of the additionalDocumentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDocumentIndicator() {
        return additionalDocumentIndicator;
    }

    /**
     * Sets the value of the additionalDocumentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDocumentIndicator(String value) {
        this.additionalDocumentIndicator = value;
    }

    /**
     * Gets the value of the formGroupIdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormGroupIdName() {
        return formGroupIdName;
    }

    /**
     * Sets the value of the formGroupIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormGroupIdName(String value) {
        this.formGroupIdName = value;
    }

    /**
     * Gets the value of the sedFilingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDFilingOption() {
        return sedFilingOption;
    }

    /**
     * Sets the value of the sedFilingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDFilingOption(String value) {
        this.sedFilingOption = value;
    }

    /**
     * Gets the value of the eeiFilingOption property.
     * 
     * @return
     *     possible object is
     *     {@link EEIFilingOptionType }
     *     
     */
    public EEIFilingOptionType getEEIFilingOption() {
        return eeiFilingOption;
    }

    /**
     * Sets the value of the eeiFilingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEIFilingOptionType }
     *     
     */
    public void setEEIFilingOption(EEIFilingOptionType value) {
        this.eeiFilingOption = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContacts(ContactType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the termsOfShipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfShipment() {
        return termsOfShipment;
    }

    /**
     * Sets the value of the termsOfShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfShipment(String value) {
        this.termsOfShipment = value;
    }

    /**
     * Gets the value of the reasonForExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForExport() {
        return reasonForExport;
    }

    /**
     * Sets the value of the reasonForExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForExport(String value) {
        this.reasonForExport = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the declarationStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationStatement() {
        return declarationStatement;
    }

    /**
     * Sets the value of the declarationStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationStatement(String value) {
        this.declarationStatement = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link IFChargesType }
     *     
     */
    public IFChargesType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IFChargesType }
     *     
     */
    public void setDiscount(IFChargesType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link IFChargesType }
     *     
     */
    public IFChargesType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link IFChargesType }
     *     
     */
    public void setFreightCharges(IFChargesType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the insuranceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link IFChargesType }
     *     
     */
    public IFChargesType getInsuranceCharges() {
        return insuranceCharges;
    }

    /**
     * Sets the value of the insuranceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link IFChargesType }
     *     
     */
    public void setInsuranceCharges(IFChargesType value) {
        this.insuranceCharges = value;
    }

    /**
     * Gets the value of the otherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link OtherChargesType }
     *     
     */
    public OtherChargesType getOtherCharges() {
        return otherCharges;
    }

    /**
     * Sets the value of the otherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherChargesType }
     *     
     */
    public void setOtherCharges(OtherChargesType value) {
        this.otherCharges = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the blanketPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BlanketPeriodType }
     *     
     */
    public BlanketPeriodType getBlanketPeriod() {
        return blanketPeriod;
    }

    /**
     * Sets the value of the blanketPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlanketPeriodType }
     *     
     */
    public void setBlanketPeriod(BlanketPeriodType value) {
        this.blanketPeriod = value;
    }

    /**
     * Gets the value of the exportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDate() {
        return exportDate;
    }

    /**
     * Sets the value of the exportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDate(String value) {
        this.exportDate = value;
    }

    /**
     * Gets the value of the exportingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportingCarrier() {
        return exportingCarrier;
    }

    /**
     * Sets the value of the exportingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportingCarrier(String value) {
        this.exportingCarrier = value;
    }

    /**
     * Gets the value of the carrierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierID() {
        return carrierID;
    }

    /**
     * Sets the value of the carrierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierID(String value) {
        this.carrierID = value;
    }

    /**
     * Gets the value of the inBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBondCode() {
        return inBondCode;
    }

    /**
     * Sets the value of the inBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBondCode(String value) {
        this.inBondCode = value;
    }

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumber(String value) {
        this.entryNumber = value;
    }

    /**
     * Gets the value of the pointOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfOrigin() {
        return pointOfOrigin;
    }

    /**
     * Sets the value of the pointOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfOrigin(String value) {
        this.pointOfOrigin = value;
    }

    /**
     * Gets the value of the pointOfOriginType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfOriginType() {
        return pointOfOriginType;
    }

    /**
     * Sets the value of the pointOfOriginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfOriginType(String value) {
        this.pointOfOriginType = value;
    }

    /**
     * Gets the value of the modeOfTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfTransport() {
        return modeOfTransport;
    }

    /**
     * Sets the value of the modeOfTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfTransport(String value) {
        this.modeOfTransport = value;
    }

    /**
     * Gets the value of the portOfExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfExport() {
        return portOfExport;
    }

    /**
     * Sets the value of the portOfExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfExport(String value) {
        this.portOfExport = value;
    }

    /**
     * Gets the value of the portOfUnloading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfUnloading() {
        return portOfUnloading;
    }

    /**
     * Sets the value of the portOfUnloading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfUnloading(String value) {
        this.portOfUnloading = value;
    }

    /**
     * Gets the value of the loadingPier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadingPier() {
        return loadingPier;
    }

    /**
     * Sets the value of the loadingPier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadingPier(String value) {
        this.loadingPier = value;
    }

    /**
     * Gets the value of the partiesToTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartiesToTransaction() {
        return partiesToTransaction;
    }

    /**
     * Sets the value of the partiesToTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartiesToTransaction(String value) {
        this.partiesToTransaction = value;
    }

    /**
     * Gets the value of the routedExportTransactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutedExportTransactionIndicator() {
        return routedExportTransactionIndicator;
    }

    /**
     * Sets the value of the routedExportTransactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutedExportTransactionIndicator(String value) {
        this.routedExportTransactionIndicator = value;
    }

    /**
     * Gets the value of the containerizedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerizedIndicator() {
        return containerizedIndicator;
    }

    /**
     * Sets the value of the containerizedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerizedIndicator(String value) {
        this.containerizedIndicator = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseType }
     *     
     */
    public LicenseType getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseType }
     *     
     */
    public void setLicense(LicenseType value) {
        this.license = value;
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

    /**
     * Gets the value of the overridePaperlessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaperlessIndicator() {
        return overridePaperlessIndicator;
    }

    /**
     * Sets the value of the overridePaperlessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaperlessIndicator(String value) {
        this.overridePaperlessIndicator = value;
    }

    /**
     * Gets the value of the shipperMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperMemo() {
        return shipperMemo;
    }

    /**
     * Sets the value of the shipperMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperMemo(String value) {
        this.shipperMemo = value;
    }

    /**
     * Gets the value of the multiCurrencyInvoiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiCurrencyInvoiceLineTotal() {
        return multiCurrencyInvoiceLineTotal;
    }

    /**
     * Sets the value of the multiCurrencyInvoiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiCurrencyInvoiceLineTotal(String value) {
        this.multiCurrencyInvoiceLineTotal = value;
    }

    /**
     * Gets the value of the hazardousMaterialsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMaterialsIndicator() {
        return hazardousMaterialsIndicator;
    }

    /**
     * Sets the value of the hazardousMaterialsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMaterialsIndicator(String value) {
        this.hazardousMaterialsIndicator = value;
    }

}
