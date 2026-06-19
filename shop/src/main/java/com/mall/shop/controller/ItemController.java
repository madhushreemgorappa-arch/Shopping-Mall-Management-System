package com.mall.shop.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mall.shop.entity.Item;
import com.mall.shop.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Add Item
    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    // View All Items
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    // View Item By ID
    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    // Update Item
    @PutMapping
    public Item updateItem(@RequestBody Item item) {
        return itemService.updateItem(item);
    }

    // Delete Item
    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return "Item Deleted Successfully";
    }
}


