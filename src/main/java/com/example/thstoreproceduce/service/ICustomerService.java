package com.example.thstoreproceduce.service;

import com.example.thstoreproceduce.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
