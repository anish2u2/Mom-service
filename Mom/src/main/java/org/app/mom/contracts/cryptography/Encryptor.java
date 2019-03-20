package org.app.mom.contracts.cryptography;

import java.io.File;
import java.io.OutputStream;

import org.workers.contracts.Destroy;

/**
 * This method will allows method for encrypt.
 * 
 * @author Anish Singh
 *
 */
public interface Encryptor extends Destroy{

	/**
	 * This method will encrypt the file.
	 * 
	 * @param file
	 */
	public OutputStream encrypt(File file);

}
