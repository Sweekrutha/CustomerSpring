package com.Springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Entity.Customer;
import com.Springboot.Repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository customerrepository;
	
	@PostMapping("/addcustomer")
	public String saveCustomer(@RequestBody Customer ct)	
	{
		customerrepository.save(ct);
		return "User added successfully::"+ct.getId();
	}
	@GetMapping("/customers")
	public List<Customer>getCustomers()
	{
		return customerrepository.findAll();
	}
	@GetMapping("/findCustomer/{id}")
	public Optional<Customer>getCustomer(@PathVariable Integer id)
	{
		return customerrepository.findById(id);
	}
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable Integer id)
	{
		customerrepository.deleteById(id);
		return "Deleted Customer Successfully";
	}	

}

