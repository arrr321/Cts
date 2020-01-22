package com.hibernate.hibernate;

import java.time.LocalDate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
 public static void main(String[] args) {
	
	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Myimage.class).addAnnotatedClass(Album.class).buildSessionFactory();
	 System.out.println("hello");
	 Session session = factory.getCurrentSession();
	 
	 
	try {
		
		Album tempalbum = new Album("myphoto", LocalDate.now());
		Myimage tempimage = new Myimage( "http://www.youtube.com");
		 tempalbum.setImage(tempimage);
		 session.beginTransaction();
		 System.out.println("saving album"+ tempalbum);
		 session.save(tempalbum);
		 session.getTransaction().commit();
		 System.out.println("done:::::");
		 
		
		
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	 finally
	 {
		 factory.close();
		 
	 }
	 
	 
	 
	 
}
	
	
	
	
}
