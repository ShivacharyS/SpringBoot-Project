package com.example.techeazy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.techeazy.Repo.StudentRepo;
import com.example.techeazy.dto.Enroll;
import com.example.techeazy.entity.Student;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	StudentRepo repo;
	
	 @Autowired
	 private PasswordEncoder passwordEncoder;

	@Override
	public String addStudent(Enroll enroll) {
		
		Student student = enroll.getStudent();
		student.setStudentPassword(passwordEncoder.encode(student.getStudentPassword()));
		
		repo.save(student);
		return "Student Added Successfully";
		
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = repo.findAll();	
		return students;
	}

	@Override
	public Student getStudentDetais(int id) {
		Student student = repo.findById(id).get();
		return student;
	}

}
