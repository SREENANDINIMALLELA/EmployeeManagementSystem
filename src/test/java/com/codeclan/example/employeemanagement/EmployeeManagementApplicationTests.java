package com.codeclan.example.employeemanagement;

import com.codeclan.example.employeemanagement.models.Employee;
import com.codeclan.example.employeemanagement.repositories.EmployeeManagementRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeManagementApplicationTests {
	@Autowired
   EmployeeManagementRepository employeeManagementRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
		Employee sree = new Employee("Sreenandini","Mallela",23454);
		employeeManagementRepository.save(sree);
	}
}
