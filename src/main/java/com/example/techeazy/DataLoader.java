package com.example.techeazy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.techeazy.Repo.StudentRepo;
import com.example.techeazy.entity.Student;
import com.example.techeazy.entity.Subject;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        Subject sub1 = new Subject();
        sub1.setSubjectName("Maths");
        Subject sub2 = new Subject();
        sub2.setSubjectName("English");

        List<Subject> subjects1 = new ArrayList<>();
        subjects1.add(sub1);
        subjects1.add(sub2);

        Student admin1 = new Student();
        admin1.setStudentName("Shiva");
        admin1.setStudentPassword(passwordEncoder.encode("password"));
        admin1.setRole("ADMIN");
        admin1.setStudentAddress("SirpurKaghaznagar");
        admin1.setSubject(subjects1);

        studentRepo.save(admin1);

        Subject sub3 = new Subject();
        sub3.setSubjectName("Java");
        Subject sub4 = new Subject();
        sub4.setSubjectName("Computer Networks");

        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(sub3);
        subjects2.add(sub4);

        Student admin2 = new Student();
        admin2.setStudentName("Chary");
        admin2.setStudentPassword(passwordEncoder.encode("password"));
        admin2.setRole("USER");
        admin2.setStudentAddress("Hyderabad");
        admin2.setSubject(subjects2);

        studentRepo.save(admin2);
    }
}
