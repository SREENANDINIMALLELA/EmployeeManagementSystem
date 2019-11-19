package com.codeclan.example.employeemanagement.controllers;

import com.codeclan.example.employeemanagement.models.Project;

import com.codeclan.example.employeemanagement.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
    @GetMapping("{id}")
    // returns if id is present and nul if id not present in the table
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }

    }
