package com.java.Customerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      try {
	ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");
	Coach thecoach = context.getBean("thecoach", Coach.class);
    	  System.out.println(thecoach.getDailyfortune());
    	  System.out.println(thecoach.getDailyworkout());
    	  
	} catch (Exception e) {
		e.printStackTrace();
		
	}
    	
    }
    
}
