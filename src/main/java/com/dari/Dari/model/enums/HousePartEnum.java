package com.dari.Dari.model.enums;

public enum HousePartEnum {
    BEDROOMS(0),
    BATHROOMS(0),
    KITCHEN(0),
    LIVING_ROOM(0);

    private final int value;
    HousePartEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
