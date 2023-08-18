package com.dari.Dari.model;

import com.dari.Dari.model.enums.BuildingTypes;
import com.dari.Dari.model.HousePart;
import com.dari.Dari.model.enums.ListOfCities;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @Enumerated(EnumType.STRING)
    private ListOfCities city;
    private Double price;
    private Boolean favorite;
    @Enumerated(EnumType.STRING)
    private BuildingTypes state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<Pictures> pictures;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<HousePart> houseParts;

//    Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ListOfCities getCity() {
        return city;
    }

    public void setCity(ListOfCities city) {
        this.city = city;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public BuildingTypes getState() {
        return state;
    }

    public void setState(BuildingTypes state) {
        this.state = state;
    }

    public List<Pictures> getPictures() {
        return pictures;
    }

    public void setPictures(List<Pictures> pictures) {
        this.pictures = pictures;
    }
}
