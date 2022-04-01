package com.example.exercise.repository;

import com.example.exercise.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book,Integer> {
}
