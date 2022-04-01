package com.example.module4.service;

import com.example.module4.model.ProductType;
import com.example.module4.repository.IProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements IProductTypeService{

    @Autowired
    private IProductTypeRepository iProductTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return (List<ProductType>) iProductTypeRepository.findAll();
    }
}
