package com.example.exercise.service;

import com.example.exercise.model.Blog;
import com.example.exercise.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService  {
    List<Category> findAll();
    Optional<Category> findById(Long id);
}
