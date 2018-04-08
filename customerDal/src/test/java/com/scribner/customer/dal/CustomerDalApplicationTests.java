package com.scribner.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.scribner.customer.dal.entities.Customer;
import com.scribner.customer.dal.repos.CustomerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDalApplicationTests {
	
	@Autowired
	private CustomerRepo cr;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("William");
		customer.setEmail("scribner.william@gmail.com");
		
		cr.save(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		Customer c = cr.findOne(1l);
		System.out.println(c);
	}
	
	@Test
	public void testUpdateCustomerById() {
		Customer c = cr.findOne(1l);
		c.setEmail("newEmail@email.com");
		cr.save(c);
	}
	
	@Test
	public void testDeleteCus() {
		cr.delete(1l);
	}

}
