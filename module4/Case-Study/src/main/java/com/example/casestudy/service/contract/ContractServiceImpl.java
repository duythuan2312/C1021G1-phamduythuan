package com.example.casestudy.service.contract;

import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.repository.contractRepository.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;


    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }

    @Override
    public void remove(Contract contract) {
        iContractRepository.delete(contract);

    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);

    }

    @Override
    public Optional<Contract> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Page<Contract> findByName(Pageable pageable, String name) {
        return null;
    }
}
