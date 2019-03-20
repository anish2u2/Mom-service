package org.app.mom.abstracts.services;

import org.app.mom.contracts.file.FileAdapter;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.service.FileService;
import org.app.mom.contracts.structure.Queue;

public abstract class AbstractFileService implements FileService<Queue, FileProperty> {

	private FileAdapter<Queue, FileProperty> fileAdapter;

	protected FileAdapter<Queue, FileProperty> getFileAdapter() {
		return this.fileAdapter;
	}

	public void setFileAdapter(FileAdapter<Queue, FileProperty> fileAdapter) {
		this.fileAdapter = fileAdapter;
	}

}
