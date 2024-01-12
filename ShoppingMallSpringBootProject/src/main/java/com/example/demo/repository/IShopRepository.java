package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Shop;

@Repository
public interface IShopRepository extends JpaRepository<Shop, Integer> {
    // Additional custom queries can be defined here
}