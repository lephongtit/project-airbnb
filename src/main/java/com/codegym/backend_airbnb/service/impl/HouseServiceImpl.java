package com.codegym.backend_airbnb.service.impl;


import com.codegym.backend_airbnb.model.House;
import com.codegym.backend_airbnb.repository.HouseRepository;
import com.codegym.backend_airbnb.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class HouseServiceImpl implements HouseService {
@Autowired
    private HouseRepository houseRepository;

    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<House> findById(Long id) {
        return houseRepository.findById(id);
    }

    @Override
    public void save(House house) {
houseRepository.save(house);
    }

    @Override
    public void delete(House house) {
houseRepository.delete(house);
    }
}
