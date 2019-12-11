package com.codegym.backend_airbnb.service;

import com.codegym.backend_airbnb.model.House;


import java.util.List;
import java.util.Optional;

public interface HouseService {
List<House>findAll();
Optional<House> findById(Long id);
void save(House house);
void delete(House house);
}
