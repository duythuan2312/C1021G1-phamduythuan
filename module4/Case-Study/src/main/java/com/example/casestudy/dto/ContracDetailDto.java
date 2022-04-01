package com.example.casestudy.dto;

import com.example.casestudy.model.contract.AttachService;
import com.example.casestudy.model.contract.Contract;
import org.springframework.stereotype.Component;

@Component
public class ContracDetailDto {

    private Long id;
    private Integer quantity;


    private Contract contract;
    private AttachService attachService;

    public ContracDetailDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
