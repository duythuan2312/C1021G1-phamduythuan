package com.example.exercise.repository;

import com.example.exercise.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends PagingAndSortingRepository<Book,Integer> {
}
