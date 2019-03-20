package org.app.mom.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the helper class for working on Files.
 * 
 * @author Anish Singh
 *
 */
public class FileHelper {

	private static Logger logger = Logger.getLogger(FileHelper.class.getName());

	/**
	 * This method will return FileInputStream for the corresponding file.
	 * 
	 * @param file
	 * @return
	 */
	public static FileInputStream getFileInputStream(String file) {
		try {
			File existingFile = new File(file);
			if (!existingFile.exists()) {
				throw new FileNotFoundException(file);
			}
			return new FileInputStream(existingFile);
		} catch (FileNotFoundException ex) {
			logger.log(Level.SEVERE, "File not found", ex);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}

		return null;
	}

	/**
	 * This method will return FileOutputStream.
	 * 
	 * @param file
	 * @return
	 */
	public static FileOutputStream getFileOutputStream(String file) {
		try {
			File existingFile = new File(file);
			if (!existingFile.exists()) {
				existingFile.createNewFile();
			}
			return new FileOutputStream(existingFile);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}

		return null;
	}

}
