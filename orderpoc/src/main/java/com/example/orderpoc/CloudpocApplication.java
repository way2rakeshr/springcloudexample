package com.example.orderpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CloudpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudpocApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate() {

		return new RestTemplate();

	}
}
