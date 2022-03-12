package com.example.exercise.repository;

import com.example.exercise.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBookRepository extends PagingAndSortingRepository<Book,Integer> {
}
