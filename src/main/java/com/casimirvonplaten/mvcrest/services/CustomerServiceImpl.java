package com.casimirvonplaten.mvcrest.services;

import java.util.List;
import java.util.Optional;

import com.casimirvonplaten.mvcrest.domain.Customer;
import com.casimirvonplaten.mvcrest.repositories.CustomerRepository;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository rep){
        this.repository = rep;
    }

    @Override
    public Customer findCustomerById(Long id) {
        Optional<Customer> op = this.repository.findById(id);
        if (op.isPresent()){
            return op.get();
        } else {
            return new Customer();
        }
    }

    @Override
    public List<Customer> findAllCustomers() {
        return this.repository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return this.repository.save(customer);
    }

    
}