package com.gravity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	// get all
	@GetMapping("/student/getallstudent")
	public List<Student> getAllStudent() {
		return studentServiceI.getAllStudent();
	}
}
