package com.example.thi.service;

import com.example.thi.model.Customer;
import com.example.thi.model.Transaction;
import com.example.thi.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TransactionServiceImpl implements ITransactionService{

    @Autowired
    private ITransactionRepository iTransactionRepository;

    @Override
    public List<Transaction> findAll() {
        return (List<Transaction>) iTransactionRepository.findAll();
    }

    @Override
    public void save(Transaction transaction) {
        iTransactionRepository.save(transaction);

    }

    @Override
    public void remove(Transaction transaction) {
        iTransactionRepository.delete(transaction);

    }

    @Override
    public Optional<Transaction> findById(Long id) {
        return iTransactionRepository.findById(id);
    }


    @Override
    public Page<Transaction> findByNameCustomer(String name, Pageable pageable) {
        return iTransactionRepository.findAllByCustomer_NameCustomerContaining(name,pageable);
    }

    @Override
    public Page<Transaction> findByNameCustomerAndTranSactionType(String name, String nameTransactionType, Pageable pageable) {
        return iTransactionRepository.findAllByCustomer_NameContainingAndTransactionType_Name(name,nameTransactionType,pageable);
    }
}
