package com.example.techeazy.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.techeazy.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	Optional<Student> findByStudentName(String studentName);

}
