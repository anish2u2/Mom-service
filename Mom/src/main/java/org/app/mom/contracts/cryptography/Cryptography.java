package org.app.mom.contracts.cryptography;

import org.workers.contracts.Destroy;

/**
 * This interface allows method to introduce encryption and decryption.
 * 
 * @author Anish Singh
 *
 */
public interface Cryptography extends Destroy {

	String CRYPTO_PROP_NAME = "crypto.prop.file.name";

	/**
	 * This method will initialize the Cryptography properties.
	 */
	public void init();

	/**
	 * This method will return Encryptor.
	 * 
	 * @return
	 */
	public Encryptor getEncryptor();

	/**
	 * This method will return Decryptor.
	 * 
	 * @return
	 */
	public Decryptor getDecryptor();

}
