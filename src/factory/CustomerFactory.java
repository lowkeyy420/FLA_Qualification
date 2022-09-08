package factory;

import model.human.Customer;

public interface CustomerFactory {
	
	public Customer makeCustomer(String name);
	
}
