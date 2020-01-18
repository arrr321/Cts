package Comm.java.springjdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao{
	private DataSource datasource;
	private Connection connection;
	private PreparedStatement pStatment;
	
	private static Logger logger = Logger.getLogger("Comm.java.springjdbcdemo.CustomerDaoImpl");
	
	@Autowired
	public CustomerDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

@PostConstruct
	public void init() {
		
		try {
			logger.info("Creating Connection : ");
			connection= datasource.getConnection();
			logger.info("Conection Created");
			
			
			
			
		} catch (Exception e) {
			
			
			logger.info("Connection not created");
		}
		
		
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatment = connection.prepareStatement("insert into customer(id , first_name , last_name , email) values (?,?,?,?)");
		pStatment.setString(1, customer.getUid());
		pStatment.setString(2, customer.getFirst_name());
		pStatment.setString(3, customer.getLast_name());
		pStatment.setString(4, customer.getEmail());
		pStatment.executeUpdate();
		
		
		
		
		
		return customer;
		
		
		
		
		
	}

}
