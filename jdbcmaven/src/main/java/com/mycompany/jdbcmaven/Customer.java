package com.mycompany.jdbcmaven;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Customer implements  Serializable{
	
	
	private static final long serialVersionUID = -375065079056659899L;
	

	
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String uId;
	
	public Customer( String firstName, String lastName, String email, String uId) {
		super();
		this.uId= uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", uId=" + uId
				+ "]";
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}
	
	}
	
	
