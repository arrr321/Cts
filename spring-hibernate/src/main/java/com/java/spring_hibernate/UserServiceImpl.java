package com.java.spring_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.spring_hibernate.entity.UserDetail;

@Service("service")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO dao;
	
	
	
	
	

	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}






	@Override
	@Transactional
	public UserDetail createUser(UserDetail user) {
	
		return dao.createuser(user);
	}






	

	
}
