package com.felipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
