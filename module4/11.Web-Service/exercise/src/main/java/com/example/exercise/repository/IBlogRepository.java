package com.example.exercise.repository;

import com.example.exercise.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogRepository extends CrudRepository<Blog,Long> {
//    Page<Blog> searchByTileContaining();
}
