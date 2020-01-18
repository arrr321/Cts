package Comm.java.springjdbcdemo;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDao dao = context.getBean("dao" , CustomerDao.class);
			Customer c =dao.createCustomer( new Customer(UUID.randomUUID().toString(),"hey" , "you" , "123@play.com") );
			System.out.println(c);
			
			
        	
        	
        	
        	
		} catch (Exception e) {
		e.printStackTrace();
		}
    }
}
