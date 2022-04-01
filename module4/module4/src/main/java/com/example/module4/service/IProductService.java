package com.example.module4.service;

import com.example.module4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);
    void remove(Product product);
    void save(Product product);
    Optional<Product> findByID(Long id);
    Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable);
    Page<Product> findAllByPriceContaining(Double price, Pageable pageable);

}
