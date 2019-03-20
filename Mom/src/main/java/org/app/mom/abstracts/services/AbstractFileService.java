package org.app.mom.abstracts.services;

import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.service.FileService;
import org.app.mom.contracts.structure.Queue;

public abstract class AbstractFileService implements FileService<Queue, FileProperty> {

	@Override
	public Queue readFile(String file) {

		return null;
	}

	@Override
	public void writeFile(Queue data, FileProperty excelProperties, String file) {

	}

}
