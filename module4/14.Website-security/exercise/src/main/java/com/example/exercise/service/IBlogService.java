package com.example.exercise.service;

import com.example.exercise.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService  {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    Blog findById(int id);
    List<Blog> searchByName(String name);
    void remove(Blog blog);
}
