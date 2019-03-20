package org.app.mom.crypto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({ @PropertySource("classpath:crypto-props/crypto-prop.crypto") })
public class CryptoProperty {

	@Value("${crypto.algo.name}")
	private String algorithm;

	@Value("${crypto.key}")
	private String key;

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
