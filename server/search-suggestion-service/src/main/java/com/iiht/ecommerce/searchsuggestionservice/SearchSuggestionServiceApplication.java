package com.iiht.ecommerce.searchsuggestionservice;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.iiht.ecommerce.searchsuggestionservice.controller.SearchSuggestionController;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
public class SearchSuggestionServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SearchSuggestionServiceApplication.class, args);
		context.getBean(SearchSuggestionController.class).loadSearchSuggestions();
	}

}
