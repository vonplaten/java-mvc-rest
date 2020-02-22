package com.casimirvonplaten.mvcrest.services;

import java.util.List;

import com.casimirvonplaten.mvcrest.domain.Customer;

/**
 * CustomerService
 */
public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
}