package com.example;

public class PasswordException extends Throwable {

	String args;


	public PasswordException(String args) {
		super();
		this.args = args;
	}


	@Override
	public String toString() {
		return "PasswordException [args=" + args + "]";
	}
	
	
	
	
	
}
