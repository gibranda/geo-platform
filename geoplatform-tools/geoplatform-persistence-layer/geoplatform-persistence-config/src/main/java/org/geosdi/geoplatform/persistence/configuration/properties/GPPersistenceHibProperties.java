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
package org.geosdi.geoplatform.persistence.configuration.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@Component(value = "gpHibernateProperties")
public class GPPersistenceHibProperties {

    @Value("persistence{db_databasePlatform:@null}")
    private String hibDatabasePlatform;
    @Value("persistence{db_showSql:@null}")
    private Boolean hibShowSql;
    @Value("persistence{db_generateDdl:@null}")
    private Boolean hibGenerateDdl;
    @Value("persistence{db_hbm2ddlAuto:@null}")
    private String hibHbm2ddlAuto;
    @Value("persistence{db_generateStatistics:@null}")
    private Boolean hibGenerateStatistics;
    @Value("persistence{db_defaultSchema:@null}")
    private String hibDefaultSchema;

    /**
     * @return the hibDatabasePlatform
     */
    public String getHibDatabasePlatform() {
        return hibDatabasePlatform;
    }

    /**
     * @return the hibShowSql
     */
    public boolean isHibShowSql() {
        return this.hibShowSql = ((hibShowSql == null) ? false : hibShowSql);
    }

    /**
     * @return the hibGenerateDdl
     */
    public boolean isHibGenerateDdl() {
        return this.hibGenerateDdl = ((hibGenerateDdl == null) ? false
                : hibGenerateDdl);
    }

    /**
     * @return the hibHbm2ddlAuto
     */
    public String getHibHbm2ddlAuto() {
        return this.hibHbm2ddlAuto = ((hibHbm2ddlAuto != null)
                ? this.hibHbm2ddlAuto : "validate");
    }

    /**
     * @return the hibGenerateStatistics
     */
    public boolean isHibGenerateStatistics() {
        return this.hibGenerateStatistics = ((hibGenerateStatistics == null)
                ? false : hibGenerateStatistics);
    }

    /**
     * @return the hibDefaultSchema
     */
    public String getHibDefaultSchema() {
        return hibDefaultSchema;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { " + "hibDatabasePlatform = "
                + hibDatabasePlatform + ", hibShowSql = " + hibShowSql
                + ", hibGenerateDdl = " + hibGenerateDdl
                + ", hibHbm2ddlAuto = " + hibHbm2ddlAuto
                + ", hibGenerateStatistics = " + hibGenerateStatistics
                + ", hibDefaultSchema = " + hibDefaultSchema + '}';
    }

}
