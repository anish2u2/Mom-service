package org.app.mom.contracts.file;

import java.io.InputStream;
import java.io.OutputStream;

import org.app.mom.contracts.structure.Queue;

/**
 * This interface is an abstraction for file adpter.
 * 
 * @author Anish Singh
 *
 */
public interface FileAdapter<T extends Queue, F extends FileProperty> {

	/**
	 * This method will set the file property.
	 * 
	 * @param fileProperty
	 */
	public void setFileProperty(FileProperty fileProperty);

	/**
	 * This method will set data Queue which will be holding actual data to write to
	 * the file and the signal.
	 * 
	 * @param queue
	 */
	public void setDataQueue(Queue queue);

	/**
	 * This method will start a thread to write the data to the file.
	 * 
	 * @param file
	 */
	public void writeToFile(String file);

	/**
	 * This method allows to write data to outputstream.
	 * 
	 * @param stream
	 */
	public void write(OutputStream stream);

	/**
	 * This method will return a Queue which will be holding data and a limited data
	 * is written to the queue using thread so process will be concurrent.
	 * 
	 * @param file
	 * @return
	 */
	public Queue readFile(String file);

	/**
	 * This method allows data to read from input stream.
	 * 
	 * @param inputStream
	 * @return
	 */
	public Queue read(InputStream inputStream);
}
