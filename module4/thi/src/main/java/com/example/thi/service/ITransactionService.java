package com.example.thi.service;

import com.example.thi.model.Customer;
import com.example.thi.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ITransactionService {
    List<Transaction> findAll();
    void save(Transaction transaction);
    void remove(Transaction transaction);
    Optional<Transaction> findById(Long id);
    Page<Transaction> findByNameCustomer(String name, Pageable pageable);
    Page<Transaction> findByNameCustomerAndTranSactionType(String name,String nameTransactionType, Pageable pageable);


}
