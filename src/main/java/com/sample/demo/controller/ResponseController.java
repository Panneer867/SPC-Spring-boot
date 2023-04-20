package com.sample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

	@GetMapping("/test")
	public String test() {
		return "Hi, this is sample response";
	}
}
