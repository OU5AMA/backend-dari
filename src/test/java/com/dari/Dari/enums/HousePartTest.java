package com.dari.Dari.enums;

import com.dari.Dari.model.enums.HousePartEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HousePartTest {

    @Test
    void testHousePartValuesAndValues() {
        assertEquals(4, HousePartEnum.values().length);
        assertEquals(HousePartEnum.BEDROOMS, HousePartEnum.values()[0]);
        assertEquals(HousePartEnum.BATHROOMS, HousePartEnum.values()[1]);
        assertEquals(HousePartEnum.KITCHEN, HousePartEnum.values()[2]);
        assertEquals(HousePartEnum.LIVING_ROOM, HousePartEnum.values()[3]);
    }

    @Test
    void testHousePartValuesAndValuesLength() {
        HousePartEnum[] housePartEnums = HousePartEnum.values();
        assertEquals(4, housePartEnums.length);
    }

    @Test
    void testHousePartGetValue() {
        assertEquals(0, HousePartEnum.BEDROOMS.getValue());
        assertEquals(0, HousePartEnum.BATHROOMS.getValue());
        assertEquals(0, HousePartEnum.KITCHEN.getValue());
        assertEquals(0, HousePartEnum.LIVING_ROOM.getValue());

    }
}