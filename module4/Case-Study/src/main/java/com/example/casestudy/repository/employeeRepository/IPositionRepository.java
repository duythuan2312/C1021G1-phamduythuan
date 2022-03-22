package com.example.casestudy.repository.employeeRepository;

import com.example.casestudy.model.employee.Position;
import org.springframework.data.repository.CrudRepository;

public interface IPositionRepository extends CrudRepository<Position,Integer> {
}
