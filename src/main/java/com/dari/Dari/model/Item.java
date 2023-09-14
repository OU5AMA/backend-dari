package com.dari.Dari.model;

import com.dari.Dari.model.enums.BuildingTypesEnum;
import com.dari.Dari.model.enums.ListOfCitiesEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String address;
    private int yearBuilt;
    private int lotSize;
    private int squareFootage;
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
    private UtilitiesAndServices utilitiesAndServices;

}
