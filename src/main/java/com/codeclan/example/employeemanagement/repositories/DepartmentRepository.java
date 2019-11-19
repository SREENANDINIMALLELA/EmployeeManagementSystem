package com.codeclan.example.employeemanagement.repositories;

import com.codeclan.example.employeemanagement.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

