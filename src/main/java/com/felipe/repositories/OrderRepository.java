package com.felipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
