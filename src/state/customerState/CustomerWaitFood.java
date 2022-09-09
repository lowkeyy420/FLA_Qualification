package state.customerState;

import model.human.Customer;
import state.State;

public class CustomerWaitFood implements State {
	public Customer customer;
	
	public CustomerWaitFood(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void changeState() {
		customer.setState(new CustomerEat(customer));
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}
}
