package org.app.mom.factory;

import org.app.mom.contracts.file.FileAdapter;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.service.FileService;
import org.app.mom.contracts.structure.Queue;
import org.app.mom.helper.FileType;

/**
 * This class is a factory class for File Service.
 * 
 * @author Anish Singh
 *
 */
public class FileServiceFactory {

	public static FileService<Queue, FileProperty> getInstance(FileType fileType) {
		org.app.mom.service.FileService fileService = new org.app.mom.service.FileService();
		fileService.setFileAdapter(getFileAdapter(fileType));
		return fileService;
	}

	public static FileAdapter<Queue, FileProperty> getFileAdapter(FileType fileType) {
		if (FileType.XLS.equals(fileType)) {

		} else if (FileType.TXT.equals(fileType)) {

		} else if (FileType.CSV.equals(fileType)) {

		}
		return null;
	}

}
