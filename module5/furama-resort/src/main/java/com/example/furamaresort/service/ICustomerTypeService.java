package com.example.furamaresort.service;

import com.example.furamaresort.model.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
