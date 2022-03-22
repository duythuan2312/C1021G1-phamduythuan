package com.example.casestudy.model.employee;

import com.example.casestudy.model.employee.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String positionName;
    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employees;


    public Position(Long id, String positionName, Set<Employee> employees) {
        this.id = id;
        this.positionName = positionName;
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Position() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
