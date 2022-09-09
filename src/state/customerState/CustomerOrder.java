package state.customerState;

import model.human.Customer;
import model.human.Human;
import state.State;

public class CustomerOrder implements State{
	public Customer customer;
	
	public CustomerOrder(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void changeState() {
		customer.setState(new CustomerWaitFood(customer));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(customer.getName() +  " is ordering");
	}
	
	@Override
	public void receiveS(Human human) {
		changeState();
	}

}
