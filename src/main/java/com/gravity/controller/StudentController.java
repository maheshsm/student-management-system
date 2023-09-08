package com.gravity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	private StudentServiceI studentService;
	
	@GetMapping("welcome")
	public String testWebService() {
		
		return "welcome to student management system";
	}
	
	// Put 
	@PutMapping("/student/{rollNumber}")
	public ResponseEntity<?> updateStudentById(@PathVariable Integer rollNumber , @RequestBody Student student) {
		
		return new ResponseEntity<>(studentService.updateStudent(rollNumber, student), HttpStatus.NO_CONTENT);

	}
	
	//delete student By Roll No
	@DeleteMapping("delete/student/{rollNo}")
	public ResponseEntity<?> deleteStudent(@PathVariable Integer rollNo ){
		
		return new ResponseEntity<>(studentService.deleteStudentByRollNo(rollNo), HttpStatus.NO_CONTENT);
		
	}
}
