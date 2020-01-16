package com.mycompany.jdbcmaven;

import java.sql.SQLException;

public class CustomerServiceimpl implements CustomerService{
	
	
	public CustomerDAO  dao;
	{
	 dao = new CustomerDAOImpl();
	}
	

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return dao.createCustomer(customer);
	
	}


	@Override
	public Customer createCustomer(String fName, String lName, String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
