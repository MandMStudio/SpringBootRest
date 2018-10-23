package com.nemo.rest.repository;

import com.nemo.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer}class
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}