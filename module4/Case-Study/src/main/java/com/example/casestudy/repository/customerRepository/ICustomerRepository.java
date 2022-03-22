package com.example.casestudy.repository.customerRepository;

import com.example.casestudy.model.customer.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
