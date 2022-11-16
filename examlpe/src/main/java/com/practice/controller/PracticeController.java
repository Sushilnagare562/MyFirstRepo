package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	
	@GetMapping("/hello")
	public  String hello() {
		System.out.println("Hello World");
		return "hello world";
	}

}
