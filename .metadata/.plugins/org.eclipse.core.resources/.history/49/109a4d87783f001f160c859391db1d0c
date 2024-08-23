package com.konarch.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.konarch.model.User;
import com.konarch.repository.UserRepository;

import java.util.List;
import java.util.Optional;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User updateUser(int id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found for this id :: " + id));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setHotos(userDetails.getHotos());
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found for this id :: " + id));
        userRepository.delete(user);
    }
}