package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ShopOwner;
import com.example.demo.repository.IShopOwnerRepository;

@Service
public class ShopOwnerService {
	 @Autowired
	    private IShopOwnerRepository shopOwnerRepository;

	    public ShopOwner addShopOwner(ShopOwner shopOwner) {
	        return shopOwnerRepository.save(shopOwner);
	    }

	    public ShopOwner updateShopOwner(ShopOwner shopOwner) {
	        if (shopOwnerRepository.existsById(shopOwner.getId())) {
	            return shopOwnerRepository.save(shopOwner);
	        }
	        return null; // or throw an exception indicating that the shop owner doesn't exist
	    }

	    public ShopOwner searchShopOwner(Integer id) {
	        Optional<ShopOwner> optionalShopOwner = shopOwnerRepository.findById(id);
	        return optionalShopOwner.orElse(null);
	    }

	    public ShopOwner deleteShopOwner(Integer id) {
	        if (shopOwnerRepository.existsById(id)) {
	            ShopOwner deletedShopOwner = shopOwnerRepository.findById(id).orElse(null);
	            shopOwnerRepository.deleteById(id);
	            return deletedShopOwner;
	        }
	        return null; // or throw an exception indicating that the shop owner doesn't exist
	    }

}
