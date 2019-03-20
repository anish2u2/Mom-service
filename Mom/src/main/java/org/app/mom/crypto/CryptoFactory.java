package org.app.mom.crypto;

import java.security.Key;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.app.mom.contracts.cryptography.Cryptography;
import org.app.mom.contracts.cryptography.Decryptor;
import org.app.mom.contracts.cryptography.Encryptor;
import org.springframework.beans.factory.annotation.Autowired;

public class CryptoFactory implements Cryptography {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	private CryptoProperty property;

	private Cipher cipher;

	private Encryptor encryptor;

	private Decryptor decryptor;

	private Key key;

	@Override
	public void init() {
		try {
			cipher = Cipher.getInstance(property.getAlgorithm());
			key = new SecretKeySpec(property.getKey().getBytes(), property.getAlgorithm());
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error creating cipher", e);
		}
	}

	@Override
	public Encryptor getEncryptor() {
		if (encryptor == null) {
			org.app.mom.crypto.Encryptor encrypt = new org.app.mom.crypto.Encryptor();
			encrypt.setCipher(cipher);
			encrypt.initEncryptor(key);
			encryptor = encrypt;
		}
		return encryptor;
	}

	@Override
	public Decryptor getDecryptor() {
		if (decryptor == null) {
			org.app.mom.crypto.Decryptor decrypt = new org.app.mom.crypto.Decryptor();
			decrypt.setCipher(cipher);
			decrypt.initDecryptor(key);
			decryptor = decrypt;
		}
		return decryptor;
	}

	@Override
	public void destroy() {
		cipher = null;
		encryptor = null;
		decryptor = null;
		key = null;

	}

}
