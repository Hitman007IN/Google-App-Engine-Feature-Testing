package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApp {
	public static void main(String[] args) {

		 SpringApplication.run(SpringBootApp.class, args);

	}
	
	@GetMapping("/hello")
	public String displayHello() {
		return "Hello App";
	}
}