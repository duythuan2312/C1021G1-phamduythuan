package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.Position;
import com.example.casestudy.repository.employeeRepository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IPositionServiceImpl implements IPositionService {
    @Autowired
    private IPositionRepository iPositionRepository;
    @Override
    public List<Position> findAll() {
        return (List<Position>) iPositionRepository.findAll();
    }
}
