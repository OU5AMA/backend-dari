package com.dari.Dari;

public enum HousePart {
    BEDROOMS(0),
    BATHROOMS(0),
    KITCHEN(0),
    LIVING_ROOM(0);

    private final int value;
    HousePart(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
