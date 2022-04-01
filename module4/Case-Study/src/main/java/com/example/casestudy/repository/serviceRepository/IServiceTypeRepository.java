package com.example.casestudy.repository.serviceRepository;

import com.example.casestudy.model.service.ServiceType;
import org.springframework.data.repository.CrudRepository;

public interface IServiceTypeRepository extends CrudRepository<ServiceType,Long> {
}
