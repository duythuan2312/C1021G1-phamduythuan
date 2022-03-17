package com.example.exercise1.repository;

import com.example.exercise1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Long> {
    List<Blog> searchBySummaryContaining(String summary);
//    List<Blog> offset(Integer quantity);

}
