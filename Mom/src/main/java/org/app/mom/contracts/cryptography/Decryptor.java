package org.app.mom.contracts.cryptography;

import java.io.InputStream;

import org.workers.contracts.Destroy;

/**
 * This interface allows method for decryption.
 * 
 * @author Anish Singh
 *
 */
public interface Decryptor extends Destroy {

	/**
	 * This method will decrypt file.
	 * 
	 * @return
	 */
	public InputStream decrypt(String file);

}
