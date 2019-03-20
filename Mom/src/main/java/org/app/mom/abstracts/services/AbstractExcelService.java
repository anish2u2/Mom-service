package org.app.mom.abstracts.services;

import java.util.logging.Logger;

import org.app.mom.contracts.cryptography.Cryptography;
import org.app.mom.contracts.excel.ExcelProperties;
import org.app.mom.contracts.excel.ExcelQueue;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.service.ExcelService;

public abstract class AbstractExcelService implements ExcelService {

	private ExcelQueue excelQueue;

	private Cryptography cryptography;

	protected Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void saveActivities(ExcelQueue activityQueue, FileProperty excelProperties, String file) {
		this.excelQueue = activityQueue;
		saveActivity((ExcelProperties) excelProperties, file);

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

	public void setCryptography(Cryptography cryptography) {
		this.cryptography = cryptography;
	}

	protected Cryptography getCryptoObject() {
		return cryptography;
	}

}
