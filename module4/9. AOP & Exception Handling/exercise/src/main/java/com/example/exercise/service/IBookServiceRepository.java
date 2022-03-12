package com.example.exercise.service;

import com.example.exercise.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBookServiceRepository {
    Page<Book> findAll(Pageable pageable);
    void save(Book book);
    void remove(Book book);
    Optional<Book> findById(int id);
    List<Book> findAlll();
}
