package org.geosdi.geoplatform.experimental.el.threadpool.spi.finder;

import java.util.concurrent.Executor;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public interface GPThreadPoolExecutorFinder {

    /**
     * @param <E>
     * @return {@link E}
     */
    <E extends Executor> E findExecutor();
}
