package com.gravity.service;

import java.util.List;

import com.gravity.model.Student;

public interface StudentServiceI {
	public Student add(Student student);
	public Student searchname(String firstName);
	public Student searchnames(String lastName);
	public Student searchrollNo(Integer rollNo);
	public List<Student> getAll();
	public Student updateRollNo(Student student);
	//public void deleteStudent (Integer rollNo);

}
 