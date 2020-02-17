package com.example.demo.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Item;
import com.example.demo.Repository.ItemRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	
	private ItemRepository itemRepository;

	
	@Autowired
	public RestController(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}
	
	@GetMapping("/item")
	public List<Item> getAllItem()
	{
		return itemRepository.findAll();
		
	}
	
	@PostMapping("/item")
	public Item createItem(@RequestBody Item item)
	{
		item.setDate(LocalDate.now());
		return itemRepository.insert(item);
		
		
		
	}
	@GetMapping("get/{bookName}")
	public Optional<Item> findByitemName(@PathVariable String bookName)
	{
		return itemRepository.findByitemName(bookName);
		
		
	}
	@DeleteMapping("del/{bookName}")
	public void deleteByitemName(@PathVariable String bookName)
	{
		itemRepository.deleteByitemName(bookName);
	}
	
	@GetMapping("id/{id}")
	public Optional<Item> findByid(@PathVariable String id)
	
	
	{
		return itemRepository.findByid(id);
		
	}
	@GetMapping("ssn/{itemId}")
	public Optional<Item> findById(@PathVariable String itemId)
	
	
	{
		return itemRepository.findByid(itemId);
		
	}
}
