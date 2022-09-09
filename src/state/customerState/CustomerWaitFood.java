package state.customerState;

import model.human.Customer;
import model.human.Human;
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
		System.out.println(customer.getName() +  " is waiting for food");
	}
	
	@Override
	public void receiveS(Human human) {
		changeState();
	}

}
