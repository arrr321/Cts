package com.java.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      try {
		
    	  ApplicationContext context = new  ClassPathXmlApplicationContext("applicationcontext.xml");
    	Employee employee = context.getBean("employee", Employee.class);
    	Address address = context.getBean("add" , Address.class);
    	address.setAddressLine1("odisha");
    	address.setAddressLine2("india");
    	address.setPhoneNumber("26512551725");
    	address.setZipCode("2772");
    	employee.setAddress(address);
    	System.out.println(employee);
    	  
    	  
    	  
    	  
    	  
	} catch (Exception e) {
		e.printStackTrace();
    }
    }
    
}
