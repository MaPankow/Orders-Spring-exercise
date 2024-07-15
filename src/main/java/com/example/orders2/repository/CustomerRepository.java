package com.example.orders2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orders2.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
