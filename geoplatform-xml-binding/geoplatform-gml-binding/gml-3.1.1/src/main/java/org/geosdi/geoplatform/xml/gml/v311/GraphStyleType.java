//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 10:27:36 PM CEST 
//


package org.geosdi.geoplatform.xml.gml.v311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * [complexType of] The style descriptor for a graph consisting of a number of features. Describes graph-specific style attributes.
 * 
 * <p>Java class for GraphStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;element name="planar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="grid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="graphType" type="{http://www.opengis.net/gml}GraphTypeType" minOccurs="0"/>
 *         &lt;element name="drawingType" type="{http://www.opengis.net/gml}DrawingTypeType" minOccurs="0"/>
 *         &lt;element name="lineType" type="{http://www.opengis.net/gml}LineTypeType" minOccurs="0"/>
 *         &lt;element name="aestheticCriteria" type="{http://www.opengis.net/gml}AesheticCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphStyleType", propOrder = {
    "planar",
    "directed",
    "grid",
    "minDistance",
    "minAngle",
    "graphType",
    "drawingType",
    "lineType",
    "aestheticCriteria"
})
public class GraphStyleType
    extends BaseStyleDescriptorType
    implements ToString
{

    protected Boolean planar;
    protected Boolean directed;
    protected Boolean grid;
    protected Double minDistance;
    protected Double minAngle;
    protected GraphTypeType graphType;
    protected DrawingTypeType drawingType;
    protected LineTypeType lineType;
    protected List<AesheticCriteriaType> aestheticCriteria;

    /**
     * Gets the value of the planar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanar() {
        return planar;
    }

    /**
     * Sets the value of the planar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanar(Boolean value) {
        this.planar = value;
    }

    public boolean isSetPlanar() {
        return (this.planar!= null);
    }

    /**
     * Gets the value of the directed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirected() {
        return directed;
    }

    /**
     * Sets the value of the directed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirected(Boolean value) {
        this.directed = value;
    }

    public boolean isSetDirected() {
        return (this.directed!= null);
    }

    /**
     * Gets the value of the grid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrid() {
        return grid;
    }

    /**
     * Sets the value of the grid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrid(Boolean value) {
        this.grid = value;
    }

    public boolean isSetGrid() {
        return (this.grid!= null);
    }

    /**
     * Gets the value of the minDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDistance() {
        return minDistance;
    }

    /**
     * Sets the value of the minDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDistance(Double value) {
        this.minDistance = value;
    }

    public boolean isSetMinDistance() {
        return (this.minDistance!= null);
    }

    /**
     * Gets the value of the minAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAngle() {
        return minAngle;
    }

    /**
     * Sets the value of the minAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAngle(Double value) {
        this.minAngle = value;
    }

    public boolean isSetMinAngle() {
        return (this.minAngle!= null);
    }

    /**
     * Gets the value of the graphType property.
     * 
     * @return
     *     possible object is
     *     {@link GraphTypeType }
     *     
     */
    public GraphTypeType getGraphType() {
        return graphType;
    }

    /**
     * Sets the value of the graphType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphTypeType }
     *     
     */
    public void setGraphType(GraphTypeType value) {
        this.graphType = value;
    }

    public boolean isSetGraphType() {
        return (this.graphType!= null);
    }

    /**
     * Gets the value of the drawingType property.
     * 
     * @return
     *     possible object is
     *     {@link DrawingTypeType }
     *     
     */
    public DrawingTypeType getDrawingType() {
        return drawingType;
    }

    /**
     * Sets the value of the drawingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawingTypeType }
     *     
     */
    public void setDrawingType(DrawingTypeType value) {
        this.drawingType = value;
    }

    public boolean isSetDrawingType() {
        return (this.drawingType!= null);
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeType }
     *     
     */
    public LineTypeType getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeType }
     *     
     */
    public void setLineType(LineTypeType value) {
        this.lineType = value;
    }

    public boolean isSetLineType() {
        return (this.lineType!= null);
    }

    /**
     * Gets the value of the aestheticCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aestheticCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAestheticCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AesheticCriteriaType }
     * 
     * 
     */
    public List<AesheticCriteriaType> getAestheticCriteria() {
        if (aestheticCriteria == null) {
            aestheticCriteria = new ArrayList<AesheticCriteriaType>();
        }
        return this.aestheticCriteria;
    }

    public boolean isSetAestheticCriteria() {
        return ((this.aestheticCriteria!= null)&&(!this.aestheticCriteria.isEmpty()));
    }

    public void unsetAestheticCriteria() {
        this.aestheticCriteria = null;
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
            Boolean thePlanar;
            thePlanar = this.isPlanar();
            strategy.appendField(locator, this, "planar", buffer, thePlanar);
        }
        {
            Boolean theDirected;
            theDirected = this.isDirected();
            strategy.appendField(locator, this, "directed", buffer, theDirected);
        }
        {
            Boolean theGrid;
            theGrid = this.isGrid();
            strategy.appendField(locator, this, "grid", buffer, theGrid);
        }
        {
            Double theMinDistance;
            theMinDistance = this.getMinDistance();
            strategy.appendField(locator, this, "minDistance", buffer, theMinDistance);
        }
        {
            Double theMinAngle;
            theMinAngle = this.getMinAngle();
            strategy.appendField(locator, this, "minAngle", buffer, theMinAngle);
        }
        {
            GraphTypeType theGraphType;
            theGraphType = this.getGraphType();
            strategy.appendField(locator, this, "graphType", buffer, theGraphType);
        }
        {
            DrawingTypeType theDrawingType;
            theDrawingType = this.getDrawingType();
            strategy.appendField(locator, this, "drawingType", buffer, theDrawingType);
        }
        {
            LineTypeType theLineType;
            theLineType = this.getLineType();
            strategy.appendField(locator, this, "lineType", buffer, theLineType);
        }
        {
            List<AesheticCriteriaType> theAestheticCriteria;
            theAestheticCriteria = (this.isSetAestheticCriteria()?this.getAestheticCriteria():null);
            strategy.appendField(locator, this, "aestheticCriteria", buffer, theAestheticCriteria);
        }
        return buffer;
    }

    public void setAestheticCriteria(List<AesheticCriteriaType> value) {
        this.aestheticCriteria = null;
        List<AesheticCriteriaType> draftl = this.getAestheticCriteria();
        draftl.addAll(value);
    }

}
