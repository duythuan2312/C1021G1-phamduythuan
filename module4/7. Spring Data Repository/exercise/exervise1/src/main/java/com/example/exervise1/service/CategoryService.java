package com.example.exervise1.service;

import com.example.exervise1.model.Category;
import com.example.exervise1.repository.ICategoryRepository;
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
