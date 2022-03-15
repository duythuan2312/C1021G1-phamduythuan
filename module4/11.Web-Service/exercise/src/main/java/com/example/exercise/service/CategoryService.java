package com.example.exercise.service;

import com.example.exercise.model.Category;
import com.example.exercise.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return (List<Category>) iCategoryRepository.findAll();
    }
}
