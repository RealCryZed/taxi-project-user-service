package com.realcryzed.user.service;

import com.realcryzed.user.model.User;
import com.realcryzed.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Integer id) {
        return userRepository.findUserByUserId(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
