package com.example.springbootrestfuldocker.service;

import com.example.springbootrestfuldocker.entity.User;

public interface UserService {

    public User createUser(User user);

    public User findById(Long userId);

    public User updateUser(User user);

    public void deleteUser(Long userId);
}
