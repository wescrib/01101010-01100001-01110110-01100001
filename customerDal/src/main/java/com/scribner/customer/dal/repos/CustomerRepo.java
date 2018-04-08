package com.scribner.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.scribner.customer.dal.entities.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

}
