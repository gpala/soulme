package com.example.soulme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SoulmeAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoulmeAccountApplication.class, args);
	}

}
