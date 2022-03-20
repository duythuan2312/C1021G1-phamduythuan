package com.example.exercise.service;

import com.example.exercise.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
