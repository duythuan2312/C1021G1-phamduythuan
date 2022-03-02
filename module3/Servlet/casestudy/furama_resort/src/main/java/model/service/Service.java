package model.service;

public class Service {
    private int serviceId;
    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;
    private String standardRom;
    private String descriptionOtherConveniece;
    private double poolArea;
    private int numberOfFloors;

    private int rentTypeId;
    private int serviceTypeId;


    public Service(int serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRom, String descriptionOtherConveniece, double poolArea, int numberOfFloors, int rentTypeId, int serviceTypeId) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRom = standardRom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
    }

    public Service(String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRom, String descriptionOtherConveniece, double poolArea, int numberOfFloors, int rentTypeId, int serviceTypeId) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRom = standardRom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
    }

    public Service(int serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRom, String descriptionOtherConveniece, double poolArea, int numberOfFloors) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRom = standardRom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRom() {
        return standardRom;
    }

    public void setStandardRom(String standardRom) {
        this.standardRom = standardRom;
    }

    public String getDescriptionOtherConveniece() {
        return descriptionOtherConveniece;
    }

    public void setDescriptionOtherConveniece(String descriptionOtherConveniece) {
        this.descriptionOtherConveniece = descriptionOtherConveniece;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }
}
