package com.example.exercise.repository;

import com.example.exercise.model.BookCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;


@Transactional
public interface IBookCodeRepository extends JpaRepository<BookCode,Integer> {
}
