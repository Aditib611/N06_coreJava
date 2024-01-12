package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.IUserRepository;
@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    // Add a new User
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    // Update an existing User
    public User updateUser(User user) {
        if (userRepository.existsById(user.getId())) {
            return userRepository.save(user);
        }
        return null; // or throw an exception indicating that the user doesn't exist
    }

    // Delete a User by ID
    public User deleteUser(Integer id) {
        if (userRepository.existsById(id)) {
            User deletedUser = userRepository.findById(id).orElse(null);
            userRepository.deleteById(id);
            return deletedUser;
        }
        return null; // or throw an exception indicating that the user doesn't exist
    }

   /*Login method
    public User login(User user) {
        // Implement your logic for user authentication here
        // This is a placeholder, and you should replace it with your actual authentication logic

        // For demonstration purposes, let's assume we simply return the user object if it exists
        Optional<User> optionalUser = userRepository.findByUsernameAndPassword(user.getName(), user.getPassword());
        return optionalUser.orElse(null);
    }

    /*Logout method
    public boolean logOut() {
        // Implement your logout logic here
        // This is a placeholder, and you should replace it with your actual logout logic
        return true; // For demonstration purposes, always return true
    }*/
}
