package org.app.mom.service;

import java.util.logging.Level;

import org.app.mom.abstracts.services.AbstractExcelService;
import org.app.mom.contracts.excel.ExcelProperties;
import org.app.mom.contracts.excel.ExcelQueue;

public class ExcelService extends AbstractExcelService {

	

	@Override
	public ExcelQueue readActivity(String file) {
		try {
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}
		return null;
	}

	@Override
	protected void saveActivity(ExcelProperties excelProperties, String file) {
		try {

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}
	}

}
