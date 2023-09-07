package com.gravity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gravity.model.Student;
import com.gravity.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceI {
  
	@Autowired
	private StudentRepository studentRepostory;

	@Override
	public List<Student> getAllStudent(){
		return studentRepostory.findAll();
	}
	
  }
