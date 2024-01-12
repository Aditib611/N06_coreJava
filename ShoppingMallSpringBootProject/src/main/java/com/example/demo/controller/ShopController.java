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

import com.example.demo.entity.Employee;
import com.example.demo.entity.Item;

import com.example.demo.entity.Shop;
import com.example.demo.service.ShopService;

@RestController
@RequestMapping("/shops")
public class ShopController {


	    @Autowired
	    private ShopService shopService;

	    @PostMapping("/add")
	    public ResponseEntity<Shop> addShop(@RequestBody Shop shop) {
	        Shop addedShop = shopService.addShop(shop);
	        return new ResponseEntity<>(addedShop, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Shop> updateShopById(@PathVariable Integer id, @RequestBody Shop updatedShop) {
	        Shop updatedShopResult = shopService.updateShopById(id, updatedShop);
	        return new ResponseEntity<>(updatedShopResult, HttpStatus.OK);
	    }
	    @GetMapping("/search/{id}")
	    public ResponseEntity<Shop> searchShopById(@PathVariable Integer id) {
	        Shop foundShop = shopService.searchShopById(id);
	        if (foundShop != null) {
	            return new ResponseEntity<>(foundShop, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PostMapping("/addEmployee")
	    public ResponseEntity<Boolean> addEmployee(@RequestBody Employee employee) {
	        boolean result = shopService.addEmployee(employee);
	        return new ResponseEntity<>(result, HttpStatus.CREATED);
	    }

	    @PutMapping("/updateEmployee")
	    public ResponseEntity<Boolean> updateEmployee(@RequestBody Employee employee) {
	        boolean result = shopService.updateEmployee(employee);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Boolean> deleteShop(@PathVariable Integer id) {
	        boolean result = shopService.deleteShop(id);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }

	    @PostMapping("/addItem")
	    public ResponseEntity<Item> addItem(@RequestBody Item item) {
	        Item addedItem = shopService.addItem(item);
	        return new ResponseEntity<>(addedItem, HttpStatus.CREATED);
	    }
	    

}
