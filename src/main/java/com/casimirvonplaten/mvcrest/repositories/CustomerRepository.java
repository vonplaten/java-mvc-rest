package com.casimirvonplaten.mvcrest.repositories;

import com.casimirvonplaten.mvcrest.domain.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{


    
    
}