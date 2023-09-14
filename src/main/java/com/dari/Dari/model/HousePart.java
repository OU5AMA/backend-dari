package com.dari.Dari.model;

import com.dari.Dari.model.enums.HousePartEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class HousePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long houseId;
    @Enumerated(EnumType.STRING)
    private HousePartEnum part;
    private int value;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

//    constructor
    public HousePart(HousePartEnum part, int value, Item item) {
        this.part = part;
        this.value = value;
        this.item = item;
    }
}
