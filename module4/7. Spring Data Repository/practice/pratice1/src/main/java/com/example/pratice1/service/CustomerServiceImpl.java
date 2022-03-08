package com.example.pratice1.service;

import com.example.pratice1.model.Customer;
import com.example.pratice1.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;


    @Override
    public List<Customer> findAll() {
        return (List<Customer>) iCustomerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.deleteById(id);

    }

    @Override
    public Page<Customer> finAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }
}
