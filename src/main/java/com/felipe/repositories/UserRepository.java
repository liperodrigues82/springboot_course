package com.felipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
