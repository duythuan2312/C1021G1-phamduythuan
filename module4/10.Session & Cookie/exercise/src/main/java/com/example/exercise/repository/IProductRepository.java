package com.example.exercise.repository;

import com.example.exercise.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository  extends PagingAndSortingRepository<Product,Long> {
}
