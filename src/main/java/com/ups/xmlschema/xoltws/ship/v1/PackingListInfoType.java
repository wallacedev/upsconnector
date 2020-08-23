
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackingListInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackingListInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageAssociated" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}PackageAssociatedType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackingListInfoType", propOrder = {
    "packageAssociated"
})
public class PackingListInfoType {

    @XmlElement(name = "PackageAssociated", required = true)
    protected List<PackageAssociatedType> packageAssociated;

    /**
     * Gets the value of the packageAssociated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageAssociated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageAssociated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageAssociatedType }
     * 
     * 
     */
    public List<PackageAssociatedType> getPackageAssociated() {
        if (packageAssociated == null) {
            packageAssociated = new ArrayList<PackageAssociatedType>();
        }
        return this.packageAssociated;
    }

}
