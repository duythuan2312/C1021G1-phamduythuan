package com.example.casestudy.service.Customer;

import com.example.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void remove(Customer customer);
    void save(Customer customer);
    Optional<Customer> findByID(Long id);

}
