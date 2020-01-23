
package com.hibernate.hibernate;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(Myimage.class)
								.addAnnotatedClass(Songs.class)
								.buildSessionFactory();
		

		Session session = factory.getCurrentSession();
		
		try {			
			
			
			
			Album al = new Album("rock");
			
			

			Songs sg = new Songs("hello");
			
			
			session.beginTransaction();
			al.add(sg);
			
			System.out.println(al);
			session.save(al);
			session.save(sg);
			session.getTransaction().commit();
			System.out.println("Done!");
		
		
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
			factory.close();
		}
	}



