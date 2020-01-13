package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Test {

	public static void main(String[] args) throws IOException, PasswordException {
		
		
		UserMainCode us = new UserMainCode();
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Please enter  password : ");
		    String password = br.readLine();
		    us.checkPassword(password);
		    
		   
		    
		    	
	}
	}

	
	
