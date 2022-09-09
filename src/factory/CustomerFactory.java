package factory;

import facade.Helper;
import model.human.Customer;

public class CustomerFactory {
	
	public Customer makeCustomer(String name) {
		int tolerance = Helper.randomTolerance();
		return new Customer(name, tolerance);
	}
	
}
