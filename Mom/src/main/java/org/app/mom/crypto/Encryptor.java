package org.app.mom.crypto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.Key;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

public class Encryptor implements org.app.mom.contracts.cryptography.Encryptor {

	private Cipher cipher;

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public OutputStream encrypt(File file) {
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			CipherOutputStream stream = new CipherOutputStream(outputStream, cipher);
			return stream;
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}
		return null;
	}

	public void setCipher(Cipher cipher) {
		this.cipher = cipher;
	}

	public void initEncryptor(Key key) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}
	}

	@Override
	public void destroy() {
		cipher = null;

	}

}
