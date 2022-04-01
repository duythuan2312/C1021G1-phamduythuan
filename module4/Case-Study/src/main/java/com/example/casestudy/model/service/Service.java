package com.example.casestudy.model.service;

import com.example.casestudy.model.contract.Contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private Integer area;
    private double serviceCost;
    private Integer serviceMaxPeople;
    private String description;
    private double poolArea;
    private Integer numberOfFloors;
    @ManyToOne
    @JoinColumn(name = "servicetype_id", referencedColumnName = "id")
    private ServiceType serviceType;
    @ManyToOne
    @JoinColumn(name = "renttype_id", referencedColumnName = "id")
    private RentType rentType;

    @OneToMany(mappedBy = "service")
     private Set<Contract> contracts;

    public Set<Contract> getContracts() {
        return contracts;
    }



    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Service(Long id, String serviceName, Integer area, double serviceCost, Integer serviceMaxPeople, String description, double poolArea, Integer numberOfFloors, ServiceType serviceType, RentType rentType, Set<Contract> contracts) {

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
        this.contracts = contracts;
    }

    public Service() {
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
}
