package com.example.orders2.repository;

import com.example.orders2.model.Customer;
import com.example.orders2.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
    void save(Customer customer);
}
