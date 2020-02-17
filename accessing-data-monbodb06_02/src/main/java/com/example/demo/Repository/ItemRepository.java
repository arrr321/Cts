package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
	public Optional<Item> findByitemName(String itemName);
	public void deleteByitemName(String itemName);
	public Optional<Item> findByid(String id);
	public Optional<Item> findById(String itemId);


}
