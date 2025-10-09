package com.darrendelimond.spring.core.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.darrendelimond.spring.core.demo","com.darrendelimond.util"})
public class SpringCoreDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
