package com.test.springbdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.test.springbdd")
public class SpringBddApplication {
	
	public static void main (String args) {
		//SpringApplication.run(SpringBddApplication.class, args);
		SpringApplication.run(SpringBddApplication.class);
	}

}
