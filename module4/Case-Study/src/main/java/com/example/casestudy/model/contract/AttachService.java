package com.example.casestudy.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String attachServiceName;
    private double attachServiceCost;
    private String attachServiceUnit;
    private String attachServiceStatus;
    @OneToMany(mappedBy = "attachService",cascade = CascadeType.ALL)
    private Set<ContracDetail> contracDetails;

    public AttachService() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public String getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(String attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }

    public Set<ContracDetail> getContracDetails() {
        return contracDetails;
    }

    public void setContracDetails(Set<ContracDetail> contracDetails) {
        this.contracDetails = contracDetails;
    }
}
