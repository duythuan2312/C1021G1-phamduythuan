package com.example.practice1.repository;

import com.example.practice1.model.Customer;
import com.example.practice1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);

}
