package com.dailycode.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigApplication {

	public static void main(String[] args) {
		// http://localhost:9296/application/default
		System.setProperty("spring.config.name", "application");
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
