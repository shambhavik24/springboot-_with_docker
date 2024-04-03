package com.example.springbootrestfuldocker.service.impl;

import com.example.springbootrestfuldocker.entity.User;
import com.example.springbootrestfuldocker.repository.UserRepository;
import com.example.springbootrestfuldocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
      User users =  userRepository.save(user);
        return users;
    }

    @Override
    public User findById(Long userId) {
      Optional<User> optional = userRepository.findById(userId);
        return optional.get();
    }

    @Override
    public User updateUser(User user) {
      User existing = userRepository.findById(user.getUserId()).get();
        existing.setFirstName(user.getFirstName());
        existing.setLastName(user.getLastName());
        existing.setEmail(user.getEmail());
        User updatedUser =  userRepository.save(existing);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {userRepository.deleteById(userId);
    }

}
