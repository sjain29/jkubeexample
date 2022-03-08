package com.shreyans.mavendocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/test")
	private String testString() {
		return "Hello from Docker";
	}

}
