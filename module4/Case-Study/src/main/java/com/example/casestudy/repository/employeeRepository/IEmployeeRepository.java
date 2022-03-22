package com.example.casestudy.repository.employeeRepository;

import com.example.casestudy.model.employee.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
}
