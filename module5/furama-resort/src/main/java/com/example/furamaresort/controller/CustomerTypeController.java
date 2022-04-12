package com.example.furamaresort.controller;

import com.example.furamaresort.model.Customer;
import com.example.furamaresort.model.CustomerType;
import com.example.furamaresort.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class CustomerTypeController {

    @Autowired
    private ICustomerTypeService  iCustomerTypeService;

    @GetMapping("/customer-type")
    public ResponseEntity<Iterable<CustomerType>> findAllCustomer() {
        List<CustomerType> customerList = iCustomerTypeService.findAll();
        if (customerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

}
