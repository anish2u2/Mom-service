package org.app.mom.abstracts.services;

import org.app.mom.contracts.excel.ExcelProperties;
import org.app.mom.contracts.excel.ExcelQueue;
import org.app.mom.contracts.service.ExcelService;

public abstract class AbstractExcelService implements ExcelService {

	private ExcelQueue excelQueue;

	@Override
	public void saveActivities(ExcelQueue activityQueue, ExcelProperties excelProperties, String file) {
		this.excelQueue = activityQueue;
		saveActivity(excelProperties, file);

	}

	/**
	 * This method allow subclass to give specialized method implementation.
	 * 
	 * @param excelProperties
	 * @param file
	 */
	protected abstract void saveActivity(ExcelProperties excelProperties, String file);

	public void setExcelQueue(ExcelQueue excelQueue) {
		this.excelQueue = excelQueue;
	}

	protected ExcelQueue getExcelQueue() {
		return this.excelQueue;
	}

}
