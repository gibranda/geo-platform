//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.16 at 12:48:05 PM CEST 
//


package org.geosdi.geoplatform.xml.wps.v100;

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
 * Identifies valid combinations of Format, Encoding, and Schema supported for this input or output. The process shall expect input in or produce output in this combination of Format/Encoding/Schema unless the Execute request specifies otherwise.. 
 * 
 * <p>Java class for ComplexDataCombinationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexDataCombinationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://www.opengis.net/wps/1.0.0}ComplexDataDescriptionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexDataCombinationsType", propOrder = {
    "format"
})
public class ComplexDataCombinationsType
    implements ToString
{

    @XmlElement(name = "Format", namespace = "", required = true)
    protected List<ComplexDataDescriptionType> format;

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexDataDescriptionType }
     * 
     * 
     */
    public List<ComplexDataDescriptionType> getFormat() {
        if (format == null) {
            format = new ArrayList<ComplexDataDescriptionType>();
        }
        return this.format;
    }

    public boolean isSetFormat() {
        return ((this.format!= null)&&(!this.format.isEmpty()));
    }

    public void unsetFormat() {
        this.format = null;
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
            List<ComplexDataDescriptionType> theFormat;
            theFormat = (this.isSetFormat()?this.getFormat():null);
            strategy.appendField(locator, this, "format", buffer, theFormat);
        }
        return buffer;
    }

    public void setFormat(List<ComplexDataDescriptionType> value) {
        this.format = null;
        List<ComplexDataDescriptionType> draftl = this.getFormat();
        draftl.addAll(value);
    }

}