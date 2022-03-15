package com.example.exercise.service;

import com.example.exercise.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService  {
    List<Blog> findAll();
    void save(Blog blog);
    Optional<Blog> findById(Long id);
    List<Blog> searchByName(String name);
    void remove(Blog blog);
}
