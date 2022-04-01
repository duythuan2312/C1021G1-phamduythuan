package com.example.module4.repository;

import com.example.module4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
    Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable);
    Page<Product> findAllByPriceContaining(Double price, Pageable pageable);
}
