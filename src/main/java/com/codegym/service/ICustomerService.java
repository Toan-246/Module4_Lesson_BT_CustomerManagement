package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void create(Customer customer);

    Customer findById(int id);

    void update (int id, Customer customer);

    void remote (int id);
}
