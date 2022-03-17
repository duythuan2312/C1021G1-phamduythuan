package com.example.exercise1.service;

import com.example.exercise1.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService  {
    List<Category> findAll();
    Optional<Category> findById(Long id);
}
