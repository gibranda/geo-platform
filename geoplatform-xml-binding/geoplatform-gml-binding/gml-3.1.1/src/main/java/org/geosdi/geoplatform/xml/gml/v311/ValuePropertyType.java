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
// Generated on: 2012.04.17 at 10:27:36 PM CEST 
//


package org.geosdi.geoplatform.xml.gml.v311;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.w3c.dom.Element;


/**
 * GML property which refers to, or contains, a Value
 * 
 * <p>Java class for ValuePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{http://www.opengis.net/gml}Value"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuePropertyType", propOrder = {
    "_boolean",
    "category",
    "quantity",
    "count",
    "booleanList",
    "categoryList",
    "quantityList",
    "countList",
    "categoryExtent",
    "quantityExtent",
    "countExtent",
    "compositeValue",
    "object",
    "_null"
})
@XmlSeeAlso({
    CountPropertyType.class,
    QuantityPropertyType.class,
    BooleanPropertyType.class,
    ScalarValuePropertyType.class,
    CategoryPropertyType.class
})
public class ValuePropertyType
    implements ToString
{

    @XmlElement(name = "Boolean")
    protected Boolean _boolean;
    @XmlElement(name = "Category")
    protected CodeType category;
    @XmlElement(name = "Quantity")
    protected MeasureType quantity;
    @XmlElement(name = "Count")
    protected BigInteger count;
    @XmlList
    @XmlElement(name = "BooleanList")
    protected List<String> booleanList;
    @XmlElement(name = "CategoryList")
    protected CodeOrNullListType categoryList;
    @XmlElement(name = "QuantityList")
    protected MeasureOrNullListType quantityList;
    @XmlList
    @XmlElement(name = "CountList")
    protected List<String> countList;
    @XmlElement(name = "CategoryExtent")
    protected CategoryExtentType categoryExtent;
    @XmlElement(name = "QuantityExtent")
    protected QuantityExtentType quantityExtent;
    @XmlList
    @XmlElement(name = "CountExtent")
    protected List<String> countExtent;
    @XmlElementRef(name = "CompositeValue", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends CompositeValueType> compositeValue;
    @XmlAnyElement
    protected Element object;
    @XmlList
    @XmlElement(name = "Null")
    protected List<String> _null;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }

    public boolean isSetBoolean() {
        return (this._boolean!= null);
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCategory(CodeType value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setQuantity(MeasureType value) {
        this.quantity = value;
    }

    public boolean isSetQuantity() {
        return (this.quantity!= null);
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    public boolean isSetCount() {
        return (this.count!= null);
    }

    /**
     * Gets the value of the booleanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBooleanList() {
        if (booleanList == null) {
            booleanList = new ArrayList<String>();
        }
        return this.booleanList;
    }

    public boolean isSetBooleanList() {
        return ((this.booleanList!= null)&&(!this.booleanList.isEmpty()));
    }

    public void unsetBooleanList() {
        this.booleanList = null;
    }

    /**
     * Gets the value of the categoryList property.
     * 
     * @return
     *     possible object is
     *     {@link CodeOrNullListType }
     *     
     */
    public CodeOrNullListType getCategoryList() {
        return categoryList;
    }

    /**
     * Sets the value of the categoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeOrNullListType }
     *     
     */
    public void setCategoryList(CodeOrNullListType value) {
        this.categoryList = value;
    }

    public boolean isSetCategoryList() {
        return (this.categoryList!= null);
    }

    /**
     * Gets the value of the quantityList property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureOrNullListType }
     *     
     */
    public MeasureOrNullListType getQuantityList() {
        return quantityList;
    }

    /**
     * Sets the value of the quantityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureOrNullListType }
     *     
     */
    public void setQuantityList(MeasureOrNullListType value) {
        this.quantityList = value;
    }

    public boolean isSetQuantityList() {
        return (this.quantityList!= null);
    }

    /**
     * Gets the value of the countList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountList() {
        if (countList == null) {
            countList = new ArrayList<String>();
        }
        return this.countList;
    }

    public boolean isSetCountList() {
        return ((this.countList!= null)&&(!this.countList.isEmpty()));
    }

    public void unsetCountList() {
        this.countList = null;
    }

    /**
     * Gets the value of the categoryExtent property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryExtentType }
     *     
     */
    public CategoryExtentType getCategoryExtent() {
        return categoryExtent;
    }

    /**
     * Sets the value of the categoryExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryExtentType }
     *     
     */
    public void setCategoryExtent(CategoryExtentType value) {
        this.categoryExtent = value;
    }

    public boolean isSetCategoryExtent() {
        return (this.categoryExtent!= null);
    }

    /**
     * Gets the value of the quantityExtent property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityExtentType }
     *     
     */
    public QuantityExtentType getQuantityExtent() {
        return quantityExtent;
    }

    /**
     * Sets the value of the quantityExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityExtentType }
     *     
     */
    public void setQuantityExtent(QuantityExtentType value) {
        this.quantityExtent = value;
    }

    public boolean isSetQuantityExtent() {
        return (this.quantityExtent!= null);
    }

    /**
     * Gets the value of the countExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountExtent() {
        if (countExtent == null) {
            countExtent = new ArrayList<String>();
        }
        return this.countExtent;
    }

    public boolean isSetCountExtent() {
        return ((this.countExtent!= null)&&(!this.countExtent.isEmpty()));
    }

    public void unsetCountExtent() {
        this.countExtent = null;
    }

    /**
     * Gets the value of the compositeValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     *     
     */
    public JAXBElement<? extends CompositeValueType> getCompositeValue() {
        return compositeValue;
    }

    /**
     * Sets the value of the compositeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     *     
     */
    public void setCompositeValue(JAXBElement<? extends CompositeValueType> value) {
        this.compositeValue = value;
    }

    public boolean isSetCompositeValue() {
        return (this.compositeValue!= null);
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setObject(Element value) {
        this.object = value;
    }

    public boolean isSetObject() {
        return (this.object!= null);
    }

    /**
     * Gets the value of the null property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the null property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNull() {
        if (_null == null) {
            _null = new ArrayList<String>();
        }
        return this._null;
    }

    public boolean isSetNull() {
        return ((this._null!= null)&&(!this._null.isEmpty()));
    }

    public void unsetNull() {
        this._null = null;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
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
            Boolean theBoolean;
            theBoolean = this.isBoolean();
            strategy.appendField(locator, this, "_boolean", buffer, theBoolean);
        }
        {
            CodeType theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            MeasureType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            BigInteger theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount);
        }
        {
            List<String> theBooleanList;
            theBooleanList = (this.isSetBooleanList()?this.getBooleanList():null);
            strategy.appendField(locator, this, "booleanList", buffer, theBooleanList);
        }
        {
            CodeOrNullListType theCategoryList;
            theCategoryList = this.getCategoryList();
            strategy.appendField(locator, this, "categoryList", buffer, theCategoryList);
        }
        {
            MeasureOrNullListType theQuantityList;
            theQuantityList = this.getQuantityList();
            strategy.appendField(locator, this, "quantityList", buffer, theQuantityList);
        }
        {
            List<String> theCountList;
            theCountList = (this.isSetCountList()?this.getCountList():null);
            strategy.appendField(locator, this, "countList", buffer, theCountList);
        }
        {
            CategoryExtentType theCategoryExtent;
            theCategoryExtent = this.getCategoryExtent();
            strategy.appendField(locator, this, "categoryExtent", buffer, theCategoryExtent);
        }
        {
            QuantityExtentType theQuantityExtent;
            theQuantityExtent = this.getQuantityExtent();
            strategy.appendField(locator, this, "quantityExtent", buffer, theQuantityExtent);
        }
        {
            List<String> theCountExtent;
            theCountExtent = (this.isSetCountExtent()?this.getCountExtent():null);
            strategy.appendField(locator, this, "countExtent", buffer, theCountExtent);
        }
        {
            JAXBElement<? extends CompositeValueType> theCompositeValue;
            theCompositeValue = this.getCompositeValue();
            strategy.appendField(locator, this, "compositeValue", buffer, theCompositeValue);
        }
        {
            Element theObject;
            theObject = this.getObject();
            strategy.appendField(locator, this, "object", buffer, theObject);
        }
        {
            List<String> theNull;
            theNull = (this.isSetNull()?this.getNull():null);
            strategy.appendField(locator, this, "_null", buffer, theNull);
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theRemoteSchema);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theShow;
            theShow = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theShow);
        }
        {
            String theActuate;
            theActuate = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theActuate);
        }
        return buffer;
    }

    public void setBooleanList(List<String> value) {
        this.booleanList = null;
        List<String> draftl = this.getBooleanList();
        draftl.addAll(value);
    }

    public void setCountList(List<String> value) {
        this.countList = null;
        List<String> draftl = this.getCountList();
        draftl.addAll(value);
    }

    public void setCountExtent(List<String> value) {
        this.countExtent = null;
        List<String> draftl = this.getCountExtent();
        draftl.addAll(value);
    }

    public void setNull(List<String> value) {
        this._null = null;
        List<String> draftl = this.getNull();
        draftl.addAll(value);
    }

}
