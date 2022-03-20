package com.example.exercise.repository;

import com.example.exercise.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
//    Page<Blog> searchByTileContaining();
}
