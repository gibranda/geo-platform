//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java per DMSAngleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DMSAngleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}degrees"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/gml}decimalMinutes"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.opengis.net/gml}minutes"/>
 *             &lt;element ref="{http://www.opengis.net/gml}seconds" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMSAngleType", propOrder = {
    "degrees",
    "decimalMinutes",
    "minutes",
    "seconds"
})
public class DMSAngleType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected DegreesType degrees;
    protected BigDecimal decimalMinutes;
    protected Integer minutes;
    protected BigDecimal seconds;

    /**
     * Recupera il valore della proprietà degrees.
     * 
     * @return
     *     possible object is
     *     {@link DegreesType }
     *     
     */
    public DegreesType getDegrees() {
        return degrees;
    }

    /**
     * Imposta il valore della proprietà degrees.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreesType }
     *     
     */
    public void setDegrees(DegreesType value) {
        this.degrees = value;
    }

    public boolean isSetDegrees() {
        return (this.degrees!= null);
    }

    /**
     * Recupera il valore della proprietà decimalMinutes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalMinutes() {
        return decimalMinutes;
    }

    /**
     * Imposta il valore della proprietà decimalMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalMinutes(BigDecimal value) {
        this.decimalMinutes = value;
    }

    public boolean isSetDecimalMinutes() {
        return (this.decimalMinutes!= null);
    }

    /**
     * Recupera il valore della proprietà minutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Imposta il valore della proprietà minutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    public boolean isSetMinutes() {
        return (this.minutes!= null);
    }

    /**
     * Recupera il valore della proprietà seconds.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeconds() {
        return seconds;
    }

    /**
     * Imposta il valore della proprietà seconds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeconds(BigDecimal value) {
        this.seconds = value;
    }

    public boolean isSetSeconds() {
        return (this.seconds!= null);
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
            DegreesType theDegrees;
            theDegrees = this.getDegrees();
            strategy.appendField(locator, this, "degrees", buffer, theDegrees);
        }
        {
            BigDecimal theDecimalMinutes;
            theDecimalMinutes = this.getDecimalMinutes();
            strategy.appendField(locator, this, "decimalMinutes", buffer, theDecimalMinutes);
        }
        {
            Integer theMinutes;
            theMinutes = this.getMinutes();
            strategy.appendField(locator, this, "minutes", buffer, theMinutes);
        }
        {
            BigDecimal theSeconds;
            theSeconds = this.getSeconds();
            strategy.appendField(locator, this, "seconds", buffer, theSeconds);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DMSAngleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DMSAngleType that = ((DMSAngleType) object);
        {
            DegreesType lhsDegrees;
            lhsDegrees = this.getDegrees();
            DegreesType rhsDegrees;
            rhsDegrees = that.getDegrees();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "degrees", lhsDegrees), LocatorUtils.property(thatLocator, "degrees", rhsDegrees), lhsDegrees, rhsDegrees)) {
                return false;
            }
        }
        {
            BigDecimal lhsDecimalMinutes;
            lhsDecimalMinutes = this.getDecimalMinutes();
            BigDecimal rhsDecimalMinutes;
            rhsDecimalMinutes = that.getDecimalMinutes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decimalMinutes", lhsDecimalMinutes), LocatorUtils.property(thatLocator, "decimalMinutes", rhsDecimalMinutes), lhsDecimalMinutes, rhsDecimalMinutes)) {
                return false;
            }
        }
        {
            Integer lhsMinutes;
            lhsMinutes = this.getMinutes();
            Integer rhsMinutes;
            rhsMinutes = that.getMinutes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minutes", lhsMinutes), LocatorUtils.property(thatLocator, "minutes", rhsMinutes), lhsMinutes, rhsMinutes)) {
                return false;
            }
        }
        {
            BigDecimal lhsSeconds;
            lhsSeconds = this.getSeconds();
            BigDecimal rhsSeconds;
            rhsSeconds = that.getSeconds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seconds", lhsSeconds), LocatorUtils.property(thatLocator, "seconds", rhsSeconds), lhsSeconds, rhsSeconds)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            DegreesType theDegrees;
            theDegrees = this.getDegrees();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "degrees", theDegrees), currentHashCode, theDegrees);
        }
        {
            BigDecimal theDecimalMinutes;
            theDecimalMinutes = this.getDecimalMinutes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decimalMinutes", theDecimalMinutes), currentHashCode, theDecimalMinutes);
        }
        {
            Integer theMinutes;
            theMinutes = this.getMinutes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minutes", theMinutes), currentHashCode, theMinutes);
        }
        {
            BigDecimal theSeconds;
            theSeconds = this.getSeconds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seconds", theSeconds), currentHashCode, theSeconds);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof DMSAngleType) {
            final DMSAngleType copy = ((DMSAngleType) draftCopy);
            if (this.isSetDegrees()) {
                DegreesType sourceDegrees;
                sourceDegrees = this.getDegrees();
                DegreesType copyDegrees = ((DegreesType) strategy.copy(LocatorUtils.property(locator, "degrees", sourceDegrees), sourceDegrees));
                copy.setDegrees(copyDegrees);
            } else {
                copy.degrees = null;
            }
            if (this.isSetDecimalMinutes()) {
                BigDecimal sourceDecimalMinutes;
                sourceDecimalMinutes = this.getDecimalMinutes();
                BigDecimal copyDecimalMinutes = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "decimalMinutes", sourceDecimalMinutes), sourceDecimalMinutes));
                copy.setDecimalMinutes(copyDecimalMinutes);
            } else {
                copy.decimalMinutes = null;
            }
            if (this.isSetMinutes()) {
                Integer sourceMinutes;
                sourceMinutes = this.getMinutes();
                Integer copyMinutes = ((Integer) strategy.copy(LocatorUtils.property(locator, "minutes", sourceMinutes), sourceMinutes));
                copy.setMinutes(copyMinutes);
            } else {
                copy.minutes = null;
            }
            if (this.isSetSeconds()) {
                BigDecimal sourceSeconds;
                sourceSeconds = this.getSeconds();
                BigDecimal copySeconds = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "seconds", sourceSeconds), sourceSeconds));
                copy.setSeconds(copySeconds);
            } else {
                copy.seconds = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DMSAngleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof DMSAngleType) {
            final DMSAngleType target = this;
            final DMSAngleType leftObject = ((DMSAngleType) left);
            final DMSAngleType rightObject = ((DMSAngleType) right);
            {
                DegreesType lhsDegrees;
                lhsDegrees = leftObject.getDegrees();
                DegreesType rhsDegrees;
                rhsDegrees = rightObject.getDegrees();
                target.setDegrees(((DegreesType) strategy.merge(LocatorUtils.property(leftLocator, "degrees", lhsDegrees), LocatorUtils.property(rightLocator, "degrees", rhsDegrees), lhsDegrees, rhsDegrees)));
            }
            {
                BigDecimal lhsDecimalMinutes;
                lhsDecimalMinutes = leftObject.getDecimalMinutes();
                BigDecimal rhsDecimalMinutes;
                rhsDecimalMinutes = rightObject.getDecimalMinutes();
                target.setDecimalMinutes(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "decimalMinutes", lhsDecimalMinutes), LocatorUtils.property(rightLocator, "decimalMinutes", rhsDecimalMinutes), lhsDecimalMinutes, rhsDecimalMinutes)));
            }
            {
                Integer lhsMinutes;
                lhsMinutes = leftObject.getMinutes();
                Integer rhsMinutes;
                rhsMinutes = rightObject.getMinutes();
                target.setMinutes(((Integer) strategy.merge(LocatorUtils.property(leftLocator, "minutes", lhsMinutes), LocatorUtils.property(rightLocator, "minutes", rhsMinutes), lhsMinutes, rhsMinutes)));
            }
            {
                BigDecimal lhsSeconds;
                lhsSeconds = leftObject.getSeconds();
                BigDecimal rhsSeconds;
                rhsSeconds = rightObject.getSeconds();
                target.setSeconds(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "seconds", lhsSeconds), LocatorUtils.property(rightLocator, "seconds", rhsSeconds), lhsSeconds, rhsSeconds)));
            }
        }
    }

    public DMSAngleType withDegrees(DegreesType value) {
        setDegrees(value);
        return this;
    }

    public DMSAngleType withDecimalMinutes(BigDecimal value) {
        setDecimalMinutes(value);
        return this;
    }

    public DMSAngleType withMinutes(Integer value) {
        setMinutes(value);
        return this;
    }

    public DMSAngleType withSeconds(BigDecimal value) {
        setSeconds(value);
        return this;
    }

}