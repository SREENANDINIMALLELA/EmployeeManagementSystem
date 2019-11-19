package com.codeclan.example.employeemanagement.repositories;

import com.codeclan.example.employeemanagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeManagementRepository  extends JpaRepository<Employee, Long> {
}
