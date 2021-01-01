package com.example.newtestproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path="/test")
public class NewtestprojApplication {
	@GetMapping(path="/method")
	public String returnHello()
	{
		return "Hello Avi"; 
	}
	public static void main(String[] args) {
		SpringApplication.run(NewtestprojApplication.class, args);
	}

}
