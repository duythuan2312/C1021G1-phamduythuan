package com.example.casestudy.service.ServiceService;

import com.example.casestudy.model.service.ServiceType;
import com.example.casestudy.repository.serviceRepository.IServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeImpl implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository iServiceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return (List<ServiceType>) iServiceTypeRepository.findAll();
    }
}
