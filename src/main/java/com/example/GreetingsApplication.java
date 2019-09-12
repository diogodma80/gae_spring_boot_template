package com.example;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello Spring Boot!!!";
	}
	
	@GetMapping("/time")
	public String time() {
		return Calendar.getInstance().getTime().toString();
	}

}
