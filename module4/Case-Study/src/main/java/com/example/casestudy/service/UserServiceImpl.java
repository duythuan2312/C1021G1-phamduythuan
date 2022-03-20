package com.example.casestudy.service;

import com.example.casestudy.model.User;
import com.example.casestudy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
private UserRepository userRepository;

    @Override
    public List<com.example.casestudy.model.User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return null;
    }
}
