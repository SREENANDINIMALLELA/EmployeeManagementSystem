package com.codeclan.example.employeemanagement;

import com.codeclan.example.employeemanagement.models.Department;
import com.codeclan.example.employeemanagement.models.Employee;
import com.codeclan.example.employeemanagement.models.Project;
import com.codeclan.example.employeemanagement.repositories.DepartmentRepository;
import com.codeclan.example.employeemanagement.repositories.EmployeeManagementRepository;
import com.codeclan.example.employeemanagement.repositories.ProjectRepository;
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
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
		Department javatechnology = new Department("Java");
		Department pythontechnology = new Department("Java");
		departmentRepository.save(javatechnology);
		departmentRepository.save(pythontechnology);
		Employee sree = new Employee("Sreenandini","Mallela",23454,javatechnology);
		Employee uday = new Employee("UdayKiran","Chokkam",12454,pythontechnology);
		Employee ved = new Employee("Kiran","Chokkam",1244,javatechnology);

		employeeManagementRepository.save(sree);
		employeeManagementRepository.save(uday);

		javatechnology.addEmployee(sree);
		pythontechnology.addEmployee(uday);
		Project javaProject = new Project("educationApp",10);
         javaProject.addEmployee(sree);
         javaProject.addEmployee(ved);
		projectRepository.save(javaProject);
         sree.addProject(javaProject);
         ved.addProject(javaProject);



	}
}
