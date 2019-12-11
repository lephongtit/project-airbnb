package com.codegym.backend_airbnb.repository;

import com.codegym.backend_airbnb.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);// ktra da ton tai hay chưa
    Boolean existsByEmail(String email);// ktra da ton tai hay chưa
}
