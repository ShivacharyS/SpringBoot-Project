package com.example.techeazy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.techeazy.Repo.SubjectRepo;
import com.example.techeazy.entity.Subject;

@Service
public class SubjectServiceImp implements SubjectService {
	
	@Autowired
	private SubjectRepo repo;

	@Override
	public List<Subject> getAllSubject() {
		List<Subject> subjects = repo.findAll();
		return subjects;
	}

}
