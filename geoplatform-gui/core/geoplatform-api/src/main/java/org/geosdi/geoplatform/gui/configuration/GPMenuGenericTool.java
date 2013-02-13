/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2013 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.gui.configuration;

import com.extjs.gxt.ui.client.widget.menu.Menu;
import org.geosdi.geoplatform.gui.global.security.GPAccountLogged;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 *
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public abstract class GPMenuGenericTool<M extends GeoPlatformMenuCreator>
        extends GenericTool implements GPMenuItem {

    private static final long serialVersionUID = -6366879645618646403L;

    /**
     * Check the permission of the user logged and call the method for creation.
     * If the permission was not found the tool will not be created.
     *
     * @param menuCreator
     * @param menu
     */
    public void buildTool(M menuCreator,
            final Menu menu) {
        if (secure) {
            checkSecurity(menuCreator, menu);
        } else {
            byPassSecurity(menuCreator, menu);
        }
    }

    /**
     * Check the permission of the user logged and call the method for creation.
     * If the permission was not found the tool will not be created.
     *
     * @param M menuCreator
     * @param menu
     */
    protected final void checkSecurity(M menuCreator,
            Menu menu) {
        Boolean permission = GPAccountLogged.getInstance().
                hasComponentPermission(this.getId());
        if (permission != null) {
            super.enabled &= permission;
            this.create(menuCreator, menu);
        }
    }

    /**
     * Bypass User Permission on Tool and call the method for creation
     * 
     * @param M menuCreator
     * @param menu 
     */
    protected final void byPassSecurity(M menuCreator,
            Menu menu) {
        this.create(menuCreator, menu);
    }

    /**
     * Each component will be added into menu itself
     *
     * @param menubar
     * @param menu
     */
    protected abstract void create(M menuCreator,
            final Menu menu);
}