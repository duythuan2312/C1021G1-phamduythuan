package com.example.casestudy.repository.employeeRepository;

import com.example.casestudy.model.employee.Education;
import org.springframework.data.repository.CrudRepository;

public interface IEducationRepository extends CrudRepository<Education,Integer> {
}
