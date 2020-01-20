package com.java.jdbc.temp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("dao2")
public class CustomerDaoImplVersion2 implements CustomerDao2 {
	
	 JdbcTemplate jdbcTemplate;

	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		String sql = "insert into customer (id , first_Name , last_Name , email) values (?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {customer.getUid(), customer.getFirstName(), customer.getLastName(), customer.getEmail()});
		
		
		
		
		
		return customer;
	}
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
public int deleteCustomer(String id) throws SQLException {
		
		String query  = "delete from customer where id= ?";
		
		return jdbcTemplate.update(query , id);
		

}
}
