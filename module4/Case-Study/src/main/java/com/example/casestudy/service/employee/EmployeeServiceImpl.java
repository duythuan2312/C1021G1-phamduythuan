package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.repository.employeeRepository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    @Override
    public void remove(Employee employee) {
        iEmployeeRepository.delete(employee);
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findByID(Long id) {
      return iEmployeeRepository.findById(id);
    }

    @Override
    public Page<Employee> findByName(Pageable pageable, String nameEmployee) {
        return iEmployeeRepository.findAllByEmployeeNameContaining(nameEmployee,pageable);
    }
}
