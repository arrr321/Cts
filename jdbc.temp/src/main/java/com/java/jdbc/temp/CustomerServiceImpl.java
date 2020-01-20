package com.java.jdbc.temp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;




@Component("service")


public class CustomerServiceImpl implements CustomerService {
	CustomerDao2 Dao2;
	


	public CustomerServiceImpl(CustomerDao2 dao2) {
		super();
		Dao2 = dao2;
	}


	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return Dao2.createCustomer(customer);
	}


	@Override
	public List<Customer> getAllCustomers() throws SQLException {
	String query  = "select(id ,first_name, last_name , email from Customer)";
	
		return null;
	}


	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
