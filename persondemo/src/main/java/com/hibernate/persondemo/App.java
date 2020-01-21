package com.hibernate.persondemo;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       try {
		
    	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	   Session session = factory.openSession();
    	   /*  Person person = new Person(UUID.randomUUID().toString(), "Arun" );
    	   session.getTransaction().begin();
    	   session.save(person);
    	   session.getTransaction().commit();
    	   System.out.println("Task done");
    	   */
    	   List<Person> l=q.list();
       	for(Person p:l)
       	{
       		System.out.println(p);
       	}
    	   
    	   
    	   
	} catch (Exception e) {
		e.printStackTrace();
	}
       
       
       finally {
    	   
    	   
    	   
	}
    }
}

