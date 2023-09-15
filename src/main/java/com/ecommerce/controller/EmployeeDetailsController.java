package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class EmployeeDetailsController {

	@Autowired
	
	
	@GetMapping("welcome")
	public String testWebService() {
		
		return "welcome to student management system";
	}
	
	// Put 
	@PutMapping("/student/{rollNumber}")
	public void updateStudentById(@PathVariable (value="rollNumber") Integer rollNumber) {
	}
}
