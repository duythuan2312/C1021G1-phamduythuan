package com.example.practice1.service;

import com.example.practice1.model.Customer;
import com.example.practice1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void remove(Long id);
    Page<Customer> finAll(Pageable pageable);
    Page<Customer> findByName(Pageable pageable,String name);
}
