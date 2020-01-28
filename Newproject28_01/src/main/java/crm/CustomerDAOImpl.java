package crm;

import javax.persistence.EntityManager;

import org.hibernate.Session;

public class CustomerDAOImpl implements CustomerDAO{
	private Session session;
	private EntityManager entityManager;
	{
	session = CustomerUtil.getMySessionFactory().openSession();
	session.getTransaction().begin();
	entityManager= session.getEntityManagerFactory().createEntityManager();
	
	
	session.getTransaction().commit();
	
	}
	
	

	@Override
	public Customer createCustomer(Customer customer) {
	entityManager.getTransaction().begin();
	entityManager.persist(customer);
	entityManager.getTransaction().commit();
	
	return customer;
	}

}
