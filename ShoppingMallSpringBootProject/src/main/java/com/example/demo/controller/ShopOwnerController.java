package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ShopOwner;
import com.example.demo.service.ShopOwnerService;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {
	@Autowired
    private ShopOwnerService shopOwnerService;

    @PostMapping("/add")
    public ResponseEntity<ShopOwner> addShopOwner(@RequestBody ShopOwner shopOwner) {
        ShopOwner addedShopOwner = shopOwnerService.addShopOwner(shopOwner);
        return new ResponseEntity<>(addedShopOwner, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ShopOwner> updateShopOwner(@RequestBody ShopOwner shopOwner) {
        ShopOwner updatedShopOwner = shopOwnerService.updateShopOwner(shopOwner);
        if (updatedShopOwner != null) {
            return new ResponseEntity<>(updatedShopOwner, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopOwner> searchShopOwner(@PathVariable("id") Integer id) {
        ShopOwner foundShopOwner = shopOwnerService.searchShopOwner(id);
        if (foundShopOwner != null) {
            return new ResponseEntity<>(foundShopOwner, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ShopOwner> deleteShopOwner(@PathVariable Integer id) {
        ShopOwner deletedShopOwner = shopOwnerService.deleteShopOwner(id);
        if (deletedShopOwner != null) {
            return new ResponseEntity<>(deletedShopOwner, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
