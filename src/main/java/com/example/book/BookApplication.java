package com.example.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {
	
	@GetMapping("available")
	public String available() {
		return "Spring in Action";
	}
	
	@GetMapping("checked-out")
	public String checkedOut() {
		return "Spring Boot in Action";
	}

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
}
