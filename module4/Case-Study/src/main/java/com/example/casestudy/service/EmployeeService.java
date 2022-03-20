package com.example.casestudy.service;

import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    void remove(Employee employee);
    void save(Employee employee);
    Optional<Employee> findByID(int id);


}
