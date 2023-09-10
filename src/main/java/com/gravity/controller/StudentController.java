package com.gravity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentServiceI s;
	
	@PostMapping("/add")
	public Student add(@RequestBody Student student) {
		Student s1=s.add(student);
		return s1;	
	}
	@GetMapping("/get1/{firstName}")
	public Student search(@PathVariable String firstName)
	{
		Student s4=s.searchname(firstName);
	    return s4;
	}
	
	@GetMapping("/get2/{lastName}")
	public Student searchs(@PathVariable String lastName) 
	{
		Student s4=s.searchnames(lastName);
		return s4;
	}
	
	@GetMapping("/get3/{rollNo}")
	public Student search(@PathVariable Integer rollNo)
	{
		Student s4=s.searchrollNo(rollNo);
		return s4;
	}
	@GetMapping("/AllRecord")
	public List<Student> All(){
		List<Student> list=s.getAll();
		return list;
	}
	@PutMapping("/{up}")
	public Student upadte(@RequestBody Student student) {
		Student s5=s.updateRollNo(student);
		return s5;
	}
	
	/*
	 * @DeleteMapping("delete/{RollNo}") public void delete(@PathVariable Student
	 * rollNo) {
	 * 
	 * 
	 * }
	 */
		
	}
	

