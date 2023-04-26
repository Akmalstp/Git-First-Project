package com.akmal.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@PostMapping("\testPath")
	public String testMethod() {	
		return "This reply is from controller!";
	}
}
