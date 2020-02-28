package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface Service {
	public User createUser( User user);
	public List<User> findAll();
//	public Optional<User> findByEmail(String publicEmail);
	public Optional<User> findbyId(Integer id );

}
