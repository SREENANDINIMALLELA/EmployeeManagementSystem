package com.codeclan.example.employeemanagement.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="employee")
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

//    private List<Project> projects;

    public Employee(String firstName, String lastName,int employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
//       this.projects= new ArrayList<Project>();
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

//    public List<Project> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }
//    public void addProject( Project project ){
//        this.projects.add(project);
//    }
}
