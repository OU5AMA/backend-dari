package com.dari.Dari.controller;

import com.dari.Dari.dao.ItemRepository;
import com.dari.Dari.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;
//    Define Endpoints for CRUD operations

//  Get all items
    @GetMapping
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

//    Get an item
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long itemId){
        Optional<Item> item = itemRepository.findById(itemId);
        return  item.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

//    create an item
    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemRepository.save(item);
    }


//  update an item
    @PostMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Long id, @RequestBody Item updatedItem){
        if (!itemRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        updatedItem.setId(id);
        Item savedItem = itemRepository.save(updatedItem);
        return ResponseEntity.ok(savedItem);
    }

//    Delete an Item
    @DeleteMapping("/{id}")
    public ResponseEntity<Item> deleteItem(@PathVariable Long id){
        if (!itemRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        itemRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
