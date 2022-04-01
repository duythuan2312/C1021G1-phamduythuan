package com.example.thi.dto;

public class CustomerDto {
    private Long id;
    private String codeCustomer;
    private String nameCustomer;
    private String phone;
    private String email;

    public CustomerDto() {
    }

    public CustomerDto(Long id, String codeCustomer, String nameCustomer, String phone, String email) {
        this.id = id;
        this.codeCustomer = codeCustomer;
        this.nameCustomer = nameCustomer;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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
}
