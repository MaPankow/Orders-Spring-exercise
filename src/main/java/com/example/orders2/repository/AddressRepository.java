package com.example.orders2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orders2.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{}
// Model und Datentyp des primary key <Address, Long>