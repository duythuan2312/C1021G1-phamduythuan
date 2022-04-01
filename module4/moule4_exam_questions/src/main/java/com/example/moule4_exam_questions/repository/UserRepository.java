package com.example.moule4_exam_questions.repository;


import com.example.moule4_exam_questions.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);
}
