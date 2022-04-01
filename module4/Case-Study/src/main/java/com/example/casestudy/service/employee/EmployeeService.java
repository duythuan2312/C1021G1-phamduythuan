package com.example.casestudy.service.employee;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    void remove(Employee employee);
    void save(Employee employee);
    Optional<Employee> findByID(Long id);

    Page<Employee> findByName(Pageable pageable, String nameEmployee);


}
