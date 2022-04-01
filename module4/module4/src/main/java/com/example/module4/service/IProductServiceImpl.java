package com.example.module4.service;

import com.example.module4.model.Product;
import com.example.module4.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class IProductServiceImpl implements IProductService{

    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void remove(Product product) {
      iProductRepository.delete(product);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Optional<Product> findByID(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable) {
        return iProductRepository.findAllByNameProductContaining(nameProduct,pageable);
    }

    @Override
    public Page<Product> findAllByPriceContaining(Double price, Pageable pageable) {
        return iProductRepository.findAllByPriceContaining(price,pageable);
    }

}
