package com.amexlearn.randomnumber.controller;

import com.amexlearn.randomnumber.entity.Customer;
import com.amexlearn.randomnumber.models.CustomerModel;
import com.amexlearn.randomnumber.service.Customerservice;
import com.amexlearn.randomnumber.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Customercontroller {

    @Autowired
    ICustomerService customerService;

    @Autowired
    Customerservice customerservice;

    @GetMapping("/getallcustomers")
    public List<Customer> getallcustomers() {

        //ResponseEntity<List<Customer>> stringResponseEntity = new ResponseEntity<String>(, HttpStatus.ACCEPTED);
        return customerService.getcustomers();
    }


    @PostMapping("/createcustomer")
    public ResponseEntity<?> createcustomer(@RequestBody Customer customer) {
        String response = "";

        response = customerService.savecustomer(customer);
        ResponseEntity<String> stringResponseEntity = new ResponseEntity<String>(response, HttpStatus.ACCEPTED);


        return stringResponseEntity;
    }


    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@RequestBody Customer customer) {
        String response = "";

        response = customerservice.deposit(customer);
        ResponseEntity<String> stringResponseEntity = new ResponseEntity<String>(response, HttpStatus.ACCEPTED);


        return stringResponseEntity;
    }
}
