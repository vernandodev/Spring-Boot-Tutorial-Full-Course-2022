package com.springboot.springbootstudentsystem.controller;

import com.springboot.springbootstudentsystem.entity.Student;
import com.springboot.springbootstudentsystem.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    public static final String STUDENT = "/student";
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = STUDENT)
    public List<Student> getAllStudent(Student student) {
        return studentService.getAllStudent();
    }
}

