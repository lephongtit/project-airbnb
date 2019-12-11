package com.codegym.backend_airbnb.controller;

import com.codegym.backend_airbnb.model.House;
import com.codegym.backend_airbnb.service.HouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/house")
public class GuestController {

    @Autowired
    private HouseService houseService;

@GetMapping
    public ResponseEntity<List<House>> getListHouse(){
    List<House>houses=houseService.findAll();
    if (houses.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
    return new ResponseEntity<>(houses, HttpStatus.OK);
}
    @PostMapping()
    public ResponseEntity<Void> createHouse(@RequestBody House house){
        houseService.save(house);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<House> editHouse(@PathVariable("id") Long id, @RequestBody House house) {
        Optional<House> originHouse = houseService.findById(house.getIdHouse());
        if(originHouse.isPresent()){
            originHouse.get().setNameHouse(house.getNameHouse());
            originHouse.get().setCategoryHouse(house.getCategoryHouse());
            originHouse.get().setStatusHouse(house.getStatusHouse());
            originHouse.get().setDescription(house.getDescription());
            originHouse.get().setAmountBedRoom(house.getAmountBedRoom());
            originHouse.get().setCategoryRoom(house.getCategoryRoom());
            originHouse.get().setPrice(house.getPrice());
            originHouse.get().setAddress(house.getAddress());
            originHouse.get().setAmountBathRoom(house.getAmountBathRoom());
            originHouse.get().setImgUrls(house.getImgUrls());
            houseService.save(originHouse.get());
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<House> findById(@PathVariable Long id){
        Optional<House>house=houseService.findById(id);
        if(house.isPresent()){
                return new ResponseEntity<House>(house.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<House>(HttpStatus.NOT_FOUND );
        }
    }

}
