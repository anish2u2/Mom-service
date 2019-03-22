package org.app.mom.service;

import java.util.logging.Level;

import org.app.mom.abstracts.services.AbstractExcelService;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;

public class Service extends AbstractExcelService {

	@Override
	public Queue readActivity(String file) {
		try {
			return getFileService().readFile(file);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}
		return null;
	}

	@Override
	public void saveActivities(Queue activityQueue, FileProperty fileProperty, String file) {
		getFileService().writeFile(activityQueue, fileProperty, file);

	}

}
