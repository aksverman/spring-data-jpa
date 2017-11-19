package com.rudra.aks.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudra.aks.data.bo.CustomerBO;

public interface CustomerRepository extends JpaRepository<CustomerBO, Integer> {

}
