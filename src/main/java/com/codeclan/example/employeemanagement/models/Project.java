package com.codeclan.example.employeemanagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name ;
    @Column(name="durationOfProject")
    private int durationOfProject;


    @JsonIgnoreProperties("projects")
    @ManyToMany
    @JoinTable(
            name = "projects_Employees",
            joinColumns = {
                    @JoinColumn(name = "project_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "employee_id",
                            nullable = false,
                            updatable = false
                    )
            }

    )
    private List<Employee> employees;

    public Project(String name, int durationOfProject) {
        this.name = name;
        this.durationOfProject = durationOfProject;
        this.employees= new ArrayList<Employee>();
    }

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationOfProject() {
        return durationOfProject;
    }

    public void setDurationOfProject(int durationOfProject) {
        this.durationOfProject = durationOfProject;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
