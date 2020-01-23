package com.java.spring_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.spring_hibernate.entity.UserDetail;

@Repository("dao")
public class UserDAOImpl implements  UserDAO{
	SessionFactory sessionfactory;
	Session session;
	@Autowired
	UserDAOImpl dao;
	
	
	

	public UserDAOImpl(Session session) {
		super();
		this.session = session;
	}

	{
		session=sessionfactory.openSession();
		
	}




	@Override
	public UserDetail createuser(UserDetail user) {
		// TODO Auto-generated method stub
		session.save(user);
		return user ;
	}

}
