package com.jarv.practice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("app.config")
public class AppConfig {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Profile("dev")
	@Bean
	public String testAppConfig() {
		System.out.println("NAME: " + name);
		return "AppConfig for DEV!";
	}
}
