package com.dari.Dari.dao;

import com.dari.Dari.model.HousePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousePartRepository extends JpaRepository<HousePart, Long> {
}
