package com.etest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
@EnableMongoRepositories("com.etest.repository")
//@EnableOAuth2Sso
public class ETestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ETestApplication.class, args);
	}


}
