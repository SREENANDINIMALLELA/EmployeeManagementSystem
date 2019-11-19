package com.codeclan.example.employeemanagement.controllers;

import com.codeclan.example.employeemanagement.models.Department;
import com.codeclan.example.employeemanagement.models.Employee;
import com.codeclan.example.employeemanagement.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value="/departments")

public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    @GetMapping("{id}")
    // returns if id is present and nul if id not present in the table
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
