package com.rcoem.day1demo.controllers;

import com.rcoem.day1demo.entities.Student;
import com.rcoem.day1demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepo;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentRepo.findAll(), HttpStatus.OK);
    }
}
