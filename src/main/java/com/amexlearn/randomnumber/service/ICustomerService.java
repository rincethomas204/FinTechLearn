package com.amexlearn.randomnumber.service;

import com.amexlearn.randomnumber.entity.Customer;
import com.amexlearn.randomnumber.models.CustomerModel;

import java.util.List;

public interface ICustomerService {

    public String  savecustomer(Customer customer);
    public List<Customer> getcustomers();
    public Customer updatecustomer(Customer customer);
    public Customer getcustomerbyid(Long id);

}
