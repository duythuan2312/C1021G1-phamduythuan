package com.example.exercise.repository;

import com.example.exercise.model.BookSavings;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookSavingsRepository extends PagingAndSortingRepository<BookSavings,Integer> {
}
