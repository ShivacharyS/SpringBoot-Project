package com.example.techeazy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.techeazy.Repo.StudentRepo;
import com.example.techeazy.entity.Student;

@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	StudentRepo studentRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Student student = studentRepo.findByStudentName(username).get();
		
		return User.builder().username(student.getStudentName()).password(student.getStudentPassword())
		.roles(student.getRole()).build();
		
		
	}

}
