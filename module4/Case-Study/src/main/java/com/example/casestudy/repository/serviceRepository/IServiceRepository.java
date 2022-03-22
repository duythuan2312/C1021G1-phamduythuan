package com.example.casestudy.repository.serviceRepository;

import com.example.casestudy.model.service.Service;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IServiceRepository extends PagingAndSortingRepository<Service,Long> {
}
