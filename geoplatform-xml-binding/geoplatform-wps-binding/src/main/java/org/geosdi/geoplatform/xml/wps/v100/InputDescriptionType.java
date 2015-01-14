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
// Generated on: 2012.07.16 at 12:48:05 PM CEST 
//


package org.geosdi.geoplatform.xml.wps.v100;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Description of an input to a process. 
 * 
 * In this use, the DescriptionType shall describe this process input. 
 * 
 * <p>Java class for InputDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wps/1.0.0}DescriptionType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/wps/1.0.0}InputFormChoice"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minOccurs" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="maxOccurs" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputDescriptionType", propOrder = {
    "complexData",
    "literalData",
    "boundingBoxData"
})
public class InputDescriptionType
    extends DescriptionType
    implements ToString
{

    @XmlElement(name = "ComplexData", namespace = "")
    protected SupportedComplexDataInputType complexData;
    @XmlElement(name = "LiteralData", namespace = "")
    protected LiteralInputType literalData;
    @XmlElement(name = "BoundingBoxData", namespace = "")
    protected SupportedCRSsType boundingBoxData;
    @XmlAttribute(name = "minOccurs", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurs;
    @XmlAttribute(name = "maxOccurs", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxOccurs;

    /**
     * Gets the value of the complexData property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedComplexDataInputType }
     *     
     */
    public SupportedComplexDataInputType getComplexData() {
        return complexData;
    }

    /**
     * Sets the value of the complexData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedComplexDataInputType }
     *     
     */
    public void setComplexData(SupportedComplexDataInputType value) {
        this.complexData = value;
    }

    public boolean isSetComplexData() {
        return (this.complexData!= null);
    }

    /**
     * Gets the value of the literalData property.
     * 
     * @return
     *     possible object is
     *     {@link LiteralInputType }
     *     
     */
    public LiteralInputType getLiteralData() {
        return literalData;
    }

    /**
     * Sets the value of the literalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiteralInputType }
     *     
     */
    public void setLiteralData(LiteralInputType value) {
        this.literalData = value;
    }

    public boolean isSetLiteralData() {
        return (this.literalData!= null);
    }

    /**
     * Gets the value of the boundingBoxData property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCRSsType }
     *     
     */
    public SupportedCRSsType getBoundingBoxData() {
        return boundingBoxData;
    }

    /**
     * Sets the value of the boundingBoxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCRSsType }
     *     
     */
    public void setBoundingBoxData(SupportedCRSsType value) {
        this.boundingBoxData = value;
    }

    public boolean isSetBoundingBoxData() {
        return (this.boundingBoxData!= null);
    }

    /**
     * Gets the value of the minOccurs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccurs() {
        return minOccurs;
    }

    /**
     * Sets the value of the minOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccurs(BigInteger value) {
        this.minOccurs = value;
    }

    public boolean isSetMinOccurs() {
        return (this.minOccurs!= null);
    }

    /**
     * Gets the value of the maxOccurs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccurs() {
        return maxOccurs;
    }

    /**
     * Sets the value of the maxOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccurs(BigInteger value) {
        this.maxOccurs = value;
    }

    public boolean isSetMaxOccurs() {
        return (this.maxOccurs!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            SupportedComplexDataInputType theComplexData;
            theComplexData = this.getComplexData();
            strategy.appendField(locator, this, "complexData", buffer, theComplexData);
        }
        {
            LiteralInputType theLiteralData;
            theLiteralData = this.getLiteralData();
            strategy.appendField(locator, this, "literalData", buffer, theLiteralData);
        }
        {
            SupportedCRSsType theBoundingBoxData;
            theBoundingBoxData = this.getBoundingBoxData();
            strategy.appendField(locator, this, "boundingBoxData", buffer, theBoundingBoxData);
        }
        {
            BigInteger theMinOccurs;
            theMinOccurs = this.getMinOccurs();
            strategy.appendField(locator, this, "minOccurs", buffer, theMinOccurs);
        }
        {
            BigInteger theMaxOccurs;
            theMaxOccurs = this.getMaxOccurs();
            strategy.appendField(locator, this, "maxOccurs", buffer, theMaxOccurs);
        }
        return buffer;
    }

}
