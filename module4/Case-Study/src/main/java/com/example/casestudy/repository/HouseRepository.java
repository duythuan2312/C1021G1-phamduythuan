package com.example.casestudy.repository;

import com.example.casestudy.model.service.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Long> {
}
