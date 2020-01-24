package com.java.Assignment24_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository("impl")
public class PostDAOImpl implements PostDAO {
 
	SessionFactory sessionFactory;
	Session session;
		
	
	
	public PostDAOImpl(SessionFactory factory) {
		super();
		this.sessionFactory = factory;
		session=sessionFactory.openSession();
	}


	
	@Override
	public Post createPost(Post post) {
		
		session.beginTransaction().begin();
		session.save(post);
		session.getTransaction().commit();
		
		
		return post ;
}
}