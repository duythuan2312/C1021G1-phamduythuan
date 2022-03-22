package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.Education;
import com.example.casestudy.repository.employeeRepository.IEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationServiceImpl implements IEducationService{
    @Autowired
    private IEducationRepository educationRepository;

    @Override
    public List<Education> findAll() {
        return (List<Education>) educationRepository.findAll();
    }
}
