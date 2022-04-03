package com.in28minutes.microservices.limitsservice;

import org.apache.http.client.methods.HttpHead;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Accept","application/json");


	}

}
