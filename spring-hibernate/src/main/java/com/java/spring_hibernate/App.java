package com.java.spring_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.java.spring_hibernate.entity.UserDetail;

public class App 
{
    public static void main( String[] args )
    {
    	try {

    		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    		UserService us = context.getBean("service", UserServiceImpl.class);
    		us.createUser(new UserDetail("arun1234" , "Arun1234" , "arun.2000@gmail.com"));
    		System.out.println("done");
    		
    		
		} catch (Exception e) {
			
		e.printStackTrace();
		}
    	
    	
    	
    	
    }
}
