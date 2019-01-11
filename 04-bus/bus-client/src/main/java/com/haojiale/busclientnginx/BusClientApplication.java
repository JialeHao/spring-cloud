package com.haojiale.busclientnginx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BusClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusClientApplication.class, args);
	}

}

