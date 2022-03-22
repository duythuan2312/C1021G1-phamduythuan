package com.example.casestudy.model.employee;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String divisionName;
    @OneToMany(mappedBy = "division",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employees;
    public Division() {
    }

    public Division(Long id, String divisionName, Set<Employee> employees) {
        this.id = id;
        this.divisionName = divisionName;
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}
