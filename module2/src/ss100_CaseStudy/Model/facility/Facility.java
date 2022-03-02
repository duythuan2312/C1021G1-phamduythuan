package ss100_CaseStudy.Model.facility;

import java.util.Arrays;

public abstract class Facility {
    private String idService;
    private String serviceName;
    private double usableArea;
    private int rentalCosts;
    private int MaximumNumberofPeople;
    private String pertiveType;

    public Facility() {
    }

    public Facility(String idService, String serviceName, double usableArea, int rentalCosts, int maximumNumberofPeople, String pertiveType) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        MaximumNumberofPeople = maximumNumberofPeople;
        this.pertiveType = pertiveType;
    }

    public Facility(String idService) {
        this.idService = idService;
    }


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberofPeople() {
        return MaximumNumberofPeople;
    }

    public void setMaximumNumberofPeople(int maximumNumberofPeople) {
        MaximumNumberofPeople = maximumNumberofPeople;
    }

    public String getPertiveType() {
        return pertiveType;
    }

    public void setPertiveType(String pertiveType) {
        this.pertiveType = pertiveType;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", MaximumNumberofPeople=" + MaximumNumberofPeople +
                ", pertiveType='" + pertiveType + '\'' +
                '}';
    }
}
