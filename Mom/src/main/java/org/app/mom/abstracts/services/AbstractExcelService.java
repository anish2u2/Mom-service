package org.app.mom.abstracts.services;

import java.util.logging.Logger;

import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.service.FileService;
import org.app.mom.contracts.service.Service;
import org.app.mom.contracts.structure.Queue;

public abstract class AbstractExcelService implements Service {

	private FileService<Queue, FileProperty> fileService;

	protected Logger logger = Logger.getLogger(this.getClass().getName());

	public FileService<Queue, FileProperty> getFileService() {
		return fileService;
	}

	public void setFileService(FileService<Queue, FileProperty> fileService) {
		this.fileService = fileService;
	}

}
