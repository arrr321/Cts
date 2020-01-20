package com.java.jdbc.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	CustomerService service;
	
	public static void main( String[] args ) throws NumberFormatException, IOException, SQLException
    {
		ClassPathXmlApplicationContext context = null ;
		BufferedReader br = null;
		CustomerService service = null;
		
    try {
    	br = new BufferedReader(new InputStreamReader(System.in));
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	service = context.getBean("service" ,CustomerService.class);
    	
    	
    	} catch (Exception e) {
		e.printStackTrace();
		
	}
    finally {
		context.close();
	}
	
	int choice=-1;
	String id,firstName,lastName,email=null;
	do {
		System.out.println("1. create customer.");
		System.out.println("2. display all customer.");
		System.out.println("3. find customer by uid.");
		System.out.println("4. update customer.");
		System.out.println("5. delete customer.");
		System.out.print("enter your choice>> ");
		choice=Integer.parseInt(br.readLine());
		switch (choice) {
		case 1:
			System.out.print("first name>> ");
			firstName=br.readLine();
			System.out.print("last name>> ");
			lastName=br.readLine();
			System.out.print("email>> ");
			email=br.readLine();
			String id1 = null;
			String[] arr=UUID.randomUUID().toString().split("-");
			id1=arr[0]+arr[1];
			service.createCustomer(new Customer(id1, firstName, lastName, email));
			break;
	
		
			case 2:
			List<Customer> l=service.getAllCustomers();
			System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
			l.forEach(c->{
				System.out.println(c);
			});
			break;
		case 3:
			System.out.print("uid>> ");
			id1=br.readLine();
		l=service.getCustomerById(id1);
			if(l.isEmpty())
			{
				System.out.println("customer not found");
			}
			else
			{
				System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
				l.forEach(c->{
					System.out.println(c);
				});
			}
			break;
		case 4:
			System.out.print("uid>> ");
			id1=br.readLine();
			l=service.getCustomerById(id1);
			if(l.isEmpty())
			{
				System.out.println("customer not found");
			}
			else
			{
				System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
				l.forEach(c->{
					System.out.println(c);
				});
			}
			break;
		case 5:
			System.out.println("enter id");
			String id11 = br.readLine();
			int i= service.deleteCustomer(id11);
			System.out.println(i);
			

		default:
			break;
		}	
		
	} while (choice !=0);
    
	}
    }

	

	
	
	


    

