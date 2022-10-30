package com.iiht.ecommerce.selleraccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SellerAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerAccountServiceApplication.class, args);
	}

}
