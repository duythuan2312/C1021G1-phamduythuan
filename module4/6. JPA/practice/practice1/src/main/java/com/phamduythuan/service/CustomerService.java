package com.phamduythuan.service;

import java.util.List;

public interface CustomerService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
