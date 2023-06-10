package com.example.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiPrimaryKeyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiPrimaryKeyProjectApplication.class, args);
	}
	
//	@Bean
//	public ObjectMapper objectMapper() {
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//		objectMapper.registerModule(new HibernateLazyInitializerModule());
//		return objectMapper;
//	}
}
