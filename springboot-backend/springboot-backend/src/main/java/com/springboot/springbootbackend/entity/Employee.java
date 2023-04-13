package com.springboot.springbootbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data // lombok pengganti getter and setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", length = 150, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 150, nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
}
