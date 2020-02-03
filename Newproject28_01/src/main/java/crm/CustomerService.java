package crm;

import java.util.List;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);

	public List<Customer> getAllCustomer();

	public Customer getByid(int id);
	public void update(Customer customer);

}
