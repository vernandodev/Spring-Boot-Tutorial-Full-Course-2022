package com.vernandodev.springbootangular.controller;

import com.vernandodev.springbootangular.entity.Employee;
import com.vernandodev.springbootangular.repository.EmployeeRepository;
import com.vernandodev.springbootangular.response.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employee
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    // create employee rest api
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // get employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        return ResponseEntity.ok(employee);
    }
}
