package com.example.casestudy.service.contract;

import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);
    void remove(Contract contract);
    void save(Contract contract);
    Optional<Contract> findByID(Long id);
    Page<Contract> findByName(Pageable pageable,String name);
}
