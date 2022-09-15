package com.example.thstoreproceduce.repo;

import com.example.thstoreproceduce.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
