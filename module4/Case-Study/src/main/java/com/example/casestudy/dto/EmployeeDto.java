package com.example.casestudy.dto;

import com.example.casestudy.model.employee.Division;
import com.example.casestudy.model.employee.Education;
import com.example.casestudy.model.employee.Position;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;

@Component
public class EmployeeDto implements Validator {
    private Long id;
    private String employeeName;
    private String employeeBirthday;
    private String employeeIdCard;
    private double salary;
    private String employeePhone;
    @Email
    private String email;
    private String address;
    private Division division;
    private Education education;
    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    private String positionName;

    public EmployeeDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }



    public Education getEducation() {
        return education;
    }


    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
       EmployeeDto employeeDto = (EmployeeDto) target;
        if ("".equals(employeeDto.getEmployeeName())){
          errors.rejectValue("employeeName","","Hãy Nhập Đúng Dữ Liệu VD:Phạm Duy Thuận");
        }
        if ("".equals(employeeDto.getEmployeeBirthday())){
            errors.rejectValue("employeeBirthday","","Hãy Nhập Đúng Định Dạng VD:1996-12-3");
        }
        if ("".equals(employeeDto.getEmployeeIdCard())){
            errors.rejectValue("employeeIdCard","","Hãy Nhập Đúng Dữ Liệu VD:NV123");
        }
        if ("".equals(employeeDto.getSalary())){
            errors.rejectValue("salary","","Nhập Đúng Mức lương Vd:1500000");
        }
        if ("".equals(employeeDto.getEmployeePhone())){
            errors.rejectValue("employeePhone","","Hãy Nhập Đúng Định Dạng  VD:0702456124");
        }
        if ("".equals(employeeDto.getEmail())){
            errors.rejectValue("email","","Hãy Nhập Đúng Email VD:abc@gmail.com");
        }
        if ("".equals(employeeDto.getAddress())){
            errors.rejectValue("address","","Nhập Đúng Dữ Liệu VD:Quảng Nam");
        }
    }
}
