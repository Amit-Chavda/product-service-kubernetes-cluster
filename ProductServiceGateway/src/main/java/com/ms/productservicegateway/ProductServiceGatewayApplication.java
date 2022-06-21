package com.ms.productservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceGatewayApplication.class, args);
	}

}
