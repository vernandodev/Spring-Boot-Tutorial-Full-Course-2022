package com.springboot.springbootbackend.services;

import com.springboot.springbootbackend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee employee, Long id);
    void deleteEmployee(Long id);
}
