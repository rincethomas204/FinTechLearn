package com.amexlearn.randomnumber.service;

import com.amexlearn.randomnumber.entity.Customer;
import com.amexlearn.randomnumber.models.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customerservice {

    @Autowired
    private ICustomerService customerService;
    private static final String pin = "1234";


    public String deposit(Customer customer){

        String message = "";
        Customer dbcustomer  = customerService.getcustomerbyid(customer.getId());

        if (dbcustomer.getPin().equals(customer.getPin())){

            if(null != dbcustomer) {
                if(customer.getBalance() > 0.0){
                    dbcustomer.setBalance(dbcustomer.getBalance() + customer.getBalance());
                    customerService.updatecustomer(dbcustomer);
                    message =  "Deposit success , new balance :" +dbcustomer.getBalance() ;
                }
                else message = "Customer doesnt exist";
            }
            return message;
        } else {
            throw new RuntimeException("Invalid Pin");
            //return "Invalid PIN";
        }


    }
}
