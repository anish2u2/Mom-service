package org.app.mom.contracts.service;

import org.app.mom.contracts.excel.ExcelQueue;
import org.app.mom.contracts.file.FileProperty;

/**
 * This interface allows service methods.
 * 
 * @author Anish Singh
 *
 */
public interface ExcelService {

	/**
	 * This method will return
	 * 
	 * @param file
	 * @return
	 */
	public ExcelQueue readActivity(String file);

	/**
	 * This method will save the activity data into the file.
	 * 
	 * @param activityQueue
	 * @param excelProperties
	 * @param file
	 */
	public void saveActivities(ExcelQueue activityQueue, FileProperty fileProperty, String file);
}
