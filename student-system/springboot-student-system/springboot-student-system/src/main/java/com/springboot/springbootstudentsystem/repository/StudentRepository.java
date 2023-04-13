package com.springboot.springbootstudentsystem.repository;

import com.springboot.springbootstudentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
