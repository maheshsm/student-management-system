package com.gravity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gravity.model.Student;
import com.gravity.service.StudentService;

@RestController
@RequestMapping("/demo/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("test")
	public String testWebService() {
		return "Test Web service";
	}
	
//add new student
//	@PostMapping("add")
//	public ResponseEntity<?> addStudent(@RequestBody Student student) {
//		return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
//	}
	//delete student By Id
	@DeleteMapping("deletebyid/{studentId}")
	public ResponseEntity<?> deleteStudentById(@PathVariable String studentId ){
		return new ResponseEntity<>(studentService.deleteStudentById(Integer.parseInt(studentId)), HttpStatus.OK);
	}
	
	//delete student By Roll No
	@DeleteMapping("deletebyrn/{rollNo}")
	public ResponseEntity<?> deleteStudent(@PathVariable String rollNo ){
		return new ResponseEntity<>(studentService.deleteStudentByRollNo(Integer.parseInt(rollNo)), HttpStatus.OK);
		
	}
}
