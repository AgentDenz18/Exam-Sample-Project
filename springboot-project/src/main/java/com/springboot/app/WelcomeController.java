package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	/* @GetMapping("/welcome") */
	/* @RequestMapping("/test") */
	@GetMapping(value="/")
	public String test() {
		
		System.out.println("WelcomeController->welcome()");
		
		return "test";
	}

}
