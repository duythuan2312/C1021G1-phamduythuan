package com.example.casestudy.dto;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.service.Service;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ContracDto implements Validator {

    private Long id;
    private String contractStartDate;
    private String contractEndDate;
    private double contractDeposit;
    private double totalMoney;

    private Service service;

    private Customer customer;

    private Employee employee;

    public ContracDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
      ContracDto contracDto = (ContracDto) target;
      if ("".equals(contracDto.getContractStartDate())){
          errors.rejectValue("contractStartDate","","Hãy Nhập Dữ liệu VD:23-12-2003");
      }
        if ("".equals(contracDto.getContractEndDate())){
            errors.rejectValue("contractEndDate","","Hãy Nhập Dữ liệu VD:23-12-2003");
        }
        if ("".equals(contracDto.getContractDeposit())){
            errors.rejectValue("contractDeposit","","Hãy Nhập Dữ liệu ");
        }
        if ("".equals(contracDto.getTotalMoney())){
            errors.rejectValue("totalMoney","","Hãy Nhập Dữ liệu ");
        }


    }
}
