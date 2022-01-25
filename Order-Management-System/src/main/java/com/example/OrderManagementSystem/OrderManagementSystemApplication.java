package com.example.OrderManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaAuditing
@Transactional
public class OrderManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementSystemApplication.class, args);
	}
	
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
