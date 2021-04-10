package com.amexlearn.randomnumber.repository;

import com.amexlearn.randomnumber.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customerrepository extends JpaRepository<Customer, Long> {

}
