package comm.jdbc;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.print.DocFlavor.INPUT_STREAM;

public class MyConnectionFactory {

	private Connection connection;
	private static MyConnectionFactory factory = null;
	
		
	
	MyConnectionFactory() {
			super();
		}



          static MyConnectionFactory getFactoryobject()
	{
		if(factory == null)
		{
			return new MyConnectionFactory();
		
		}
		
		
		else {
			
			return factory;
			
			
			}
	}


		public Connection getMyConnection() throws IOException, SQLException
		{
			InputStream in=new FileInputStream("h2.properties");
			Properties prop=new Properties();
			prop.load(in);
			connection=DriverManager.getConnection(prop.getProperty("connection.url"),prop.getProperty("connection.user"),prop.getProperty("connection.password"));
			return connection;
		}
	}
	
	
	
	
	

