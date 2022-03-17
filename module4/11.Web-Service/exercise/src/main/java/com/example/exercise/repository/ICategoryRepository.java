package com.example.exercise.repository;

import com.example.exercise.model.Category;
import com.example.exercise.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryRepository extends PagingAndSortingRepository<Category,Long> {

}
