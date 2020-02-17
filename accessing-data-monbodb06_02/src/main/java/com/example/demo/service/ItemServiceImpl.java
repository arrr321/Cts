package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Item;
import com.example.demo.Repository.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional
	@Override
	public List<Item> getAllItem() {
		
		return itemRepository.findAll();
	}

	@Transactional
	@Override
	public Item createItem(Item item) {
		
		
		return itemRepository.insert(item) ;
	}

	@Override
	@Transactional
	public Optional<Item> findByitemName(String itemName) {
		
		return itemRepository.findByitemName(itemName);
	}

	@Override
	public void deleteByitemName(String itemName) {
		 itemRepository.deleteByitemName(itemName);
		
		 
	}

	@Override
	public Optional<Item> findByid(String id) {
		
		return itemRepository.findById(id);
	}

	@Override
	public Optional<Item> findById(String itemId) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemId);
	}

}
