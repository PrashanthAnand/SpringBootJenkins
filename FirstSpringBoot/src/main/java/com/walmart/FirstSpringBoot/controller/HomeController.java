package com.walmart.FirstSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// When we say rest controller there can be no jsp page
public class HomeController {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "Hello Shaann";
	}

}
