package com.dari.Dari.controller;

import com.dari.Dari.service.ImageService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ImageServiceTest {

    @Test
    void testReadImageFromFilePositivePath() throws IOException {
//        Arrange
        ImageService imageService = new ImageService();
        Path testImagePath = Paths.get("C:\\Users\\Ousama\\OneDrive\\Images\\little_me.jpg");

//        Act
        byte[] imageBytes = imageService.readImageFromFile(testImagePath.toString());

//        Assert
        assertNotNull(imageBytes);
        assertTrue(imageBytes.length > 0);

    }
}