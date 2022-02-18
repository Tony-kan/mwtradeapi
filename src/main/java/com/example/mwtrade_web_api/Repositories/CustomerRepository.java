package com.example.mwtrade_web_api.Repositories;

import com.example.mwtrade_web_api.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository
extends JpaRepository <Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.customerId=?1")
    Optional<Customer> findById(Long customerId);

    @Query("SELECT c FROM Customer c WHERE  c.email=?1")
    Optional<Customer> findByEmail(String email);

    @Query("SELECT c FROM Customer c WHERE c.customerId=?1")
    Customer findCustomerByCId (Long customerId);

}
