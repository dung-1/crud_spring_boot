package com.example.crud_web_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud_web_app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
