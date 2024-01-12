package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.IItemRepository;

@Service
public class ItemService {

    @Autowired
    private IItemRepository itemRepository;

    public Item addItem(Item item) {
        // Additional logic if needed
        return itemRepository.save(item);
    }

    public Item updateItem(Item item) {
        // Check if the item with the given ID exists
        if (itemRepository.existsById(item.getId())) {
            // Additional logic if needed
            return itemRepository.save(item);
        }
        return null; // or throw an exception indicating that the item doesn't exist
    }

    public Item searchItem(int id) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        return optionalItem.orElse(null);
    }

    public boolean deleteItem(int id) {
        // Check if the item with the given ID exists
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        }
        return false; // or throw an exception indicating that the item doesn't exist
    }
}
