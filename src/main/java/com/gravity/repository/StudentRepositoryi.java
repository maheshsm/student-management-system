package com.gravity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gravity.model.Student;
@Repository
public interface StudentRepositoryi extends JpaRepository<Student, Integer> {
	Student findByFirstName(String firstname);
	Student findByLastName(String lastname);
	Student findByRollNo(Integer rollNo);
	Student deleteByRollNo(Integer rollNo);
    
}
