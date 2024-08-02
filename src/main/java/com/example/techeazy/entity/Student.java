package com.example.techeazy.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "st_id")
	private int studentId;
	private String studentName;
	private String studentPassword;
	private String role;
	private String studentAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_st_id",referencedColumnName = "st_id")
	private List<Subject> subject;
	
	
	
	
	public Student(int studentId, String studentName,String studentPassword,String role, String studentAddress, List<Subject> subject) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPassword = studentPassword;
		this.role = role;
		this.studentAddress = studentAddress;
		this.subject = subject;
	}
	
	
	public Student() {
		
	}
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}


	public String getStudentPassword() {
		return studentPassword;
	}


	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	
	

	
	

}
