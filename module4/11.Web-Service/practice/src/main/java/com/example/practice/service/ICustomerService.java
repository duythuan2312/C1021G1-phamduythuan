package com.example.practice.service;

import com.example.practice.model.Customer;

import java.util.Optional;

public interface ICustomerService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    Customer save(Customer customer);

    void remove(Long id);
}
