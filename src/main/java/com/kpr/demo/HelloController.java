package com.kpr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/demo")
	public String displayMessage() {
		return "Hello, from controller..";
	}
}
