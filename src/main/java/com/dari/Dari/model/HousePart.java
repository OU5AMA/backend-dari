package com.dari.Dari.model;

import com.dari.Dari.model.enums.HousePartEnum;
import jakarta.persistence.*;

@Entity
public class HousePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private HousePartEnum part;

    private int value;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

//    Constructors, Getter, Setters
    public HousePart() {
    }

    public HousePart(Long id, HousePartEnum part, int value, Item item) {
        this.id = id;
        this.part = part;
        this.value = value;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HousePartEnum getPart() {
        return part;
    }

    public void setPart(HousePartEnum part) {
        this.part = part;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
