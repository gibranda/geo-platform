/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2017 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.support.wfs.feature.reader;

import com.vividsolutions.jts.io.WKTWriter;
import org.geosdi.geoplatform.connector.wfs.response.FeatureCollectionDTO;
import org.geosdi.geoplatform.connector.wfs.response.FeatureDTO;
import org.geosdi.geoplatform.connector.wfs.response.GeometryAttributeDTO;
import org.geosdi.geoplatform.connector.wfs.response.LayerSchemaDTO;
import org.geosdi.geoplatform.connector.wfs.response.collection.FeatureAttributesMap;
import org.geosdi.geoplatform.gml.api.AbstractGeometry;
import org.geosdi.geoplatform.gml.api.parser.base.geometry.sextante.GMLBaseSextanteParser;
import org.geosdi.geoplatform.gml.api.parser.base.parameter.GMLBaseParametersRepo;
import org.geosdi.geoplatform.gml.api.parser.exception.ParserException;
import org.geosdi.geoplatform.jaxb.GPJAXBContextBuilder;
import org.geosdi.geoplatform.stax.reader.AbstractStaxStreamReader;
import org.geosdi.geoplatform.xml.gml.v311.AbstractGeometryType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Giuseppe La Scaleia - <giuseppe.lascaleia@geosdi.org>
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public class WFSGetFeatureStaxReader extends AbstractStaxStreamReader<FeatureCollectionDTO> {

    static {
        jaxbContextBuilder = GPJAXBContextBuilder.newInstance();
    }

    //
    private static final Logger logger = LoggerFactory.getLogger(WFSGetFeatureStaxReader.class);
    //
    private static final GPJAXBContextBuilder jaxbContextBuilder;
    //
    private final LayerSchemaDTO layerSchema;
    //
    private final GMLBaseSextanteParser sextanteParser = GMLBaseParametersRepo.getDefaultSextanteParser();

    public WFSGetFeatureStaxReader(LayerSchemaDTO layerSchema) {
        this.layerSchema = layerSchema;
    }

    @Override
    public FeatureCollectionDTO read(Object o) throws Exception {
        super.acquireReader(o);

        if (layerSchema == null) {
            throw new IllegalStateException("LayerSchema must not be null.");
        }

        String typeName = layerSchema.getTypeName();
        if ((typeName == null) || !(typeName.contains(":"))) {
            throw new IllegalStateException("Type Name must not be null or must be WORKSPACE:LAYER.");
        }
        String prefix = typeName.substring(0, typeName.indexOf(":"));
        String name = typeName.substring(typeName.indexOf(":") + 1);
        logger.debug("\n@@@@@@ Read feature {}:{} @@@@@@", prefix, name);

        GeometryAttributeDTO geometryAtt = layerSchema.getGeometry();
        String geometryName = geometryAtt.getName();
        if ((geometryAtt == null) || (geometryName == null) || (geometryName.isEmpty())) {
            throw new IllegalStateException("The Geometry Attribute must not be null or " +
                    "Geometry Name must not be null or an Empty String.");
        }

        List<String> attributeNames = layerSchema.getAttributeNames();

        FeatureCollectionDTO fc = new FeatureCollectionDTO();
        FeatureDTO feature = null;
        while (reader.hasNext()) {
            int evenType = reader.getEventType();
            if (evenType == XMLEvent.START_ELEMENT) {
                if (super.isTagName("wfs", "FeatureCollection")) {
                    this.readInfo(fc);
                } else if (super.isTagName(prefix, name)) {
                    feature = this.readFID();
                    fc.addFeature(feature);
                } else if (super.isTagName(prefix, geometryName)) {
                    String geometryWKT = this.readGeometry();
                    feature.setGeometry(geometryWKT);

                    super.goToEndTag(geometryName);

                    FeatureAttributesMap attributes = this.readAttributes(name, attributeNames, Boolean.TRUE);
                    feature.setAttributes(attributes);
                } else if ((attributeNames != null) && (attributeNames.contains(reader.getLocalName()))) {
                    FeatureAttributesMap attributes = this.readAttributes(name, attributeNames, Boolean.FALSE);
                    feature.setAttributes(attributes);
                }
            }
            reader.next();
        }

        return fc;
    }

    private FeatureCollectionDTO readInfo(FeatureCollectionDTO fc) {
        String numberOfFeatures = reader.getAttributeValue(null, "numberOfFeatures");
        fc.setNumberOfFeatures(Integer.parseInt(numberOfFeatures));

        String timeStamp = reader.getAttributeValue(null, "timeStamp");
        fc.setTimeStamp(DatatypeConverter.parseDate(timeStamp).getTime());

        logger.debug("\n@@@ Read info @@@\nfeature: {}\ntime: {}", numberOfFeatures, timeStamp);

        return fc;
    }

    private FeatureDTO readFID() {
        String featureID = reader.getAttributeValue("http://www.opengis.net/gml", "id");
        logger.debug("\n\n@@@ FEATURE_ID: {} @@@", featureID);

        FeatureDTO feature = new FeatureDTO(featureID);
        return feature;
    }

    private String readGeometry() throws XMLStreamException {
        String geometryWKT = null;

        int eventType = reader.nextTag();
        if (eventType == XMLEvent.START_ELEMENT) {
            AbstractGeometry geometry = jaxbContextBuilder.unmarshal(reader, AbstractGeometryType.class);
            WKTWriter wktWriter = new WKTWriter(2);
            logger.trace("Geometry @@@@@@@@@@@@@@ {}", geometry);
            wktWriter.setFormatted(true);
            try {
                geometryWKT = wktWriter.writeFormatted(this.sextanteParser.parseGeometry(geometry));

                logger.trace("WKT GEOMETRY @@@@@@@@@@@@@@@@ " + geometryWKT);
            } catch (ParserException ex) {
                logger.error("Parse Exception : " + ex);
            }
        }
        return geometryWKT;
    }

    private FeatureAttributesMap readAttributes(String featureName, List<String> attributeNames, Boolean nextTag)
            throws XMLStreamException {
        if (attributeNames == null) {
            return null;
        }

        Map<String, String> map = new HashMap<String, String>(attributeNames.size());
        for (String name : attributeNames) {
            map.put(name, null);
        }
        FeatureAttributesMap fMap = new FeatureAttributesMap();
        fMap.setAttributesMap(map);

        int eventType = ((nextTag) ? reader.nextTag() : reader.getEventType());
        while (reader.hasNext()) {
            if (eventType == XMLEvent.END_ELEMENT) {
                String localName = reader.getLocalName();
                if (localName.equals(featureName)) {
                    break;
                }
            }

            if (eventType == XMLEvent.START_ELEMENT) {
                String localName = reader.getLocalName();
                logger.debug("################LOCAL_NAME : {}\n", localName);

                eventType = reader.next();
                if (eventType == XMLEvent.CHARACTERS) {
                    String attributeValue = reader.getText();
                    map.put(localName, attributeValue);
                    logger.debug("\n@@@ Attribute '{}': {} @@@", localName, attributeValue);

                    super.goToEndTag(localName);
                }
            }
            eventType = reader.nextTag();
        }

        return fMap;
    }

}
