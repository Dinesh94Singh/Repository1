package com.softlabsna.spring.service;


import com.softlabsna.spring.dao.CustomerDAO;
import com.softlabsna.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers(){

        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }

    @Override
    @Transactional
    public Customer getCustomers(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }
}
