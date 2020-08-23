
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazMatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazMatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackagingTypeQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordIdentifier1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordIdentifier2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordIdentifier3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubRiskClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aDRItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aDRPackingGroupLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardLabelRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassDivisionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PackagingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProperShippingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagingGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagingInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportableQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransportationMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommodityRegulatedLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TunnelRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChemicalRecordIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalTechnicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalProperShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazMatType", propOrder = {
    "packagingTypeQuantity",
    "recordIdentifier1",
    "recordIdentifier2",
    "recordIdentifier3",
    "subRiskClass",
    "adrItemNumber",
    "adrPackingGroupLetter",
    "technicalName",
    "hazardLabelRequired",
    "classDivisionNumber",
    "referenceNumber",
    "quantity",
    "uom",
    "packagingType",
    "idNumber",
    "properShippingName",
    "additionalDescription",
    "packagingGroupType",
    "packagingInstructionCode",
    "emergencyPhone",
    "emergencyContact",
    "reportableQuantity",
    "regulationSet",
    "transportationMode",
    "commodityRegulatedLevelCode",
    "transportCategory",
    "tunnelRestrictionCode",
    "chemicalRecordIdentifier",
    "localTechnicalName",
    "localProperShippingName"
})
public class HazMatType {

    @XmlElement(name = "PackagingTypeQuantity")
    protected String packagingTypeQuantity;
    @XmlElement(name = "RecordIdentifier1")
    protected String recordIdentifier1;
    @XmlElement(name = "RecordIdentifier2")
    protected String recordIdentifier2;
    @XmlElement(name = "RecordIdentifier3")
    protected String recordIdentifier3;
    @XmlElement(name = "SubRiskClass")
    protected String subRiskClass;
    @XmlElement(name = "aDRItemNumber")
    protected String adrItemNumber;
    @XmlElement(name = "aDRPackingGroupLetter")
    protected String adrPackingGroupLetter;
    @XmlElement(name = "TechnicalName")
    protected String technicalName;
    @XmlElement(name = "HazardLabelRequired")
    protected String hazardLabelRequired;
    @XmlElement(name = "ClassDivisionNumber", required = true)
    protected String classDivisionNumber;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "UOM", required = true)
    protected String uom;
    @XmlElement(name = "PackagingType", required = true)
    protected String packagingType;
    @XmlElement(name = "IDNumber", required = true)
    protected String idNumber;
    @XmlElement(name = "ProperShippingName", required = true)
    protected String properShippingName;
    @XmlElement(name = "AdditionalDescription")
    protected String additionalDescription;
    @XmlElement(name = "PackagingGroupType")
    protected String packagingGroupType;
    @XmlElement(name = "PackagingInstructionCode")
    protected String packagingInstructionCode;
    @XmlElement(name = "EmergencyPhone")
    protected String emergencyPhone;
    @XmlElement(name = "EmergencyContact")
    protected String emergencyContact;
    @XmlElement(name = "ReportableQuantity")
    protected String reportableQuantity;
    @XmlElement(name = "RegulationSet", required = true)
    protected String regulationSet;
    @XmlElement(name = "TransportationMode", required = true)
    protected String transportationMode;
    @XmlElement(name = "CommodityRegulatedLevelCode")
    protected String commodityRegulatedLevelCode;
    @XmlElement(name = "TransportCategory")
    protected String transportCategory;
    @XmlElement(name = "TunnelRestrictionCode")
    protected String tunnelRestrictionCode;
    @XmlElement(name = "ChemicalRecordIdentifier")
    protected String chemicalRecordIdentifier;
    @XmlElement(name = "LocalTechnicalName")
    protected String localTechnicalName;
    @XmlElement(name = "LocalProperShippingName")
    protected String localProperShippingName;

    /**
     * Gets the value of the packagingTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingTypeQuantity() {
        return packagingTypeQuantity;
    }

    /**
     * Sets the value of the packagingTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingTypeQuantity(String value) {
        this.packagingTypeQuantity = value;
    }

    /**
     * Gets the value of the recordIdentifier1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier1() {
        return recordIdentifier1;
    }

    /**
     * Sets the value of the recordIdentifier1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier1(String value) {
        this.recordIdentifier1 = value;
    }

    /**
     * Gets the value of the recordIdentifier2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier2() {
        return recordIdentifier2;
    }

    /**
     * Sets the value of the recordIdentifier2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier2(String value) {
        this.recordIdentifier2 = value;
    }

    /**
     * Gets the value of the recordIdentifier3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier3() {
        return recordIdentifier3;
    }

    /**
     * Sets the value of the recordIdentifier3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier3(String value) {
        this.recordIdentifier3 = value;
    }

    /**
     * Gets the value of the subRiskClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRiskClass() {
        return subRiskClass;
    }

    /**
     * Sets the value of the subRiskClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRiskClass(String value) {
        this.subRiskClass = value;
    }

    /**
     * Gets the value of the adrItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRItemNumber() {
        return adrItemNumber;
    }

    /**
     * Sets the value of the adrItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRItemNumber(String value) {
        this.adrItemNumber = value;
    }

    /**
     * Gets the value of the adrPackingGroupLetter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRPackingGroupLetter() {
        return adrPackingGroupLetter;
    }

    /**
     * Sets the value of the adrPackingGroupLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRPackingGroupLetter(String value) {
        this.adrPackingGroupLetter = value;
    }

    /**
     * Gets the value of the technicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * Sets the value of the technicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalName(String value) {
        this.technicalName = value;
    }

    /**
     * Gets the value of the hazardLabelRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardLabelRequired() {
        return hazardLabelRequired;
    }

    /**
     * Sets the value of the hazardLabelRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardLabelRequired(String value) {
        this.hazardLabelRequired = value;
    }

    /**
     * Gets the value of the classDivisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDivisionNumber() {
        return classDivisionNumber;
    }

    /**
     * Sets the value of the classDivisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDivisionNumber(String value) {
        this.classDivisionNumber = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
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
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOM(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the properShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperShippingName() {
        return properShippingName;
    }

    /**
     * Sets the value of the properShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperShippingName(String value) {
        this.properShippingName = value;
    }

    /**
     * Gets the value of the additionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDescription() {
        return additionalDescription;
    }

    /**
     * Sets the value of the additionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDescription(String value) {
        this.additionalDescription = value;
    }

    /**
     * Gets the value of the packagingGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingGroupType() {
        return packagingGroupType;
    }

    /**
     * Sets the value of the packagingGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingGroupType(String value) {
        this.packagingGroupType = value;
    }

    /**
     * Gets the value of the packagingInstructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingInstructionCode() {
        return packagingInstructionCode;
    }

    /**
     * Sets the value of the packagingInstructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingInstructionCode(String value) {
        this.packagingInstructionCode = value;
    }

    /**
     * Gets the value of the emergencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    /**
     * Sets the value of the emergencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyPhone(String value) {
        this.emergencyPhone = value;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContact(String value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the reportableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportableQuantity() {
        return reportableQuantity;
    }

    /**
     * Sets the value of the reportableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportableQuantity(String value) {
        this.reportableQuantity = value;
    }

    /**
     * Gets the value of the regulationSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationSet() {
        return regulationSet;
    }

    /**
     * Sets the value of the regulationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationSet(String value) {
        this.regulationSet = value;
    }

    /**
     * Gets the value of the transportationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * Sets the value of the transportationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
    }

    /**
     * Gets the value of the commodityRegulatedLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityRegulatedLevelCode() {
        return commodityRegulatedLevelCode;
    }

    /**
     * Sets the value of the commodityRegulatedLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityRegulatedLevelCode(String value) {
        this.commodityRegulatedLevelCode = value;
    }

    /**
     * Gets the value of the transportCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCategory() {
        return transportCategory;
    }

    /**
     * Sets the value of the transportCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportCategory(String value) {
        this.transportCategory = value;
    }

    /**
     * Gets the value of the tunnelRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }

    /**
     * Sets the value of the tunnelRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelRestrictionCode(String value) {
        this.tunnelRestrictionCode = value;
    }

    /**
     * Gets the value of the chemicalRecordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalRecordIdentifier() {
        return chemicalRecordIdentifier;
    }

    /**
     * Sets the value of the chemicalRecordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalRecordIdentifier(String value) {
        this.chemicalRecordIdentifier = value;
    }

    /**
     * Gets the value of the localTechnicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTechnicalName() {
        return localTechnicalName;
    }

    /**
     * Sets the value of the localTechnicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTechnicalName(String value) {
        this.localTechnicalName = value;
    }

    /**
     * Gets the value of the localProperShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalProperShippingName() {
        return localProperShippingName;
    }

    /**
     * Sets the value of the localProperShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalProperShippingName(String value) {
        this.localProperShippingName = value;
    }

}
