package com.hibernate.hibernate;

import java.io.IOException;
import java.time.LocalDate;

public class App 
{
	
	private static PersonService  personservice;
	static
	{
		personservice = new  PersonServiceImpl();
		
		
	}
	
	
	
	
    public static void main( String[] args ) throws IOException
    { 
    	
    	 Person p=personservice.createPerson(new Person("100","Ram",LocalDate.now()));
    	 System.out.println(p);
//         Person p1 = personservice.getPersonByid(100);
//    	System.out.println(p1);
//    	
    	
    	
    	
    	
}
}




