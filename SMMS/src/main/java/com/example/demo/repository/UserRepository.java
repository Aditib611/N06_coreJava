package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


	boolean existsByUsername(String username);

	User findByUsernameAndPassword(String username, String password);

	User findByUsername(String username);

	}


