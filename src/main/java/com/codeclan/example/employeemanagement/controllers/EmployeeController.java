package com.codeclan.example.employeemanagement.controllers;

import com.codeclan.example.employeemanagement.models.Employee;
import com.codeclan.example.employeemanagement.repositories.EmployeeManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value="/employees")
public class EmployeeController {
    @Autowired
    EmployeeManagementRepository employeeManagementRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeManagementRepository.findAll();
    }
    @GetMapping("{id}")
    // returns if id is present and nul if id not present in the table
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeManagementRepository.findById(id);
    }
}
