package org.app.mom.contracts.service;

import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;

/**
 * This interface allows service methods.
 * 
 * @author Anish Singh
 *
 */
public interface Service {

	/**
	 * This method will return
	 * 
	 * @param file
	 * @return
	 */
	public Queue readActivity(String file);

	/**
	 * This method will save the activity data into the file.
	 * 
	 * @param activityQueue
	 * @param fileProperties
	 * @param file
	 */
	public void saveActivities(Queue activityQueue, FileProperty fileProperty, String file);
}
