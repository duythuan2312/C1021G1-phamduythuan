package com.example.exercise.service;

import com.example.exercise.model.Blog;
import com.example.exercise.model.Category;
import com.example.exercise.repository.IBlogRepository;
import com.example.exercise.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable) ;
    }

    @Override
    public void save(Blog blog) {
        Category category = iCategoryRepository.findById(blog.getCategory().getId()).orElse(null);
        blog.setCategory(category);
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).get();
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
