package com.etest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.etest.dao")
@EnableOAuth2Sso
public class ETestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ETestApplication.class, args);
	}

}
