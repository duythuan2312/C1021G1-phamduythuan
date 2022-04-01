package com.example.thi.repository;

import com.example.thi.model.Customer;
import com.example.thi.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.Past;
import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction,Long> {
    Page<Transaction> findAllByCustomer_NameCustomerContaining(String nameCustomer,Pageable pageable);
    Page<Transaction> findAllByCustomer_NameContainingAndTransactionType_Name(String nameCustomer,String transactionType, Pageable pageable);

}
