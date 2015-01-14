/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2015 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.16 at 11:59:54 AM CEST 
//


package org.geosdi.geoplatform.xml.ows.v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Valid domain (or allowed set of values) of one quantity, with needed metadata but without a quantity name or identifier. 
 * 
 * <p>Java class for UnNamedDomainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnNamedDomainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/ows/1.1}PossibleValues"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}DefaultValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Meaning" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}DataType" minOccurs="0"/>
 *         &lt;group ref="{http://www.opengis.net/ows/1.1}ValuesUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Metadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnNamedDomainType", propOrder = {
    "allowedValues",
    "anyValue",
    "noValues",
    "valuesReference",
    "defaultValue",
    "meaning",
    "dataType",
    "uom",
    "referenceSystem",
    "metadata"
})
@XmlSeeAlso({
    DomainType.class
})
public class UnNamedDomainType
    implements ToString
{

    @XmlElement(name = "AllowedValues")
    protected AllowedValues allowedValues;
    @XmlElement(name = "AnyValue")
    protected AnyValue anyValue;
    @XmlElement(name = "NoValues")
    protected NoValues noValues;
    @XmlElement(name = "ValuesReference")
    protected ValuesReference valuesReference;
    @XmlElement(name = "DefaultValue")
    protected ValueType defaultValue;
    @XmlElement(name = "Meaning")
    protected DomainMetadataType meaning;
    @XmlElement(name = "DataType")
    protected DomainMetadataType dataType;
    @XmlElement(name = "UOM")
    protected DomainMetadataType uom;
    @XmlElement(name = "ReferenceSystem")
    protected DomainMetadataType referenceSystem;
    @XmlElement(name = "Metadata")
    protected List<MetadataType> metadata;

    /**
     * Gets the value of the allowedValues property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedValues }
     *     
     */
    public AllowedValues getAllowedValues() {
        return allowedValues;
    }

    /**
     * Sets the value of the allowedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedValues }
     *     
     */
    public void setAllowedValues(AllowedValues value) {
        this.allowedValues = value;
    }

    /**
     * Gets the value of the anyValue property.
     * 
     * @return
     *     possible object is
     *     {@link AnyValue }
     *     
     */
    public AnyValue getAnyValue() {
        return anyValue;
    }

    /**
     * Sets the value of the anyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyValue }
     *     
     */
    public void setAnyValue(AnyValue value) {
        this.anyValue = value;
    }

    /**
     * Gets the value of the noValues property.
     * 
     * @return
     *     possible object is
     *     {@link NoValues }
     *     
     */
    public NoValues getNoValues() {
        return noValues;
    }

    /**
     * Sets the value of the noValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoValues }
     *     
     */
    public void setNoValues(NoValues value) {
        this.noValues = value;
    }

    /**
     * Gets the value of the valuesReference property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesReference }
     *     
     */
    public ValuesReference getValuesReference() {
        return valuesReference;
    }

    /**
     * Sets the value of the valuesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesReference }
     *     
     */
    public void setValuesReference(ValuesReference value) {
        this.valuesReference = value;
    }

    /**
     * Optional default value for this quantity, which should be included when this quantity has a default value. 
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setDefaultValue(ValueType value) {
        this.defaultValue = value;
    }

    /**
     * Meaning metadata should be referenced or included for each quantity. 
     * 
     * @return
     *     possible object is
     *     {@link DomainMetadataType }
     *     
     */
    public DomainMetadataType getMeaning() {
        return meaning;
    }

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMetadataType }
     *     
     */
    public void setMeaning(DomainMetadataType value) {
        this.meaning = value;
    }

    /**
     * This data type metadata should be referenced or included for each quantity. 
     * 
     * @return
     *     possible object is
     *     {@link DomainMetadataType }
     *     
     */
    public DomainMetadataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMetadataType }
     *     
     */
    public void setDataType(DomainMetadataType value) {
        this.dataType = value;
    }

    /**
     * Identifier of unit of measure of this set of values. Should be included then this set of values has units (and not a more complete reference system). 
     * 
     * @return
     *     possible object is
     *     {@link DomainMetadataType }
     *     
     */
    public DomainMetadataType getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMetadataType }
     *     
     */
    public void setUOM(DomainMetadataType value) {
        this.uom = value;
    }

    /**
     * Identifier of reference system used by this set of values. Should be included then this set of values has a reference system (not just units). 
     * 
     * @return
     *     possible object is
     *     {@link DomainMetadataType }
     *     
     */
    public DomainMetadataType getReferenceSystem() {
        return referenceSystem;
    }

    /**
     * Sets the value of the referenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMetadataType }
     *     
     */
    public void setReferenceSystem(DomainMetadataType value) {
        this.referenceSystem = value;
    }

    /**
     * Optional unordered list of other metadata about this quantity. A list of required and optional other metadata elements for this quantity should be specified in the Implementation Specification for this service. Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataType }
     * 
     * 
     */
    public List<MetadataType> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<MetadataType>();
        }
        return this.metadata;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            AllowedValues theAllowedValues;
            theAllowedValues = this.getAllowedValues();
            strategy.appendField(locator, this, "allowedValues", buffer, theAllowedValues);
        }
        {
            AnyValue theAnyValue;
            theAnyValue = this.getAnyValue();
            strategy.appendField(locator, this, "anyValue", buffer, theAnyValue);
        }
        {
            NoValues theNoValues;
            theNoValues = this.getNoValues();
            strategy.appendField(locator, this, "noValues", buffer, theNoValues);
        }
        {
            ValuesReference theValuesReference;
            theValuesReference = this.getValuesReference();
            strategy.appendField(locator, this, "valuesReference", buffer, theValuesReference);
        }
        {
            ValueType theDefaultValue;
            theDefaultValue = this.getDefaultValue();
            strategy.appendField(locator, this, "defaultValue", buffer, theDefaultValue);
        }
        {
            DomainMetadataType theMeaning;
            theMeaning = this.getMeaning();
            strategy.appendField(locator, this, "meaning", buffer, theMeaning);
        }
        {
            DomainMetadataType theDataType;
            theDataType = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theDataType);
        }
        {
            DomainMetadataType theUOM;
            theUOM = this.getUOM();
            strategy.appendField(locator, this, "uom", buffer, theUOM);
        }
        {
            DomainMetadataType theReferenceSystem;
            theReferenceSystem = this.getReferenceSystem();
            strategy.appendField(locator, this, "referenceSystem", buffer, theReferenceSystem);
        }
        {
            List<MetadataType> theMetadata;
            theMetadata = (((this.metadata!= null)&&(!this.metadata.isEmpty()))?this.getMetadata():null);
            strategy.appendField(locator, this, "metadata", buffer, theMetadata);
        }
        return buffer;
    }

    public void setMetadata(List<MetadataType> value) {
        this.metadata = null;
        List<MetadataType> draftl = this.getMetadata();
        draftl.addAll(value);
    }

}
