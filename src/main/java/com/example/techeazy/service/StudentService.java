package com.example.techeazy.service;

import java.util.List;

import com.example.techeazy.dto.Enroll;
import com.example.techeazy.entity.Student;

public interface StudentService {
	
	public String addStudent(Enroll enroll);
	public List<Student> getAllStudents();
	public Student getStudentDetais(int id);

}
