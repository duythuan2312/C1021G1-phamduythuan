package com.example.exercise.service;

import com.example.exercise.model.BookSavings;
import com.example.exercise.repository.BookSavingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IBookSavingServiceImpl implements IBookSavingService {
    @Autowired
    private BookSavingsRepository bookSavingsRepository;
    @Override
    public Page<BookSavings> findAll(Pageable pageable) {
        return bookSavingsRepository.findAll(pageable);
    }

    @Override
    public void delete(BookSavings bookSavings) {
        bookSavingsRepository.delete(bookSavings);
    }

    @Override
    public void save(BookSavings bookSavings) {
        bookSavingsRepository.save(bookSavings);
    }
}
