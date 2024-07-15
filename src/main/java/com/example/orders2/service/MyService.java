package com.example.orders2.service;

import com.example.orders2.model.*;
import com.example.orders2.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private OrderRepository orderRepository;


    public Customer createCustomerWithAddress(Customer customer) {
              
        return customerRepository.save(customer);
    }

    public Order createOrderForCustomer(Long customerId, Order order) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));

        
       
        order.setCustomer(customer);
        return orderRepository.save(order);

    }

    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }
}
