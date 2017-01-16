package com.softlabsna.spring.dao;

import java.util.List;

import com.softlabsna.spring.entity.Customer;

public interface CustomerDAO {

	// IOC and Dependency Injection
	List<Customer> getCustomers();
	void saveCustomer(Customer theCustomer);
    Customer getCustomer(int theId);
    void deleteCustomer(int theId);
}

