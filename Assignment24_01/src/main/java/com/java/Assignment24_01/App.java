package com.java.Assignment24_01;

import java.time.LocalDate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
     try {
    	 System.out.println("hello");
    	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	PostDAOImpl ps = context.getBean("impl" , PostDAOImpl.class);
    	Post p = new Post("Arun", "jshhh", LocalDate.now());
    	p.getComment().add(new Comment("hgduwg", LocalDate.now()));
    	
    	 ps.createPost(p);
    	 
    	 System.out.println("done");
    	 
    	 
    	 
    	 
    	 
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
