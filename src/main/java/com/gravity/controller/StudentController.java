package com.gravity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class StudentController {

	@GetMapping("test")
	public String testWebService() {
		
		return "Test Web service";
	}
}
