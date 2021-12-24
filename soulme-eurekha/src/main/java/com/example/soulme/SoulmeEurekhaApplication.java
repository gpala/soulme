package com.example.soulme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SoulmeEurekhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoulmeEurekhaApplication.class, args);
	}

}
