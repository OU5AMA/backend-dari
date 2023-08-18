package com.dari.Dari.enums;

import com.dari.Dari.model.enums.HouseStateEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseStateEnumTest {

    @Test
    void HouseStatevalues() {
        HouseStateEnum[] values = HouseStateEnum.values();
        assertEquals(4, values.length);

        assertEquals(HouseStateEnum.AVAILABLE, values[0]);
        assertEquals(HouseStateEnum.SOLD, values[1]);
        assertEquals(HouseStateEnum.RESERVED, values[2]);
        assertEquals(HouseStateEnum.UNDER_CONTRACT, values[3]);
    }


}