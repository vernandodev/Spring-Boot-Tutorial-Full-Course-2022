package com.springboot.springbootstudentsystem.controller;

import com.springboot.springbootstudentsystem.entity.Student;
import com.springboot.springbootstudentsystem.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
}
