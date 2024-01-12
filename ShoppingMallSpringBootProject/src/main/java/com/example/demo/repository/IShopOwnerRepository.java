package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Shop;
import com.example.demo.entity.ShopOwner;

public interface IShopOwnerRepository extends JpaRepository<ShopOwner, Integer>  {

}
