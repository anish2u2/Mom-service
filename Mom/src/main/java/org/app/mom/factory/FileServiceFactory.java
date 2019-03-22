package org.app.mom.factory;

import java.util.LinkedList;

import org.app.mom.adapter.TextFileAdapter;
import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.file.FileAdapter;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.service.FileService;
import org.app.mom.contracts.structure.Queue;
import org.app.mom.helper.FileType;
import org.pattern.design.impl.signal.SignalFactory;

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
			TextFileAdapter queue = new TextFileAdapter();
			queue.setDataQueue(QueueFactory.getTextQueue(createActivityQueue(), SignalFactory.getSignalInstance()));
			return queue;
		} else if (FileType.CSV.equals(fileType)) {

		}
		return null;
	}

	public static java.util.Queue<Activity> createActivityQueue() {
		return new LinkedList<Activity>();
	}

}
