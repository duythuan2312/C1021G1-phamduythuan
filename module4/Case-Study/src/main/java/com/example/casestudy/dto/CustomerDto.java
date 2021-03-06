package com.example.casestudy.dto;

import com.example.casestudy.model.customer.CustomerType;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class CustomerDto implements Validator {
    private Long id;
    private String customerName;
    private String customerBirthday;
    private Boolean gender;
    private String customerIdCard;
    private String phone;
    private String email;
    private String address;
    private CustomerType customerType;

    public CustomerDto(Long id, String customerName, String customerBirthday, Boolean gender, String customerIdCard, String phone, String email, String address, CustomerType customerType) {
        this.id = id;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.gender = gender;
        this.customerIdCard = customerIdCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public CustomerDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
      CustomerDto customerDto = (CustomerDto) target;
        if ("".equals(customerDto.getCustomerName())){
            errors.rejectValue("customerName","","H??y Nh???p ????ng D??? Li???u VD:Ph???m Duy Thu???n");
        }
        if ("".equals(customerDto.getCustomerBirthday())){
            errors.rejectValue("customerBirthday","","H??y Nh???p ????ng ?????nh D???ng VD:1996-12-3");
        }
        if ("".equals(customerDto.getGender())){
            errors.rejectValue("gender","","H??y Nh???p ????ng D??? Li???u  VD:Nam | N???");
        }
        if ("".equals(customerDto.getCustomerIdCard())){
            errors.rejectValue("customerIdCard","","Nh???p ????ng M???c l????ng Vd:KH-178");
        }
        if ("".equals(customerDto.getPhone())){
            errors.rejectValue("phone","","H??y Nh???p ????ng ?????nh D???ng  VD:0702456124");
        }
        if ("".equals(customerDto.getEmail())){
            errors.rejectValue("email","","H??y Nh???p ????ng Email VD:abc@gmail.com");
        }
        if ("".equals(customerDto.getAddress())){
            errors.rejectValue("address","","Nh???p ????ng D??? Li???u VD:Qu???ng Nam");
        }


    }
}
