package com.dari.Dari.enums;

import com.dari.Dari.model.enums.BuildingTypesEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTypesEnumTest {

    @Test
    void testEnumValues() {
        BuildingTypesEnum[] values = BuildingTypesEnum.values();
        assertEquals(3, values.length);

    }

}