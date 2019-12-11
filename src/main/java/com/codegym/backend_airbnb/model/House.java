package com.codegym.backend_airbnb.model;

import javax.persistence.*;

@Entity
@Table(name = "house")

public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHouse;

    private String nameHouse;
    private String categoryHouse;
    private String categoryRoom;
    private String address;
    private Long amountBathRoom;
    private Long amountBedRoom;
    private Long price;
    private String description;
    private Boolean statusHouse;
private String imgUrls;

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrl) {
        this.imgUrls = imgUrl;
    }

    public House() {
    }

    public House(Long idHouse, String nameHouse, String categoryHouse, String categoryRoom, String address, Long amountBathRoom, Long amountBedRoom, Long price, String description,Boolean statusHouse,String imgUrls) {
        this.idHouse = idHouse;
        this.nameHouse = nameHouse;
        this.categoryHouse = categoryHouse;
        this.categoryRoom = categoryRoom;
        this.address = address;
        this.amountBathRoom = amountBathRoom;
        this.amountBedRoom = amountBedRoom;
        this.price = price;
        this.description = description;
        this.statusHouse=statusHouse;
        this.imgUrls=imgUrls;
    }

    public Boolean getStatusHouse() {
        return statusHouse;
    }

    public void setStatusHouse(Boolean statusHouse) {
        this.statusHouse = statusHouse;
    }

    public Long getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Long idHouse) {
        this.idHouse = idHouse;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public String getCategoryHouse() {
        return categoryHouse;
    }

    public void setCategoryHouse(String categoryHouse) {
        this.categoryHouse = categoryHouse;
    }

    public String getCategoryRoom() {
        return categoryRoom;
    }

    public void setCategoryRoom(String categoryRoom) {
        this.categoryRoom = categoryRoom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAmountBathRoom() {
        return amountBathRoom;
    }

    public void setAmountBathRoom(Long amountBathRoom) {
        this.amountBathRoom = amountBathRoom;
    }

    public Long getAmountBedRoom() {
        return amountBedRoom;
    }

    public void setAmountBedRoom(Long amountBedRoom) {
        this.amountBedRoom = amountBedRoom;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
