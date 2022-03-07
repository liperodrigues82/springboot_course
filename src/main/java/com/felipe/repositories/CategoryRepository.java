package com.felipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
