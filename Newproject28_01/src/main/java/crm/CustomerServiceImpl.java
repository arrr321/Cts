package crm;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
	
	
	CustomerDAO dao;
	{
		dao = new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer() ;
	}

	@Override
	public Customer getByid(int id) {
		// TODO Auto-generated method stub
		return dao.getByid(id);
	}

	@Override
	public void update(Customer customer) {
		dao.update(customer);
		
		
	}

}
