package com.example.casestudy.service.Customer;

import com.example.casestudy.model.customer.CustomerType;
import com.example.casestudy.repository.customerRepository.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService{
        @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return (List<CustomerType>) iCustomerTypeRepository.findAll();
    }
}
