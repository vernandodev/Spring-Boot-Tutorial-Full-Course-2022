package com.springboot.springbootstudentsystem.service.impl;

import com.springboot.springbootstudentsystem.entity.Student;
import com.springboot.springbootstudentsystem.repository.StudentRepository;
import com.springboot.springbootstudentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
