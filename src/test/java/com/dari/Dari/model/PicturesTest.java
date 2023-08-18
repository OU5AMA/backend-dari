package com.dari.Dari.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


class PicturesTest {
    @Test
    void testSetAndGetImageData() {
        Pictures pictures = new Pictures();
        byte[] imageData = new byte[]{1,2,3};

        pictures.setImageData(imageData);
        assertArrayEquals(imageData, pictures.getImageData());
    }


    @Test
    void testSetAndGetItem() {
        Pictures pictures = new Pictures();
        Item item = mock(Item.class);
        pictures.setItem(item);
        assertEquals(item, pictures.getItem());
    }

}