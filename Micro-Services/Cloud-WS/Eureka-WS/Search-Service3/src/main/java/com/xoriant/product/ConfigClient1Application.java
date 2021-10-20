package com.xoriant.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient1Application.class, args);
	}

}
