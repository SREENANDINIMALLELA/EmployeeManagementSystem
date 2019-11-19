package com.codeclan.example.employeemanagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="firstName")
    private String firstName ;

    @Column(name="lastName")
    private String lastName ;

    @Column(name="employeeNumber")
    private  int employeeNumber;

    @JsonIgnoreProperties("employees")
    @ManyToOne
    @JoinColumn(name = "dep_id",nullable=false)
    private Department department;


    @JsonIgnoreProperties("employees")
    @ManyToMany
    @JoinTable(
            name = "projects_Employees",
            joinColumns = {
            @JoinColumn(name = "employee_id",
                    nullable = false,
                    updatable = false
            )
    },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "project_id",
                            nullable = false,
                            updatable = false
                    )
            }

    )
    private List<Project> projects;

    public Employee(String firstName, String lastName,int employeeNumber,Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department=department;
        this.projects= new ArrayList<Project>();
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    public void addProject( Project project ){
        this.projects.add(project);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
