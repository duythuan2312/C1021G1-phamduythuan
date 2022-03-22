package com.example.casestudy.repository.employeeRepository;

import com.example.casestudy.model.employee.Division;
import org.springframework.data.repository.CrudRepository;

public interface IDivisionRepository extends CrudRepository<Division,Integer> {
}
