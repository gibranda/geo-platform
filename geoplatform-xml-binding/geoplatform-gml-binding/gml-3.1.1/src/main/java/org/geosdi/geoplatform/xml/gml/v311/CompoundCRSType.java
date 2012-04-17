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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A coordinate reference system describing the position of points through two or more independent coordinate reference systems. 
 * 
 * <p>Java class for CompoundCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}includesCRS" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundCRSType", propOrder = {
    "includesCRS"
})
public class CompoundCRSType
    extends AbstractReferenceSystemType
    implements ToString
{

    @XmlElement(required = true)
    protected List<CoordinateReferenceSystemRefType> includesCRS;

    /**
     * Ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. Gets the value of the includesCRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesCRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesCRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateReferenceSystemRefType }
     * 
     * 
     */
    public List<CoordinateReferenceSystemRefType> getIncludesCRS() {
        if (includesCRS == null) {
            includesCRS = new ArrayList<CoordinateReferenceSystemRefType>();
        }
        return this.includesCRS;
    }

    public boolean isSetIncludesCRS() {
        return ((this.includesCRS!= null)&&(!this.includesCRS.isEmpty()));
    }

    public void unsetIncludesCRS() {
        this.includesCRS = null;
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
            List<CoordinateReferenceSystemRefType> theIncludesCRS;
            theIncludesCRS = (this.isSetIncludesCRS()?this.getIncludesCRS():null);
            strategy.appendField(locator, this, "includesCRS", buffer, theIncludesCRS);
        }
        return buffer;
    }

    public void setIncludesCRS(List<CoordinateReferenceSystemRefType> value) {
        this.includesCRS = null;
        List<CoordinateReferenceSystemRefType> draftl = this.getIncludesCRS();
        draftl.addAll(value);
    }

}
