package com.example.casestudy.service.productService;

import com.example.casestudy.model.product.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
