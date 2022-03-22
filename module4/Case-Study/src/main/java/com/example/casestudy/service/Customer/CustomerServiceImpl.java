package com.example.casestudy.service.Customer;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.repository.customerRepository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerServiceImpl  implements CustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public void remove(Customer customer) {
        iCustomerRepository.delete(customer);

    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);

    }

    @Override
    public Optional<Customer> findByID(Long id) {
        return iCustomerRepository.findById(id);
    }
}
