package com.mycompany.jdbcmaven;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDAOImpl implements CustomerDAO {

	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.CustomerDAOImpl");
	private Customer customer=null;
	{
		factory=MyConnectionFactory.getFactoryobject();
		try {
			logger.info("connection started");
			connection=factory.getMyConnection();
			logger.info("got connection");

		} catch (IOException | SQLException e) {
			
			
			logger.info("connection unsucessfull");
		}
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		pStatement=connection.prepareStatement("insert into "
				+ "customer(uid,first_name,last_name,email) "
				+ "values(?,?,?,?)");
		pStatement.setString(1,customer.getuId());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	@Override
	public List<Customer> findByuId(String uId) throws SQLException {
		pStatement=connection.prepareStatement("select uid,first_name, last_name,email from ,customer where uid=?");
		pStatement.setString(1, uId);
		ResultSet rSet=pStatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(rSet.getString("uid"),
					rSet.getString("first_name"), rSet.getString("last_name"), 
					rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}
	@Override
	public List<Customer> findByuid(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}