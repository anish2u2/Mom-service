package org.app.mom.listeners.cache;

import java.util.logging.Logger;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

/**
 * This class will represents as a listener for cahce.
 * 
 * @author Anish Singh
 *
 */
public class MomCacheListener implements CacheEventListener<Object, Object> {

	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void onEvent(CacheEvent<? extends Object, ? extends Object> event) {
		logger.info("Refreshing cache: " + event.getKey() + " " + event.getOldValue() + " " + event.getNewValue());
	}

}
