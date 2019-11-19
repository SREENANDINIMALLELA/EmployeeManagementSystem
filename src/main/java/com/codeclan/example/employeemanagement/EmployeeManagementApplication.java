package com.codeclan.example.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@Repository
public class EmployeeManagementApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
