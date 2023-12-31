package com.sakhayadeep.democicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemocicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocicdApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World!");
	}

}
