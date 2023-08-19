package com.dari.Dari.dao;

import com.dari.Dari.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
