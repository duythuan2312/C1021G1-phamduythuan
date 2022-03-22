package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.Division;
import com.example.casestudy.repository.employeeRepository.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionServiceImpl implements IDivisionService{
    @Autowired
    private IDivisionRepository iDivisionRepository;
    @Override
    public List<Division> findAll() {
        return (List<Division>) iDivisionRepository.findAll();
    }
}
