package org.app.mom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MomApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomApplication.class, args);
	}

}
