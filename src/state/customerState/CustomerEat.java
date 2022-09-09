package state.customerState;

import model.human.Customer;
import state.State;

public class CustomerEat implements State{
	public Customer customer;
	
	public CustomerEat(Customer customer) {
		this.customer = customer;
	}
	
	
	@Override
	public void changeState() {
		customer.setState(new CustomerOrder(customer));
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}

}
