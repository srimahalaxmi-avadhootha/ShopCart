package com.dis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class CartAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartAdminServerApplication.class, args);
	}

}
