package com.dari.Dari.dao;

import com.dari.Dari.model.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Pictures, Long> {
}
