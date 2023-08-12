package com.dari.Dari.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Double price;
    private Boolean favorite;
    @Enumerated(EnumType.STRING)
    private ItemState state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")

    private List<Pictures> pictures;
    @ManyToMany
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

    public ItemState getState() {
        return state;
    }

    public void setState(ItemState state) {
        this.state = state;
    }

    public List<Pictures> getPictures() {
        return pictures;
    }

    public void setPictures(List<Pictures> pictures) {
        this.pictures = pictures;
    }

    public List<HousePart> getHouseParts() {
        return houseParts;
    }

    public void setHouseParts(List<HousePart> houseParts) {
        this.houseParts = houseParts;
    }
}
