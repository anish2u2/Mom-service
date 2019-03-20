package org.app.mom.crypto;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.Key;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

import org.app.mom.helper.FileHelper;

public class Decryptor implements org.app.mom.contracts.cryptography.Decryptor {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	private Cipher cipher;

	@Override
	public InputStream decrypt(String file) {
		FileInputStream stream = FileHelper.getFileInputStream(file + "_encrypted.xxx");
		CipherInputStream inputStream = new CipherInputStream(stream, cipher);
		return inputStream;
	}

	public void setCipher(Cipher cipher) {
		this.cipher = cipher;
	}

	public void initDecryptor(Key key) {
		try {
			cipher.init(Cipher.DECRYPT_MODE, key);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error", e);
		}
	}

	@Override
	public void destroy() {
		cipher = null;
	}
}
