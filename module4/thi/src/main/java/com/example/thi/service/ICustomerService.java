package com.example.thi.service;

import com.example.thi.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void remove(Customer customer);
    Optional<Customer> findById(Long id);

}
