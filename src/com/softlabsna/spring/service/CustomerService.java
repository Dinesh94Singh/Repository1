package com.softlabsna.spring.service;

import com.softlabsna.spring.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    void saveCustomer(Customer theCustomer);
    Customer getCustomers(int theId);
    void deleteCustomer(int theId);
}
