package com.example.module4.repository;

import com.example.module4.model.ProductType;
import org.springframework.data.repository.CrudRepository;

public interface IProductTypeRepository extends CrudRepository<ProductType,Long> {
}
