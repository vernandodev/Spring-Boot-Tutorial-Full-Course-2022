package com.vernandodev.springbootangular.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl-employee")
public class Employee {
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

    // contructor default
    public Employee() {

    }

    // constructor
    public Employee(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
