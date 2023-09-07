package com.gravity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gravity.model.Student;
import com.gravity.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceI {
  
	@Autowired
	private StudentRepository studentRepostory;
	
	// UPDATE FEATURE 
   public Student updateStudent(Integer rollNumber, Student studentDatials) {
	
	  Student student = studentRepostory.findById(rollNumber).get();
	 
	 student.setFirstName(studentDatials.getFirstName());
	 student.setLastName(studentDatials.getLastName());
	 student.setMarks(studentDatials.getMarks());
	 student.setEmail(studentDatials.getEmail());
	 student.setMobileNo(studentDatials.getMobileNo());
	 
	return studentRepostory.save(student);
	   
   }
}
