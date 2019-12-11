package com.codegym.backend_airbnb.repository;

import com.example.airbnb.model.Role;
import com.example.airbnb.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
