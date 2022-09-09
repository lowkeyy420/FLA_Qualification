package state.waiterState;

import model.human.Chef;
import model.human.Customer;
import model.human.Human;
import model.human.Waiter;
import state.State;

public class WaiterTakeOrder implements State {
	public Waiter waiter;
	public Customer cus;
	
	public WaiterTakeOrder(Waiter waiter, Customer cus) {
		super();
		this.waiter = waiter;
		this.cus = cus;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterWaitCook(waiter,cus));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(waiter.getName() +  " is taking order for " + cus.getName());
	}
	
	@Override
	public void receiveS(Human human) {
		changeState();
	}


}
