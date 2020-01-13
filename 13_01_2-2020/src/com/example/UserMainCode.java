package com.example;

import java.util.regex.Pattern;

public class UserMainCode {
	String password;
	static boolean Isvalid ;
	public static boolean checkPassword(String password) throws PasswordException {

	    Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	    Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
	    Pattern lowerCasePatten = Pattern.compile("[a-z ]");
	    Pattern digitCasePatten = Pattern.compile("[0-9 ]");
			
		
		    if (password.length() < 8) {
		   
		        Isvalid=false;
		        
		        throw new PasswordException("The length is less than 8");
		       
		    }
		    else  if (!specailCharPatten.matcher(password).find()) {
		     
		        Isvalid=false;
		        throw new PasswordException("The Special character not found");

		    }
		    else if (!UpperCasePatten.matcher(password).find()) {
		        Isvalid=false;
		        throw new PasswordException("The Uppser case not found");

		    }
		    else  if (!lowerCasePatten.matcher(password).find()) {
		        Isvalid=false;
		        throw new PasswordException("The lower case not found");

		    }
		    else if (!digitCasePatten.matcher(password).find()) {
		        Isvalid=false;
		        throw new PasswordException("The Number not found");
	
		
		    }
		    else
		    {
		    	
		    	System.out.println("Valid Password");
		    }
		    return Isvalid;
	}
}
