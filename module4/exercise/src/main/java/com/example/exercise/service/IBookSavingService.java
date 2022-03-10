package com.example.exercise.service;

import com.example.exercise.model.BookSavings;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookSavingService {
    Page<BookSavings> findAll(Pageable pageable);
    void delete(BookSavings bookSavings);
    void save(BookSavings bookSavings);

}
