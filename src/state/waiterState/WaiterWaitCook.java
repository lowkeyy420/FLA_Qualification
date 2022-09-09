package state.waiterState;

import model.human.Chef;
import model.human.Customer;
import model.human.Human;
import model.human.Waiter;
import state.State;

public class WaiterWaitCook implements State {
	public Waiter waiter;
	public Customer cus;
	public Chef chef;
	
	public WaiterWaitCook(Waiter waiter, Customer cus) {
		super();
		this.waiter = waiter;
		this.cus = cus;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterBringOrder(waiter, cus,chef));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(waiter.getName() +  " is waiting for the cook");
	}
	
	@Override
	public void receiveS(Human human) {
		chef = (Chef) human;
		changeState();
	}

}
