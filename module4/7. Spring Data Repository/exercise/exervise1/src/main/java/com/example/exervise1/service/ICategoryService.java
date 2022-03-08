package com.example.exervise1.service;

import com.example.exervise1.model.Category;
import com.example.exervise1.repository.ICategoryRepository;

import java.util.List;

public interface ICategoryService  {
    List<Category> findAll();
}
