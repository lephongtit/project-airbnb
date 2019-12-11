package com.codegym.backend_airbnb.repository;

import com.codegym.backend_airbnb.model.House;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {

}
