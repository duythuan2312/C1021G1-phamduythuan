package com.example.practice.repository;

import com.example.practice.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
