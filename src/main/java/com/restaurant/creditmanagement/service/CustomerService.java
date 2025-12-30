package com.restaurant.creditmanagement.service;

import com.restaurant.creditmanagement.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    void deleteCustomer(Long id);

    void saveCustomer(Customer customer);
}
