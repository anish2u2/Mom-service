package org.app.mom.service;

import org.app.mom.abstracts.services.AbstractFileService;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;

public class FileService extends AbstractFileService {

	@Override
	public Queue readFile(String file) {
		return getFileAdapter().readFile(file);
	}

	@Override
	public void writeFile(Queue data, FileProperty excelProperties, String file) {
		getFileAdapter().setDataQueue(data);
		getFileAdapter().setFileProperty(excelProperties);
		getFileAdapter().writeToFile(file);
	}

}
