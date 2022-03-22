package com.example.casestudy.service.ServiceService;

import com.example.casestudy.model.service.Service;
import com.example.casestudy.repository.serviceRepository.IServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
@org.springframework.stereotype.Service
public class ServiceImpl implements IService{
    @Autowired
    private IServiceRepository iServiceRepository;

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return iServiceRepository.findAll(pageable);
    }

    @Override
    public void remove(Service service) {
      iServiceRepository.delete(service);
    }

    @Override
    public void save(Service service) {
        iServiceRepository.save(service);

    }

    @Override
    public Optional<Service> findByID(Long id) {
        return iServiceRepository.findById(id);
    }
}
