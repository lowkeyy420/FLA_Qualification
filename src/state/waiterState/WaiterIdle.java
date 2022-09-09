package state.waiterState;

import model.human.Customer;
import model.human.Human;
import model.human.Waiter;
import state.State;

public class WaiterIdle implements State {
	public Waiter waiter;
	public Customer cus;
	
	public WaiterIdle(Waiter waiter) {
		super();
		this.waiter = waiter;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterTakeOrder(waiter,cus));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(waiter.getName() +  " is idling");
	}
	
	@Override
	public void receiveS(Human human) {
		cus = (Customer) human;
		changeState();
	}


}
