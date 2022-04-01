package com.example.casestudy.repository.employeeRepository;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    Page<Employee> findAllByEmployeeNameContaining(String nameEmployee, Pageable pageable);
}
