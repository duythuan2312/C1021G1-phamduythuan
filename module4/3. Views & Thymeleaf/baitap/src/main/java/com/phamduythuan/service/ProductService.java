package com.phamduythuan.service;

import com.phamduythuan.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void create(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

     List<Product> search(String name);

}
