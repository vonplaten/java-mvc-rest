package com.casimirvonplaten.mvcrest.bootstrap;

import com.casimirvonplaten.mvcrest.domain.Customer;
import com.casimirvonplaten.mvcrest.repositories.CustomerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * BootStrapData
 */
@Component
public class BootStrapData implements CommandLineRunner{

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data");
        this.customerRepository.save(new Customer("Kalle", "Svensson"));
        this.customerRepository.save(new Customer("Peter", "Andersson"));
        this.customerRepository.save(new Customer("Sten", "Persson"));

        System.out.println("Saved " + this.customerRepository.count() + " Customers.");
    }




    
}