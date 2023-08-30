package com.dari.Dari.model;

import com.dari.Dari.model.enums.BuildingTypesEnum;
import com.dari.Dari.model.enums.ListOfCitiesEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ItemId;
    private String name;
    private String address;
    @Enumerated(EnumType.STRING)
    private ListOfCitiesEnum city;
    private Double price;
    private Boolean favorite;
    @Enumerated(EnumType.STRING)
    private BuildingTypesEnum state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<Pictures> pictures;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<HousePart> houseParts;

    public Item(String name,
                String address,
                ListOfCitiesEnum city,
                Double price,
                Boolean favorite,
                BuildingTypesEnum state,
                List<Pictures> pictures,
                List<HousePart> houseParts) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.price = price;
        this.favorite = favorite;
        this.state = state;
        this.pictures = pictures;
        this.houseParts = houseParts;
    }
}
