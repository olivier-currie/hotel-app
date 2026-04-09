package com.hotel.hotel_app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.hotel_app.models.Customer;
import com.hotel.hotel_app.repositories.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerR;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerR = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerR.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerR.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerR.save(customer);
    }

    public void deleteCustomer(String customerID) {
        customerR.deleteById(customerID);
    }
}
