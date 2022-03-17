package com.example.practice2.repository;

import com.example.practice2.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface ISmartphoneRepository extends CrudRepository<Smartphone,Long> {
}
