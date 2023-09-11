package com.gravity.service;

import com.gravity.model.Student;

public interface StudentServiceI {
	
	Student updateStudent(Integer rollNumber, Student student);

	String deleteStudentByRollNo(Integer rollNo);

	Student createStudentRecord(Student student);

}
