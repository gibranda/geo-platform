//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 10:27:36 PM CEST 
//


package org.geosdi.geoplatform.xml.gml.v311;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * An element of a covariance matrix.
 * 
 * <p>Java class for CovarianceElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CovarianceElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}rowIndex"/>
 *         &lt;element ref="{http://www.opengis.net/gml}columnIndex"/>
 *         &lt;element ref="{http://www.opengis.net/gml}covariance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CovarianceElementType", propOrder = {
    "rowIndex",
    "columnIndex",
    "covariance"
})
public class CovarianceElementType
    implements ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rowIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger columnIndex;
    protected double covariance;

    /**
     * Gets the value of the rowIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowIndex() {
        return rowIndex;
    }

    /**
     * Sets the value of the rowIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowIndex(BigInteger value) {
        this.rowIndex = value;
    }

    public boolean isSetRowIndex() {
        return (this.rowIndex!= null);
    }

    /**
     * Gets the value of the columnIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnIndex(BigInteger value) {
        this.columnIndex = value;
    }

    public boolean isSetColumnIndex() {
        return (this.columnIndex!= null);
    }

    /**
     * Gets the value of the covariance property.
     * 
     */
    public double getCovariance() {
        return covariance;
    }

    /**
     * Sets the value of the covariance property.
     * 
     */
    public void setCovariance(double value) {
        this.covariance = value;
    }

    public boolean isSetCovariance() {
        return true;
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
            BigInteger theRowIndex;
            theRowIndex = this.getRowIndex();
            strategy.appendField(locator, this, "rowIndex", buffer, theRowIndex);
        }
        {
            BigInteger theColumnIndex;
            theColumnIndex = this.getColumnIndex();
            strategy.appendField(locator, this, "columnIndex", buffer, theColumnIndex);
        }
        {
            double theCovariance;
            theCovariance = (this.isSetCovariance()?this.getCovariance(): 0.0D);
            strategy.appendField(locator, this, "covariance", buffer, theCovariance);
        }
        return buffer;
    }

}
