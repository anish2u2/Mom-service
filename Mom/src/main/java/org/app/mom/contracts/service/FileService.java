package org.app.mom.contracts.service;

import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;

/**
 * This interface allows method for writing ex
 * 
 * @author Anish Singh
 *
 * @param <T>
 */
public interface FileService<T extends Queue,F extends FileProperty> {

	/**
	 * This method will return an instance of Queue which can be used for later used
	 * to read data.
	 * 
	 * @param file
	 * @param fileType
	 * @return
	 */
	public T readFile(String file);

	/**
	 * This method will write the data to file.
	 * 
	 * @param data
	 * @param excelProperties
	 * @param file
	 */
	public void writeFile(T data, F excelProperties, String file);

}
