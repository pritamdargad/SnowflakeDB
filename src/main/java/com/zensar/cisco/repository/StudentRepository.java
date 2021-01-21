package com.zensar.cisco.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.zensar.cisco.entity.Student;

@Component
public interface StudentRepository extends CrudRepository<Student,Integer> {
	
	
	//public List<Student> findByStudentName(Integer studentId);
	public List<Student> findAll();
	//public List<Student> studentId(Integer studentId);
	

}
