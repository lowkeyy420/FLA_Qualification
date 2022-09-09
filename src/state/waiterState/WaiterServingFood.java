package state.waiterState;

import model.human.Customer;
import model.human.Human;
import model.human.Waiter;
import state.State;

public class WaiterServingFood implements State{
	public Waiter waiter;
	public Customer cus;
	
	public WaiterServingFood(Waiter waiter, Customer cus) {
		super();
		this.waiter = waiter;
		this.cus = cus;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterIdle(waiter));
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(waiter.getName() +  " is serving food for " + cus.getName());
	}
	
	@Override
	public void receiveS(Human human) {
		changeState();
	}

}
