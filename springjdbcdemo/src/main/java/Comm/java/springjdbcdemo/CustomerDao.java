package Comm.java.springjdbcdemo;

import java.sql.SQLException;

public interface CustomerDao {

	
	public Customer createCustomer(Customer customer) throws SQLException;

}