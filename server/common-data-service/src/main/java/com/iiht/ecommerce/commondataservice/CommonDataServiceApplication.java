package com.iiht.ecommerce.commondataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.iiht.ecommerce.commondataservice.controller.CommonDataController;

@SpringBootApplication
@EnableCaching
@EnableDiscoveryClient
public class CommonDataServiceApplication {

    public static void main(final String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CommonDataServiceApplication.class, args);
        context.getBean(CommonDataController.class).fillWithTestData();
    }
}
