package com.assignment.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Employee;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<com.assignment.model.Employee> getAllEmployees() {
        // Hardcoded employee list for demonstration
        return Arrays.asList(
                new Employee(101, "John Doe", 50000),
                new Employee(102, "Alice Smith", 60000),
                new Employee(103, "Bob Johnson", 55000)
        );
    }
}

