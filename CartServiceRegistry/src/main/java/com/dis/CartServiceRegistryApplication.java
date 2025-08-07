package com.dis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CartServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceRegistryApplication.class, args);
	}

}
