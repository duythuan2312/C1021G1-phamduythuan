package com.example.casestudy.service.ServiceService;

import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IService {
    Page<Service> findAll(Pageable pageable);
    void remove(Service service);
    void save(Service service);
    Optional<Service> findByID(Long id);

    Page<Service> findByName(Pageable pageable, String nameService);
}
