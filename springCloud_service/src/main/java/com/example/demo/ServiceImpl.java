package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	private UserDao dao;
	
	

	public ServiceImpl() {
		super();
		
	}



	@Override
	@Transactional
	public User createUser(User user) {
		
		return dao.save(user);
	}



	@Override
	@Transactional
	public List<User> findAll() {
		
		return dao.findAll();
	}



	



	@Override
	@Transactional
	public Optional<User> findbyId(Integer id) {
		
		return dao.findById(id);
	}



//	@Override
//	public Optional<User> findByEmail(String publicEmail) {
//		
//		return dao.fin;
//	}



	

}
