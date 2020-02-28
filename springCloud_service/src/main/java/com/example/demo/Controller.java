package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private ServiceImpl service;
	

	
	@Autowired
	public Controller() {
		super();
		
	}




	@PostMapping("/User")
	public User createUser(@RequestBody User user) {
		return service.createUser(user);
		
	}
	
	@GetMapping("/User")
	public List<User> findAll(){
		return service.findAll();
		
	}
	
	
	@GetMapping("/User/{ id }")
	public Optional<User> findbyId(@PathVariable Integer id ){
		return service.findbyId(id);
		
		
	}

}
