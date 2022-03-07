package com.phamduythuan.repository;

import com.phamduythuan.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
