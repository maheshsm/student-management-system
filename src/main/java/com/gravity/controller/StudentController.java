package com.gravity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gravity.model.Student;
import com.gravity.service.StudentServiceI;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@GetMapping("welcome")
	public String testWebService() {
		
		return "welcome to student management system";
	}
	
	// Put 
	@PutMapping("/student/{rollNumber}")
	public Student updateStudentById(@PathVariable (value="rollNumber") Integer rollNumber , @RequestBody Student student) {
		
		return studentServiceI.updateStudent(rollNumber , student );
	}
}
