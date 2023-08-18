package com.dari.Dari.dao;

import com.dari.Dari.model.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Pictures, Long> {
}
