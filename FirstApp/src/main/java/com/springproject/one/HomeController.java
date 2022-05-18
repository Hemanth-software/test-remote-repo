package com.springproject.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public String welcome() {
		
		return "Welcome to Spring Boot Project";
	}
	
	
	
}
