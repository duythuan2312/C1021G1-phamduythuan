package com.example.casestudy.repository.customerRepository;

import com.example.casestudy.model.customer.CustomerType;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerTypeRepository extends CrudRepository<CustomerType,Long> {
}
