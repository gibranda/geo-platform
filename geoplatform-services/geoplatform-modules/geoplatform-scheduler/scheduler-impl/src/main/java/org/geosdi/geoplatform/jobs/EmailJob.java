/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2011 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.jobs;

import org.geosdi.geoplatform.core.model.GPUser;
import org.geosdi.geoplatform.exception.EmailException;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Vincenzo Monteverde
 * @email vincenzo.monteverde@geosdi.org - OpenPGP key ID 0xB25F4B38
 */
// NOT execute multiple instances of a given job definition - JobDetail -
// (that refers to the given job class - Job) concurrently
@DisallowConcurrentExecution
public class EmailJob implements Job {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    public static final String USER = "user";
    public static final String EMAIL_TASK = "emailTask";
    //
    private EmailTask emailTask;

    /**
     * Quartz pass emailTask each time that an instance of EmailJob was created,
     * because emailTask was insert into JobDataMap of JobDetail tie to this job
     * 
     * @param emailTask the emailTask to set
     */
    public void setEmailTask(EmailTask emailTask) {
        this.emailTask = emailTask;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.debug("\n*** START send email job ***");

        GPUser user = (GPUser) context.getTrigger().getJobDataMap().get(USER);
        logger.trace("\n*** " + user);

        if (user != null) {
            try {
                emailTask.sendConfirmationEmail(user);
            } catch (EmailException ee) {
                logger.error("\n\t\t*** ERROR: EmailException", ee.getMessage());
                
                JobExecutionException jee = new JobExecutionException(ee);
                // Unschedule the trigger associated with this job
                // so that it does not run again for this user
                jee.setUnscheduleFiringTrigger(true);
                throw jee;
            }
        }

        logger.debug("\n*** STOP send email job ***");
    }
}
