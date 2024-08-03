package com.example.techeazy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.techeazy.dto.Enroll;
import com.example.techeazy.entity.Student;
import com.example.techeazy.entity.Subject;
import com.example.techeazy.service.StudentServiceImp;
import com.example.techeazy.service.SubjectServiceImp;

@RestController
@RequestMapping("/Class")
public class ClassController {
	
	@Autowired
	StudentServiceImp stuService;
	
	@Autowired
	SubjectServiceImp subService;
	
	
	@PostMapping("/add")
	public String controllerAddStudent(@RequestBody Enroll enroll) {
		
		String response = stuService.addStudent(enroll);
		return response;
	}
	
	@GetMapping("/getOneStudent/{id}")
	public Student getStudent(@PathVariable("id") int id){
		Student student = stuService.getStudentDetais(id);
		return student;
	}
	
	@GetMapping("/getAllStu")
	public List<Student> getAll(){
		List<Student> students = stuService.getAllStudents();
		return students;
	}
	
	
	@GetMapping("/getAllSub")
	public List<Subject> controllerGetAllSubject(){
		List<Subject> subjects = subService.getAllSubject();
		return subjects;
	}
	
	
	

}
