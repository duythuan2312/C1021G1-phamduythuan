package com.example.thi.service;

import com.example.thi.model.TransactionType;
import com.example.thi.repository.TransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionTypeServiceImpl implements TransactionTypeService{
    @Autowired
    private TransactionTypeRepository transactionTypeRepository;
    @Override
    public List<TransactionType> findAll() {
        return transactionTypeRepository.findAll();
    }
}
