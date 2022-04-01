package com.example.casestudy.repository.serviceRepository;

import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IServiceRepository extends PagingAndSortingRepository<Service,Long> {
    Page<Service> findAllByServiceNameContaining(String serviceName, Pageable pageable);
}
