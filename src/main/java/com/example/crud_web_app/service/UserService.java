package com.example.crud_web_app.service;

import java.util.List;
import com.example.crud_web_app.model.User;

public interface UserService {
    List<User> getAllEntities();
    User getEntityById(Long id);
    User createEntity(User entity);
    User updateEntity(Long id, User entity);
    void deleteEntity(Long id);
}
