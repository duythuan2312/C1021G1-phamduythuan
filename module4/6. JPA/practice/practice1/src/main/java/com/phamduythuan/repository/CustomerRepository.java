package com.phamduythuan.repository;

import java.util.List;

public interface CustomerRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
