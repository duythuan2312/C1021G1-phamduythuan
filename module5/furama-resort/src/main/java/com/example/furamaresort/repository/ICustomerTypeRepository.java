package com.example.furamaresort.repository;

import com.example.furamaresort.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Long> {
}
