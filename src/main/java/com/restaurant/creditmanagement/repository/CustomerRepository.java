package com.restaurant.creditmanagement.repository;

import com.restaurant.creditmanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    boolean existsByPhoneNumber(String phoneNumber);
}
