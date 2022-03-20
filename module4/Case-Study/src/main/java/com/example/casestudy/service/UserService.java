package com.example.casestudy.service;

import com.example.casestudy.model.User;

import java.util.List;

public interface UserService {
    List<com.example.casestudy.model.User> findAll();
    User findById(Long id);
}
