package com.example.springbootrestfuldocker.repository;

import com.example.springbootrestfuldocker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
