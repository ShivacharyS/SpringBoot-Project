package com.example.techeazy.dto;
import com.example.techeazy.entity.Student;



public class Enroll {

	private Student student;
	
	public Enroll() {
			
		}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Enroll(Student student) {
		super();
		this.student = student;
	}

	@Override
	public String toString() {
		return "Enroll [student=" + student + ", getStudent()=" + getStudent() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
