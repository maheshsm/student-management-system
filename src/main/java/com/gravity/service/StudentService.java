package com.gravity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.gravity.model.Student;
import com.gravity.repository.StudentRepositoryi;
@Service
public class StudentService implements StudentServiceI {
@Autowired
	private StudentRepositoryi s;
	public Student add(Student student) {
		Student st=s.save(student);
		return st;
	}
	@Override
	public Student searchname(String firstName) {
		Student s2=s.findByFirstName(firstName);
		return s2;
	}
	@Override
	public Student searchnames(String lastName) {
		Student s2=s.findByLastName(lastName);
		
		return s2;
	}
	@Override
	public Student searchrollNo(Integer rollNo) {
		Student s3=s.findByRollNo(rollNo);
		return s3;
	}
	@Override
	public List<Student> getAll() {
		List<Student> s4=s.findAll();
		return s4;
	}
	@Override
	public Student updateRollNo(Student student) {
		Student s4=s.save(student);
		return s4;
	}
	/*
	 * @Override public void deleteStudent(Integer rollNo) {
	 * s.deleteByRollNo(rollNo);
	 * 
	 * }
	 */
	
	
	
}
