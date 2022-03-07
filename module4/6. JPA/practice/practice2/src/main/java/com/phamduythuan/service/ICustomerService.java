package com.phamduythuan.service;

import com.phamduythuan.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
