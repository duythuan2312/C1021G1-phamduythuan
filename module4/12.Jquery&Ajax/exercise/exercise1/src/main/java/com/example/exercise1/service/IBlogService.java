package com.example.exercise1.service;

import com.example.exercise1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService  {
    List<Blog> findAll();
    void save(Blog blog);
    Optional<Blog> findById(Long id);
    List<Blog> searchByName(String name);
    void remove(Blog blog);
    List<Blog> searchBySummary(String summary);
//    List<Blog> offset(Integer quantity);
}
