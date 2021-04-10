package com.amexlearn.randomnumber.service.impl;

import com.amexlearn.randomnumber.entity.Customer;
import com.amexlearn.randomnumber.repository.Customerrepository;
import com.amexlearn.randomnumber.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private Customerrepository customerrepository;

    @Override
    public String savecustomer(Customer customer) {
        Customer createdCustomer = customerrepository.save(customer);
        return createdCustomer.getId().toString();
    }

    @Override
    public List<Customer> getcustomers() {
        return customerrepository.findAll();
    }

    @Override
    public Customer updatecustomer(Customer customer) {
        return customerrepository.save(customer);
    }

    @Override
    public Customer getcustomerbyid(Long id) {
        Optional<Customer> customerOptional = customerrepository.findById(id);

        return null != customerOptional ? customerOptional.get() : null;
    }
}
