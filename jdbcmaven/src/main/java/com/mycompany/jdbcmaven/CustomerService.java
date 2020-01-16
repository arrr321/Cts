package com.mycompany.jdbcmaven;

import java.sql.SQLException;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;

	public Customer createCustomer(String fName, String lName, String email);


}
