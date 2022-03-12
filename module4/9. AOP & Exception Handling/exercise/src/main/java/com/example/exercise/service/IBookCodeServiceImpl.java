package com.example.exercise.service;

import com.example.exercise.model.BookCode;
import com.example.exercise.repository.IBookCodeRepository;
import com.example.exercise.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IBookCodeServiceImpl implements IBookCodeService{
    @Autowired
    private IBookCodeRepository iBookCodeRepository;
    @Override
    public List<BookCode> findAll() {
        return iBookCodeRepository.findAll();
    }
}
