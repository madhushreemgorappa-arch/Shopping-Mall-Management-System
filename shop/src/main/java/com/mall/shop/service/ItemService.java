package com.mall.shop.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.shop.entity.Item;
import com.mall.shop.repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    // Add Item
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    // View All Items
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    // View Item By ID
    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    // Update Item
    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }

    // Delete Item
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}


