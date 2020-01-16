package com.mycompany.jdbcmaven;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {

	
	public Customer createCustomer(Customer customer ) throws  SQLException;
	
	public List<Customer> findByuid(String uId) throws SQLException;

	List<Customer> findByuId(String uId) throws SQLException;

	
	
	
}
