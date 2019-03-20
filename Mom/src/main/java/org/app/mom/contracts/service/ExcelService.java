package org.app.mom.contracts.service;

import org.app.mom.contracts.excel.ExcelProperties;
import org.app.mom.contracts.excel.ExcelQueue;

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
	public void saveActivities(ExcelQueue activityQueue, ExcelProperties excelProperties, String file);
}
