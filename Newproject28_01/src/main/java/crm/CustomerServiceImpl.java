package crm;

public class CustomerServiceImpl implements CustomerService {
	
	
	CustomerDAO dao;
	{
		dao = new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

}
