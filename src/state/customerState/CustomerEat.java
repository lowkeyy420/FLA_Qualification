package state.customerState;

import model.human.Customer;
import model.human.Human;
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
		System.out.println(customer.getName() +  " is eating");
		
	}
	
	@Override
	public void receiveS(Human human) {
		changeState();
	}


}
