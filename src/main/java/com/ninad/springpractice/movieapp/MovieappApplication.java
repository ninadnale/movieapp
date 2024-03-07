package com.ninad.springpractice.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MovieappApplication {
	
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(MovieappApplication.class, args);
	}

	@GetMapping("/root")
	public String apiRoot() {
		// String databaseName = env.getProperty("spring.data.mongodb.uri");
		// System.err.println("Database Name: " + databaseName);
		return "Welcome to the Movie App!";
	}

}
