package com.example.casestudy.repository;

import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
}
