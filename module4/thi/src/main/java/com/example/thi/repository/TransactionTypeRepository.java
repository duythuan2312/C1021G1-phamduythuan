package com.example.thi.repository;

import com.example.thi.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeRepository extends JpaRepository<TransactionType,Long> {
}
