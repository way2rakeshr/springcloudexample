package com.example.loginpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient

public class LoginpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginpocApplication.class, args);
	}
	
	
	
	@Bean
	
	RestTemplate getRestTemplate() {
		
		
		return new RestTemplate();
		
		
	}

}
