package com.codeclan.example.employeemanagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="departments")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="depName")
    private String depName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(String depName) {
        this.depName = depName;
        this.employees=new  ArrayList<Employee>();
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
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

