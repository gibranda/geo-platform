//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 10:36:42 AM CEST 
//


package org.geosdi.geoplatform.xml.filter.v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for Spatial_CapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spatial_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeometryOperands" type="{http://www.opengis.net/ogc}GeometryOperandsType"/>
 *         &lt;element name="SpatialOperators" type="{http://www.opengis.net/ogc}SpatialOperatorsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spatial_CapabilitiesType", propOrder = {
    "geometryOperands",
    "spatialOperators"
})
public class SpatialCapabilitiesType
    implements ToString
{

    @XmlElement(name = "GeometryOperands", required = true)
    protected GeometryOperandsType geometryOperands;
    @XmlElement(name = "SpatialOperators", required = true)
    protected SpatialOperatorsType spatialOperators;

    /**
     * Gets the value of the geometryOperands property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryOperandsType }
     *     
     */
    public GeometryOperandsType getGeometryOperands() {
        return geometryOperands;
    }

    /**
     * Sets the value of the geometryOperands property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryOperandsType }
     *     
     */
    public void setGeometryOperands(GeometryOperandsType value) {
        this.geometryOperands = value;
    }

    public boolean isSetGeometryOperands() {
        return (this.geometryOperands!= null);
    }

    /**
     * Gets the value of the spatialOperators property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialOperatorsType }
     *     
     */
    public SpatialOperatorsType getSpatialOperators() {
        return spatialOperators;
    }

    /**
     * Sets the value of the spatialOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialOperatorsType }
     *     
     */
    public void setSpatialOperators(SpatialOperatorsType value) {
        this.spatialOperators = value;
    }

    public boolean isSetSpatialOperators() {
        return (this.spatialOperators!= null);
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
            GeometryOperandsType theGeometryOperands;
            theGeometryOperands = this.getGeometryOperands();
            strategy.appendField(locator, this, "geometryOperands", buffer, theGeometryOperands);
        }
        {
            SpatialOperatorsType theSpatialOperators;
            theSpatialOperators = this.getSpatialOperators();
            strategy.appendField(locator, this, "spatialOperators", buffer, theSpatialOperators);
        }
        return buffer;
    }

}