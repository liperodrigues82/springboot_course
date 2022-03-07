package com.felipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
