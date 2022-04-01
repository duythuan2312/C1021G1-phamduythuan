package com.example.thi.service;

import com.example.thi.model.Customer;
import com.example.thi.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ICustomerServiceimpl implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
           iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Customer customer) {
        iCustomerRepository.delete(customer);

    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepository.findById(id);
    }
}
