package com.example.demo.controller;

import java.util.Collections;


import java.util.List;
import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;

import com.example.demo.service.UserService;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/users")
public class UserController {
	 @Autowired
	    private UserService userService;

	 @PostMapping("/register")
	 public ResponseEntity<?> registerUser(@RequestBody User user) {
	     try {
	         User registeredUser = userService.registerUser(user);
	         return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
	     } catch (Exception e) {
	         // Handle the exception based on your application's needs
	         // For example, you might want to return an error response
	         return new ResponseEntity<>("Error during user registration: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	     }
	 }


	 /* @PostMapping("/login")
	    public ResponseEntity<User> loginUser(@RequestBody User user) {
	        // Implement login logic, e.g., validation, checking credentials, etc.
	        User loggedInUser = userService.loginUser(user.getName(), user.getPassword());
	        return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
	    }*/
	    @PostMapping("/login")
	    public ResponseEntity<?> loginUser(@RequestBody User user) {
	        try {
	            // Validate credentials and generate a token if successful
	            String token = userService.loginUser(user.getUsername(), user.getPassword());
	            //return ResponseEntity.ok(Collections.singletonMap("token", token));
	            return ResponseEntity.ok(token); // Return the generated token directly
	        } catch (AuthenticationException e) {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        }
	    }
	    
	    
	    @PatchMapping("/update/{userId}")
	    public ResponseEntity<User> updateUser(@PathVariable int userId, @RequestBody User updatedUserData) {
	        User updatedUser = userService.updateUser(userId, updatedUserData);

	        if (updatedUser != null) {
	            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	        
	    @PostMapping("/add")
	    public ResponseEntity<User> addUser(@RequestBody User user) {
	        User addedUser = userService.addUser(user);
	        return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
	    }

	   

	    @GetMapping("/{userId}")
	    public ResponseEntity<User> getUserById(@PathVariable int userId) {
	        User user = userService.getUserById(userId);
	        if (user != null) {
	            return new ResponseEntity<>(user, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = userService.getAllUsers();
	        return new ResponseEntity<>(users, HttpStatus.OK);
	    }

	    @DeleteMapping("/{userId}")
	    public ResponseEntity<String> deleteUser(@PathVariable int userId) {
	        userService.deleteUser(userId);
	        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
	    }
	    
	    @PostMapping("/logout")
	    public ResponseEntity<String> logoutUser(@RequestHeader("Authorization") String token) {
	        try {
	            // Extract the token from the Authorization header (assuming the header format is "Bearer <token>")
	            String jwtToken = token.substring(7);

	            // Call the logout method in the UserService
	            userService.logoutUser(jwtToken);

	            return new ResponseEntity<>("User logged out successfully", HttpStatus.OK);
	        } catch (Exception e) {
	            // Handle exceptions (e.g., invalid token format, token not provided)
	            return new ResponseEntity<>("Error logging out user: " + e.getMessage(), HttpStatus.BAD_REQUEST);
	        }
	    }
}
