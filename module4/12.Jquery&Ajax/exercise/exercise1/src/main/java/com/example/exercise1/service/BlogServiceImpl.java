package com.example.exercise1.service;

import com.example.exercise1.model.Blog;
import com.example.exercise1.repository.IBlogRepository;
import com.example.exercise1.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll() {
        return  iBlogRepository.findAll();
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

    @Override
    public List<Blog> searchBySummary(String summary) {
        return iBlogRepository.searchBySummaryContaining(summary);
    }
//
//    @Override
//    public List<Blog> offset(Integer quantity) {
//        return iBlogRepository.offset(quantity);
//    }
}
