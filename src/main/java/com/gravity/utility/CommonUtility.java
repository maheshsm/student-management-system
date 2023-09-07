package com.gravity.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gravity.model.Student;
import com.gravity.repository.StudentRepository;
import com.gravity.service.StudentService;

@Service
public class CommonUtility implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public String deleteStudentById(Integer studentId) {
		Student student=studentRepo.findById(studentId).get();
		if(student != null) {
		studentRepo.delete(student);
		return "Student having id "+studentId+" deleted successfully";
		}
		return "Student having id "+studentId+" not found";
	}

	@Override
	public String deleteStudentByRollNo(Integer rollNo) {
		Student student=studentRepo.findByRollNo(rollNo);
		if(student != null) {
		studentRepo.delete(student);
		return "Student having roll no. "+rollNo+" deleted successfully";
		}
		return "Student having roll no. "+rollNo+" not found";
	}

//	@Override
//	public Student addStudent(Student student) {
//		return studentRepo.save(student);
//	}

}
