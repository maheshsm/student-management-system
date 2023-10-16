package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EcommerceMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMgmtApplication.class, args);
		System.out.println("----------------Application Started successfully----------------");
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
