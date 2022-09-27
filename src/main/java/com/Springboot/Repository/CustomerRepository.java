package com.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}

