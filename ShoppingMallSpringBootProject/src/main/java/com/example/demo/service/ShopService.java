package com.example.demo.service;


import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Item;
import com.example.demo.entity.Shop;
import com.example.demo.repository.IEmployeeRepository;
import com.example.demo.repository.IItemRepository;
import com.example.demo.repository.IShopRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShopService {
	@Autowired
    private IShopRepository shopRepository;

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    private IItemRepository itemRepository;

    public Shop addShop(Shop shop) {
        try {
            // Additional logic if needed
            return shopRepository.save(shop);
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            throw e; // Re-throw the exception to be handled by the controller
        }
    }
    @Transactional
    public Shop updateShopById(Integer id, Shop updatedShop) {
        // Check if the shop with the given ID exists
        Optional<Shop> existingShopOptional = shopRepository.findById(id);

        if (existingShopOptional.isPresent()) {
            Shop existingShop = existingShopOptional.get();

            // Merge changes manually
            existingShop.setShopCategory(updatedShop.getShopCategory());
            existingShop.setShopName(updatedShop.getShopName());
            existingShop.setCustomers(updatedShop.getCustomers());
            existingShop.setShopStatus(updatedShop.getShopStatus());
            existingShop.setLeaseStatus(updatedShop.getLeaseStatus());

            // Save the updated shop
            return shopRepository.save(existingShop);
        }

        return null; // or throw an exception indicating that the shop doesn't exist
    }
    public Shop searchShopById(Integer id) {
        Optional<Shop> optionalShop = shopRepository.findById(id);
        return optionalShop.orElse(null);
    }

    public Boolean addEmployee(Employee employee) {
        // Additional logic if needed
        employeeRepository.save(employee);
        return true;
    }

    public Boolean updateEmployee(Employee employee) {
        // Check if the employee with the given ID exists
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return true;
        }
        return false; // or throw an exception indicating that the employee doesn't exist
    }

    public Boolean deleteShop(Integer id) {
        // Check if the shop with the given ID exists
        if (shopRepository.existsById(id)) {
            shopRepository.deleteById(id);
            return true;
        }
        return false; // or throw an exception indicating that the shop doesn't exist
    }

    public Item addItem(Item item) {
        // Additional logic if needed
        return itemRepository.save(item);
    }

}
