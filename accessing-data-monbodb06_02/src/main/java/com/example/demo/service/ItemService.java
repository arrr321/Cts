package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Item;

public interface ItemService { 
	
	
	
	public List<Item> getAllItem();
	public Item createItem(Item item);
	public Optional<Item> findByitemName(String itemName);
	public void deleteByitemName(String itemName);
	public Optional<Item> findByid(String id);
	public Optional<Item> findById(String itemId);

}
