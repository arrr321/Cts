package comm.jdbc;

import java.sql.SQLException;

public class CustomerServiceimpl implements CustomerService{
	
	
	public CustomerDAO  dao;
	{
	 dao = new CustomerDAOImpl();
	}
	

	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		
		return dao.createCustomer(firstName, lastName, email);
	
	}
	
	
}
