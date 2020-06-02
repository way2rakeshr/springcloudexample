package com.example.poccloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PoccloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoccloudApplication.class, args);
	}

}
