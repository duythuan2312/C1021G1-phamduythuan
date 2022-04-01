package com.example.moule4_exam_questions.service.user;

import com.example.moule4_exam_questions.model.user.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
