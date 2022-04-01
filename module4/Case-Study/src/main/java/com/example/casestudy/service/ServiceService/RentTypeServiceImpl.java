package com.example.casestudy.service.ServiceService;

import com.example.casestudy.model.service.RentType;
import com.example.casestudy.repository.serviceRepository.IRentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeServiceImpl implements IRentTypeService {
    @Autowired
    private IRentTypeRepository iRentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return (List<RentType>) iRentTypeRepository.findAll();
    }
}
