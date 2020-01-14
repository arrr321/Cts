package comm.jdbc;

import java.sql.SQLException;

public interface CustomerDAO {

	
	public Customer createCustomer(String firstname , String lastname , String email ) throws  SQLException;
	
	
	
	
}
