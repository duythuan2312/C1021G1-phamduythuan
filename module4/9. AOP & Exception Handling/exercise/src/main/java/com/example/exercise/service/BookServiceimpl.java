package com.example.exercise.service;

import com.example.exercise.model.Book;
import com.example.exercise.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceimpl implements IBookServiceRepository{
    @Autowired
    IBookRepository iBookRepository;
    @Override
    public Page<Book> findAll(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);

    }
    @Override
    public void remove(Book book) {
        iBookRepository.delete(book);
    }

    @Override
    public Optional<Book> findById(int id) {
        return iBookRepository.findById(id);
    }

    @Override
    public List<Book> findAlll() {
        return (List<Book>) iBookRepository.findAll();
    }
}
