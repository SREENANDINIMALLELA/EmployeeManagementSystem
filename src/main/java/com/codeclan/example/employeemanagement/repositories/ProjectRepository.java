package com.codeclan.example.employeemanagement.repositories;

import com.codeclan.example.employeemanagement.models.Employee;
import com.codeclan.example.employeemanagement.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
