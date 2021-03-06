package com.example.casestudy.dto;

import com.example.casestudy.model.service.RentType;
import com.example.casestudy.model.service.ServiceType;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
@Component
public class ServiceDto  implements Validator {
    private Long id;
    private String serviceName;
    private Integer area;
    private double serviceCost;
    private Integer serviceMaxPeople;
    private String description;
    private double poolArea;
    private Integer numberOfFloors;
    private ServiceType serviceType;
    private RentType rentType;

    public ServiceDto() {
    }

    public ServiceDto(Long id, String serviceName, Integer area, double serviceCost, Integer serviceMaxPeople, String description, double poolArea, Integer numberOfFloors, ServiceType serviceType, RentType rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceType = serviceType;
        this.rentType = rentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Integer getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(Integer serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ServiceDto serviceDto = (ServiceDto) target;
        if ("".equals(serviceDto.getServiceName())){
            errors.rejectValue("serviceName","","H??y Nh???p ????ng D??? Li???u VD:Villa Vippro");
        }
        if ("".equals(serviceDto.getArea())){
            errors.rejectValue("area","","Sai ?????nh D???ng VD:23");
        }
        if ("".equals(serviceDto.getServiceCost())){
            errors.rejectValue("serviceCost","","H??y Nh???p ????ng D??? Li???u ");
        }
        if ("".equals(serviceDto.getServiceMaxPeople())){
            errors.rejectValue("serviceMaxPeople","","H??y Nh???p ????ng D??? Li???u VD:12");
        }
        if ("".equals(serviceDto.getDescription())){
            errors.rejectValue("description","","H??y Nh???p ????ng D??? Li???u ");
        }
        if ("".equals(serviceDto.getPoolArea())){
            errors.rejectValue("poolArea","","H??y Nh???p ????ng D??? Li???u");
        }
        if ("".equals(serviceDto.getNumberOfFloors())){
            errors.rejectValue("numberOfFloors","","H??y Nh???p ????ng D??? Li???u");
        }

    }
}
