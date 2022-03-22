package com.example.casestudy.service.user;

import com.example.casestudy.model.user.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
