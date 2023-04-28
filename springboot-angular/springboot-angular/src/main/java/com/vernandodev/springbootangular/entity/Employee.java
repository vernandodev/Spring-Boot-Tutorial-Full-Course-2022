package com.vernandodev.springbootangular.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
@Table(name = "tbl-employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Firstname is required")
    @Column(name = "first_name", nullable = false, length = 155)
    private String firstName;
    @NotEmpty(message = "Lastname is required")
    @Column(name = "last_name", nullable = false, length = 155)
    private String lastName;
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String emailId;
}
