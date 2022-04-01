package com.example.casestudy.repository.productRepository;


import com.example.casestudy.model.product.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
}
