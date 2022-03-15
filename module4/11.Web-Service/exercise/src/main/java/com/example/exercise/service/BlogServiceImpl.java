package com.example.exercise.service;

import com.example.exercise.model.Blog;
import com.example.exercise.model.Category;
import com.example.exercise.repository.IBlogRepository;
import com.example.exercise.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public List<Blog> searchByName(String name) {
        return null;
    }

    @Override
    public void remove(Blog blog) {
        iBlogRepository.delete(blog);
    }
}
