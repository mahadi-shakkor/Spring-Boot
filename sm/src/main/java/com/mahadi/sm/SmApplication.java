package com.mahadi.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mahadi.outside.controller"})
public class SmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmApplication.class, args);
	}

}
