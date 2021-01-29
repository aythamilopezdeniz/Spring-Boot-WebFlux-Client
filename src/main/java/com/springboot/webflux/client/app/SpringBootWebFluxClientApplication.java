package com.springboot.webflux.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootWebFluxClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebFluxClientApplication.class, args);
	}
}