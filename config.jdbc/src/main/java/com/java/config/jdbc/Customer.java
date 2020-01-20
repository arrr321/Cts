package com.java.config.jdbc;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

	private String uid;
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	
	
	public Customer( String firstName, String lastName, String email) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}




	public Customer() {
		
	}




	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20s%-20s\n", uid,firstName,lastName,email);
	}



	public String getUid() {
		return uid;
		
	}
	
	
	
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	



}



