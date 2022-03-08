package com.example.exervise1.repository;

import com.example.exervise1.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
}
