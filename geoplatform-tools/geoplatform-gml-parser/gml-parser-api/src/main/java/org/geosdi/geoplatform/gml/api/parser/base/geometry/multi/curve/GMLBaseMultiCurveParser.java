/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2012 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.gml.api.parser.base.geometry.multi.curve;

import com.google.common.base.Preconditions;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.MultiLineString;
import java.util.ArrayList;
import java.util.List;
import org.geosdi.geoplatform.gml.api.AbstractCurve;
import org.geosdi.geoplatform.gml.api.CurveArrayProperty;
import org.geosdi.geoplatform.gml.api.CurveProperty;
import org.geosdi.geoplatform.gml.api.MultiCurve;
import org.geosdi.geoplatform.gml.api.MultiCurveProperty;
import org.geosdi.geoplatform.gml.api.parser.base.AbstractGMLBaseParser;
import org.geosdi.geoplatform.gml.api.parser.base.AbstractGMLBaseSRSParser;
import org.geosdi.geoplatform.gml.api.parser.base.geometry.multi.curve.responsibility.LineStringHandler;
import org.geosdi.geoplatform.gml.api.parser.base.geometry.multi.curve.responsibility.MultiCurveHandler;
import org.geosdi.geoplatform.gml.api.parser.exception.ParserException;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class GMLBaseMultiCurveParser extends AbstractGMLBaseParser<MultiCurve, MultiCurveProperty, MultiLineString> {

    private MultiCurveHandler lineStringHandler = new LineStringHandler();
    private MultiCurveBuilder multiCurveMember = new MultiCurveMember();
    private MultiCurveBuilder multiCurveMembers = new MultiCurveMembers();

    public GMLBaseMultiCurveParser(GeometryFactory theGeometryFactory,
            AbstractGMLBaseSRSParser theSrsParser) {
        super(theGeometryFactory, theSrsParser);
    }

    @Override
    protected MultiLineString canParseGeometry(MultiCurve gmlGeometry) throws ParserException {
        List<LineString> lines = new ArrayList<LineString>();

        this.multiCurveMember.buildMember(lines, gmlGeometry);
        this.multiCurveMembers.buildMember(lines, gmlGeometry);

        Preconditions.checkArgument(!lines.isEmpty(), "CurveMember and "
                + "CurveMembers can't be both null.");

        return geometryFactory.createMultiLineString(lines.toArray(
                new LineString[lines.size()]));
    }

    @Override
    public MultiLineString parseGeometry(MultiCurveProperty propertyType) throws ParserException {
        Preconditions.checkNotNull(propertyType, "The MultiCurveProperty "
                + "must not be null.");

        if (propertyType.isSetMultiCurve()) {
            return super.parseGeometry(propertyType.getMultiCurve());
        }

        throw new ParserException("There is no MultiCurve Geometry to Parse.");
    }

    protected interface MultiCurveBuilder {

        void buildMember(List<LineString> lines,
                MultiCurve gmlGeometry) throws ParserException;
    }

    protected class MultiCurveMember implements MultiCurveBuilder {

        @Override
        public void buildMember(List<LineString> lines,
                MultiCurve gmlGeometry) throws ParserException {

            if (gmlGeometry.isSetCurveMember()) {
                List<? extends CurveProperty> curveProperties = gmlGeometry.getCurveMember();
                for (CurveProperty curveProperty : curveProperties) {
                    lineStringHandler.parseGeometry(lines,
                            curveProperty.getAbstractCurve());
                }
            }
        }
    }

    protected class MultiCurveMembers implements MultiCurveBuilder {

        @Override
        public void buildMember(List<LineString> lines,
                MultiCurve gmlGeometry) throws ParserException {

            if (gmlGeometry.isSetCurveMembers()) {
                CurveArrayProperty curveArrayProperty = gmlGeometry.getCurveMembers();
                List<? extends AbstractCurve> abstractCurves = curveArrayProperty.getAbstractCurve();
                for (AbstractCurve abstractCurve : abstractCurves) {
                    lineStringHandler.parseGeometry(lines, abstractCurve);
                }
            }
        }
    }
}