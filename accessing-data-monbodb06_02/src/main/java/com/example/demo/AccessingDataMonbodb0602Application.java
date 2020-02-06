package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.ItemRepository;

@SpringBootApplication
public class AccessingDataMonbodb0602Application implements CommandLineRunner {
	
	
	private ItemRepository itemRepository;
	
	
	@Autowired
	public AccessingDataMonbodb0602Application(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	public static void main(String[] args)  {
		SpringApplication.run(AccessingDataMonbodb0602Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
