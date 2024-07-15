package com.example.orders2.controller;

import com.example.orders2.model.*;
import com.example.orders2.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping(path = "/orderme")
public class MyController {

    @Autowired
    private MyService myService;
    
    // @GetMapping("hello")
    // public String handleRequest() {
    //     return "Hello World!";
    // }
    // --> Testfunktion, die man nutzen kann, bevor man die Models etc. baut


    @PostMapping("/customers")
    public Customer createCustomerWithAddress(@RequestBody Customer customer) {
        return myService.createCustomerWithAddress(customer);
       
    }

    @PostMapping("/{customerId}/orders")
    public Order createOrderForCustomer(@PathVariable Long customerId, @RequestBody Order order) {
        return myService.createOrderForCustomer(customerId, order);
    }

    @GetMapping("/customers")
    public List<Customer> listCustomers() {
    return myService.listCustomers();
    }
}




